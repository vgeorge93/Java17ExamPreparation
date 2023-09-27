package chapter1.buildingblocks; //package name must be declared on the first line

import java.sql.Date;
import java.util.Random;
//import java.util.*;  //* is a wildcard, and it will import all the classes from the util package but not child packages, fields or methods
//import java.util.concurrent.atomic.*;

//java.lang is the only package that is automatically imported
//import java.lang.System; //not needed

//We cannot import 2 or more classes with the same name from different packages.
//We can import 1 class and use the other's fully qualified class name
//import java.util.Date;
//import java.sql.Date; //Compile error...java.util.Date is already defined

public class Main {
    public static void main(String[] args) {
        //The main() method is often called an entry
        //point into the program, because it is the starting point that the JVM looks for when it begins
        //running a new program.

        //Fully qualified class name
        java.util.Date date;
        java.sql.Date sqlDate;

        Park p = new Park(); //new keyword is used to create an instance of a class (see page 23 chapter1)
        System.out.println(p);

        System.out.println((new Random()).nextInt(10)); // a number 0-9
    }
}
//See page 7 from chapter 1
//public class Main2 { } - does not compile because we specified as an access modifier public keyword
//private class Main2 { } - does not compile

class Main2 {
} //is the only version that is accepted