package com.company;

public class DeluxeBurger extends Hamburger {
    private String name;
    private String rollType;
    private String meatType;
    private int basePrice;

    private int chips;
    private int drink;

    public DeluxeBurger(String name, String rollType, String meatType, int basePrice) {
        super(name, rollType, meatType, basePrice);

    }

    public DeluxeBurger() {
        this.name = "Deluxe burger";
        this.rollType = "Family secret";
        this.meatType = "Chicken";
        this.basePrice = 10;
        this.chips = 3;
        this.drink = 2;
    }

    @Override
    public void getBaseBurgerInfo() {
        System.out.println("The name of this Burger is " + getName());
        System.out.println("The buns of this burgers are made of " + getRollType());
        System.out.println("The meat in this burger is " + getMeatType());
        System.out.println("The total price for this burger is: ");
    }

    @Override
    public int totalPrice() {
        getBaseBurgerInfo();
        return getBasePrice();
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getBasePrice() {
        return basePrice + chips + drink;
    }
}
