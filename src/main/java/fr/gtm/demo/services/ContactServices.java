package fr.gtm.demo.services;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import fr.gtm.demo.dao.ContactDAO;
import fr.gtm.demo.entities.Civilite;
import fr.gtm.demo.entities.Contact;

public class ContactServices {
	private ContactDAO dao;
	
	public ContactServices(EntityManagerFactory emf) {
		dao = new ContactDAO(emf);
	}
	
	public List<Contact> getAllContact(){
		return dao.getAllContact();
	}
	
	public List<Contact> getContactByCivilite(Civilite civilite){
		return dao.getContactByCivilite(civilite);
	}
	
	public Contact getContactById(long id) {
		return dao.getContactById(id);
	}
	
	public void create(Contact contact) {
		dao.create(contact);
	}
	
	public void delete(Contact contact) {
		dao.delete(contact);
	}
	
	public void update(Contact contact) {
		dao.update(contact);
	}
	
	public List<Contact> getContactByAdresseNotNull(){
		return dao.getContactByAdresseNotNull();
	}
	
}
