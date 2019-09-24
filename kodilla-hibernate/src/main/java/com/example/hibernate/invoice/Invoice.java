package com.example.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private int id;

    @NotNull
    @Column(name = "NUMBER")
    private String name;

    @Column(name = "ITEMS")
    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            targetEntity = Item.class
    )
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(@NotNull String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }
}
