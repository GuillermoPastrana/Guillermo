//Project Agenda
package com.softtek.java.academy.redplace;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.service.ContactServiceData;
import com.softtek.java.academy.service.ContactServiceDataImpl;

public class RedPlace {
	private Contact contact;
	private Contact friend;
	
	public static void main(String[] args) {
		RedPlace p = new RedPlace();
		p.crearContactos();
		
		ContactServiceData csd = new ContactServiceDataImpl();
		Contact myContact = csd.createContact(p.contact);
		Contact myFriendContact = csd.createContact(p.friend);
		
		Contact[] contacts = csd.findAll();
		
		for(Contact c : contacts) {	
			System.out.println(c);
		}
	}
	
	public void crearContactos() {
		contact = new Contact();
		contact.setFirstname("Jose");
		contact.setLastName("Sanchez");
		contact.setMotherName("Herrera");
		contact.setEmail("jose.amititla@softtek.com");
		contact.setPhonenumber("18000800");
		
		friend = new Contact("1","Javier","Juarez","Rosas","javier.juarez@gmail.com",
				"81200100",ContactType.FRIEND);
	}
}
