package com.example.shoppingservices.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoppingservices.modeloentity.Shopping;

@Repository
public interface iShopping extends JpaRepository<Shopping,Integer> {

}
