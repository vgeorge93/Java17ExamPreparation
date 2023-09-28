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

        double apple = Double.parseDouble("200.99");
        System.out.println((byte) apple); // -56
        System.out.println((int) apple); // 200
        System.out.println(apple); // 200.99

        Double apple2 = Double.valueOf("200.99");
        System.out.println(apple2.byteValue()); // -56
        System.out.println(apple2.intValue()); // 200
        System.out.println(apple2.doubleValue()); // 200.99

        //Defining text blocks - added with java 15
        String eyeTest = "\"Java Study Guide\"\n by Scott & Jeanne";
        System.out.println(eyeTest);

        String pyramid = """
            * \
           * *
          * * *
          """; //In this case \ omits a new line => *  * * will be on the same line
        System.out.print(pyramid);
        //String block = """doe""";//Does not compile because we don't have a new line after the """
        String block0 = """
                doe
                """; //Valid block
        String block1 = """
                doe"""; //Valid block (see difference between this and block0)
        String block2 = """
                doe \n
                deer
                """; // block2 has 4 line because the last 3 """ are on a different line (1 line doe, 1 empty line, 1 line with deer, 1 empty line)
        System.out.println(block2);

        String block = """
            "doe\"\"\"
            \"deer\"""
            """;
        System.out.println(block);

        //String class = "";//Invalid name because class is a reserved keyword
        String Class = "";//Works because java is case-sensitive ... but it's not ok to use reserved keywords even if change the case
        //String _ = "";//Invalid
        String _variableName = "";//Valid
    }
}
//See page 7 from chapter 1
//public class Main2 { } - does not compile because we specified as an access modifier public keyword
//private class Main2 { } - does not compile

class Main2 {
} //is the only version that is accepted