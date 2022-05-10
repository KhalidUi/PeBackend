package contactmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import contactmanager.model.Contacts;
import contactmanager.model.User;
import contactmanager.repository.ContactRepository;

@Controller
public class HomeController {

	
	@Autowired
	private ContactRepository repo ;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		
		User users = new User();
		users.setName("azad");
		users.setEmail("arshha@gmail.com");
		
//		Contacts contact = new Contacts ();
//		
//		users.getContacts().add(contact);
		
		repo.save(users);
		
		return "home" ;
		
		
	}
}
