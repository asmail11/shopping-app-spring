package com.shoppingapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingapp.modal.Shopping;

public interface ShoppingDao extends JpaRepository<Shopping, Long> {

}
