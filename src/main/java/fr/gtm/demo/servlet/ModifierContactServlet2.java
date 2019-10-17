package fr.gtm.demo.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.gtm.demo.Constantes;
import fr.gtm.demo.entities.Civilite;
import fr.gtm.demo.entities.Contact;
import fr.gtm.demo.services.ContactServices;

/**
 * Servlet implementation class SupprimerContactServlet
 */
@WebServlet("/ModifierContactServlet2")
public class ModifierContactServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactServices service = (ContactServices) getServletContext().getAttribute(Constantes.CONTACT_SERVICES);
		String page = "";
		
		Long id = Long.valueOf(request.getParameter("id"));
		Contact contact = service.getContactById(id);
		
		contact.setNom(request.getParameter("nom"));
		
		contact.setPrenom(request.getParameter("prenom"));
		
		Enum<Civilite> civ = Civilite.valueOf(request.getParameter("civ"));
		Civilite civ2 = (Civilite) civ;
		contact.setCivilite(civ2);
		
		service.update(contact);
		
		List<Contact> contacts = service.getAllContact();
		request.setAttribute("contacts", contacts);
		page = "/show-contacts.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}