package fr.gtm.demo.servlet;

import java.io.IOException;
import java.util.HashSet;
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


@WebServlet("/AfficherAdressesServlet")
public class AfficherAdressesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactServices service = (ContactServices) getServletContext().getAttribute(Constantes.CONTACT_SERVICES);
		String page = "";
			Long id = Long.valueOf(request.getParameter("id"));
			Set<Adresse> adresse = service.getAdresseByContactId(id);
			Contact contact = service.getContactById(id);
			
			request.setAttribute("contact", contact);
			request.setAttribute("adresse", adresse);
			page = "/show-adresses.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
