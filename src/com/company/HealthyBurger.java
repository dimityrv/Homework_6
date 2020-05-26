package com.company;

public class HealthyBurger extends Hamburger {
    private String name;
    private String rollType;
    private String meatType;
    private int basePrice;

    private int rice = 2;
    private int corn = 3;

    public HealthyBurger(String name, String rollType, String meatType, int basePrice) {
        super(name, rollType, meatType, basePrice);
    }

    public HealthyBurger() {
        this.name = "Healthy Burger";
        this.rollType = "Brown rice";
        this.meatType = "Pork";
        this.basePrice = 8;
    }

    @Override
    public void getBaseBurgerInfo() {
        System.out.println("The name of this Burger is " + getName());
        System.out.println("The buns of this burgers are made of " + getRollType());
        System.out.println("The meat in this burger is " + getMeatType());
        System.out.println("The base price if this burger is " + getBasePrice());
        System.out.println("And your total price is : ");
    }

    @Override
    public int totalPrice(int addOne, int addTwo, int addThree, int addFour, int addFive, int addSix) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne + addTwo + addThree + addFour + addFive + addSix);
    }

    @Override
    public int totalPrice(int addOne, int addTwo, int addThree, int addFour, int addFive) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne + addTwo + addThree + addFour + addFive);
    }

    @Override
    public int totalPrice(int addOne, int addTwo, int addThree, int addFour) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne + addTwo + addThree + addFour);
    }

    @Override
    public int totalPrice(int addOne, int addTwo, int addThree) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne + addTwo + addThree);
    }

    @Override
    public int totalPrice(int addOne, int addTwo) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne + addTwo);
    }

    @Override
    public int totalPrice(int addOne) {
        getBaseBurgerInfo();
        return getBasePrice() + (addOne);
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
        return basePrice;
    }

    public int getRice() {
        return rice;
    }

    public int getCorn() {
        return corn;
    }
}
