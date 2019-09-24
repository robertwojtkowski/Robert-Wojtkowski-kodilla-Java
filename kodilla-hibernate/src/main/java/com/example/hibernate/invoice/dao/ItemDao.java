package com.example.hibernate.invoice.dao;

import com.example.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemDao extends CrudRepository<Item, Integer> {
}
