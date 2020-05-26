package com.company;

public class Hamburger {
    private String name;
    private String rollType;
    private String meatType;
    private int basePrice;

    private int lettuce = 1;
    private int onions = 3;
    private int tomatoes = 2;
    private int carrots = 4;

    public Hamburger(String name, String rollType, String meatType, int basePrice) {
        this.name = name;
        this.rollType = rollType;
        this.meatType = meatType;
        this.basePrice = basePrice;
    }

    public Hamburger() {
        this.name = "Base Burger";
        this.rollType = "Bread";
        this.meatType = "Beef";
        this.basePrice = 5;
    }

    public void getBaseBurgerInfo() {
        System.out.println("The name of this Burger is " + getName());
        System.out.println("The buns of this burgers are made of " + getRollType());
        System.out.println("The meat in this burger is " + getMeatType());
        System.out.println("The base price if this burger is " + getBasePrice());
        System.out.println("And your total price is : ");
    }

    public int totalPrice(int addOne, int addTwo, int addThree, int addFour, int addFive, int addSix) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne + addTwo + addThree + addFour + 0 + 0);
    }

    public int totalPrice(int addOne, int addTwo, int addThree, int addFour, int addFive) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne + addTwo + addThree + addFour + 0);
    }

    public int totalPrice(int addOne, int addTwo, int addThree, int addFour) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne + addTwo + addThree + addFour);
    }
    public int totalPrice(int addOne, int addTwo, int addThree) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne + addTwo + addThree );
    }
    public int totalPrice(int addOne, int addTwo) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne + addTwo);
    }
    public int totalPrice(int addOne) {
        getBaseBurgerInfo();
        return getBasePrice()+ (addOne);
    }
    public int totalPrice() {
        getBaseBurgerInfo();
        return getBasePrice();
    }


    private String getName() {
        return name;
    }

    private String getRollType() {
        return rollType;
    }

    private String getMeatType() {
        return meatType;
    }

    private int getBasePrice() {
        return basePrice;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getOnions() {
        return onions;
    }

    public int getTomatoes() {
        return tomatoes;
    }

    public int getCarrots() {
        return carrots;
    }
}
