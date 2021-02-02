package com.ba.solid.singleresponsibilityprinciple.badexample;

public class Restaurant {

    private void addRestaurant(){

    }

    private void getRestaurantById(Long id){

    }

    //Burada bunun kullanılması yanlış cunku hesaplama ile ilgili bir metot ve yeri burası olmamalı.
    private Long calculateDailyPrice(){
        Long id = 5L;
       return id;
    }
}
