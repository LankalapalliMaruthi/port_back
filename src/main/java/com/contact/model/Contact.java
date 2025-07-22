package com.contact.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "contact")
@SequenceGenerator(name = "contact_seq", sequenceName = "contact_seq", allocationSize = 1)
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_seq")
    private Long id;

    private String name;
    private String email;
    private String description;
}
