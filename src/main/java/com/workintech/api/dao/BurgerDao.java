package com.workintech.api.dao;

import com.workintech.api.entity.BreadType;
import com.workintech.api.entity.Burger;

import java.util.List;

public interface BurgerDao {
    Burger save(Burger burger);
    Burger findById(int id);
    List<Burger> findAll ();
    List<Burger> findByPrice(double price);
    List<Burger> findByBreadType(BreadType breadType);
    List<Burger> findByContent(String content);
    Burger update(Burger burger);
    void remove(Burger burger);
}
