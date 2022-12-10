package com.example.shoppingservices.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoppingservices.modeloentity.shoppingItems;

@Repository
public interface iShoppingItems extends JpaRepository<shoppingItems,Integer>{

}
