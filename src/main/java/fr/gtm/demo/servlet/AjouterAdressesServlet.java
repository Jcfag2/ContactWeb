package fr.gtm.demo.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.gtm.demo.Constantes;
import fr.gtm.demo.entities.Adresse;
import fr.gtm.demo.entities.Contact;
import fr.gtm.demo.services.ContactServices;


@WebServlet("/AjouterAdressesServlet")
public class AjouterAdressesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactServices service = (ContactServices) getServletContext().getAttribute(Constantes.CONTACT_SERVICES);
		String page = "/show-adresses.jsp";
		
		Long id = Long.valueOf(request.getParameter("id2"));
		String rue = request.getParameter("rue");
		String codePostal = request.getParameter("cp");
		String ville = request.getParameter("ville");
		String pays = request.getParameter("pays");
		
		Adresse adresse = new Adresse(rue, codePostal, ville, pays);
		
		service.createAdresse(adresse);
		
		Contact contact = service.getContactById(id);
		Set<Adresse> adresse2 = contact.getAdresse();
		adresse2.add(adresse);
		contact.setAdresses(adresse2);
		service.update(contact);
		
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}