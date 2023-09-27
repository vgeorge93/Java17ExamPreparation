package chapter1.buildingblocks;

public class Park {

    //Rules for the constructor: (see page 23 chapter1)
    //Constructor name matches the name of the class
    //Constructor doesn't have a return type

    //The purpose of a constructor is to initialize fields, although you can put any code in there
    public Park() {
        System.out.println("Class park constructor");
    }

    //Method name 'Park' is the same as its class name
    //This is not a constructor and this will not be called when we write new Park()
    public void Park() {
        System.out.print("Method with the same name as the class");
    }
}
