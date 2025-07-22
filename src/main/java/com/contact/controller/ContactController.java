package com.contact.controller;

import com.contact.model.Contact;
import com.contact.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") // Allow React requests
@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactRepo repository;

    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {
        return repository.save(contact);
    }
}
