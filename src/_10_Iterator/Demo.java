package _10_Iterator;


public class Demo {
    public static void main(String[] args) {
        PancakeHouseMenu pancake = new PancakeHouseMenu();
        DinerMenu diner = new DinerMenu();

        Waitness waitness = new Waitness(pancake, diner);
        waitness.printMenu();
    }
}
