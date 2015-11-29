package _12_State;

import _12_State.context.SellerMachine;

public class Demo {
    public static void main(String[] args) {
        SellerMachine seller = new SellerMachine(5);

        seller.eject();
        System.out.println("\n");

        seller.turnCrank();
        System.out.println("\n");

        seller.insert();
        seller.eject();
        System.out.println("\n");

        seller.insert();
        seller.turnCrank();
        System.out.println("\n");

        seller.insert();
        seller.turnCrank();
        System.out.println("\n");

        seller.insert();
        seller.turnCrank();
        System.out.println("\n");

        seller.insert();
        seller.turnCrank();
        System.out.println("\n");

        seller.insert();
        seller.turnCrank();
        System.out.println("\n");

        seller.insert();
        seller.turnCrank();
        System.out.println("\n");

    }
}
