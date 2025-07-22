//package com.contact.controller;
//
//import com.contact.model.Contact;
//import com.contact.repo.ContactRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@CrossOrigin(origins = "*") // Allow React requests
//@RestController
//@RequestMapping("/api/contact")
//public class ContactController {
//
//    @Autowired
//    private ContactRepo repository;
//
//    @PostMapping
//    public Contact saveContact(@RequestBody Contact contact) {
//        return repository.save(contact);
//    }
//}
package com.contact.controller;

import com.contact.model.Contact;
import com.contact.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "https://port-front-five.vercel.app/") // ✅ Restrict to your frontend
@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactRepo repository;

    // Save contact form data
    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {
        return repository.save(contact);
    }

    // View all contact submissions
    @GetMapping
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }
}
