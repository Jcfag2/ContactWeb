package fr.gtm.demo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import fr.gtm.demo.entities.Civilite;
import fr.gtm.demo.entities.Contact;
public class ContactDAO {
	private EntityManagerFactory emf;

	public ContactDAO(EntityManagerFactory emf) {
		super();
		this.emf = emf;
	}

	public void create(Contact contact) {
		// 1 - récupèrer un EntityManager (connexion)
		EntityManager em = emf.createEntityManager();
		// 2 - démarrer une transaction
		em.getTransaction().begin();
		// 3 - sauvegarder l'entité en base
		em.persist(contact);
		// 4 - Valider (commit) la transaction
		em.getTransaction().commit();
		// 5 - fermer l'EntityManager (connexion)
		em.close();
	}
	
	public Contact getContactById(long id) {
		EntityManager em = emf.createEntityManager();
		Contact contact = em.find(Contact.class, id);
		em.close();
		return contact;
	}
	
	public void delete(Contact contact) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Contact c1 = em.find(Contact.class, contact.getId());
		em.remove(c1);
		
		em.getTransaction().commit();
		em.close();
		
	}
	
	public void update(Contact contact) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(contact);
		
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Contact> getContactByCivilite(Civilite civilite){
		String sql = "SELECT c FROM Contact c WHERE c.civilite= :civilite";
		EntityManager em = emf.createEntityManager();
		List<Contact> contacts = em.createQuery(sql, Contact.class).setParameter("civilite", civilite).getResultList();
		em.close();
		return contacts;
	}
	
	public List<Contact> getAllContact(){
		String sql = "SELECT * FROM Contact c";
		EntityManager em = emf.createEntityManager();
		List<Contact> contacts = em.createQuery(sql, Contact.class).getResultList();
		em.close();
		return contacts;
	}
	
	public List<Contact> getContactByNom(String nom){
		EntityManager em = emf.createEntityManager();

		List<Contact> contacts = em.createNamedQuery("Contact.getByNom", Contact.class).setParameter("nom", nom+"%").getResultList();
		em.close();
		return contacts;
	}
	
	public List<Contact> getContactByAdresseNotNull(){
		EntityManager em = emf.createEntityManager();

		List<Contact> contacts = em.createNamedQuery("Contact.getAdresseNotEmpty", Contact.class).getResultList();
		em.close();
		return contacts;
	}

	
}
