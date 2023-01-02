package com.contact.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;
import com.contact.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list =List.of(
			new Contact(1L,"suresh@gmail.com","Suresh",1001L),
			new Contact(2L,"ramesh@gmail.com","Ramesh",1001L),
			new Contact(3L,"gitesh@gmail.com","Gitesh",1002L),
			new Contact(4L,"mahesh@gmail.com","Mahesh",1002L),
			new Contact(5L,"nilesh@gmail.com","Nilesh",1003L),
			new Contact(6L,"ganesh@gmail.com","Ganesh",1003L),
			new Contact(7L,"harry@gmail.com","Harry",1001L)
			);
	
	
	@Override
	public List<Contact> getContactsofuser(Long userId) {
		
		return list.stream().filter(contact -> contact.getUserid().equals(userId)).collect(Collectors.toList());
	}

}
