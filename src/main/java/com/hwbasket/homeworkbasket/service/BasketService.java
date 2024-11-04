package com.hwbasket.homeworkbasket.service;

import com.hwbasket.homeworkbasket.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {

    private final Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void add(List<Integer> items) {
        items.forEach(basket::addItem);
    }

    public List<Integer> get() {
        return basket.getItems();
    }
}
