package org.skyrim.pattern.structual.decorator;

public class Client {
    public static void main(String[] args) {
//        点炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.cost() + "元");
        System.out.println("----------");
//        炒饭中加个蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
        System.out.println("----------");
//        再加个蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
        System.out.println("----------");

//        再加个蛋
        food = new Bacon(food);
        System.out.println(food.getDesc() + " " + food.cost() + "元");
    }
}
