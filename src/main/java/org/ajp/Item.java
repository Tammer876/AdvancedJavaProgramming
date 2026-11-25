package org.ajp;

import jakarta.persistence.*;

@Entity
@Table(name = "items")
public class Item
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
}
