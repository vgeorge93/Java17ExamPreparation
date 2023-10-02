package chapter2.operators;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //Bitwise complement operator (~)
        int value = 5;
        int complementValue = ~value;
        System.out.println(value);
        System.out.println(complementValue);

        //To find the bitwise complement number multiply that number with -1 and decrease the value with 1
        System.out.println(-1 * value - 1);
        System.out.println(-1 * complementValue - 1);

        //Negation operator (-)
        double zooTemperature = 1.21;
        System.out.println(zooTemperature);
        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature);
        zooTemperature = -(-zooTemperature);
        System.out.println(zooTemperature);
//        zooTemperature = --zooTemperature;//-- is different than -(-zooTemperature) !!
//        System.out.println(zooTemperature);

        //Increment and decrement operators
        int flightNumber = 10;
        System.out.println(flightNumber); //10
        System.out.println(++flightNumber); //11 Returns the new value
        flightNumber++;//Increases the new value with 1
        System.out.println(flightNumber); //12 Returns the new value

        int planeAge = 30;
        System.out.println(planeAge); //30
        planeAge--;
        System.out.println(planeAge); //29
        System.out.println(--planeAge); //28

        //++index increments and then uses the variable.
        //index++ uses and then increments the variable.
        int index = 5;
        System.out.println(index++); //Will print 5 because first uses the value then increments
        System.out.println(index); //Will be 6 because we increase the value at line 41
        System.out.println(++index);//Will be 7 because now we first increment and then use the value

        //Arithmetic operators
        // division (/) - divides one numeric value by another
        System.out.println(9 / 3); // 3
        System.out.println(10 / 3); // 3
        System.out.println(11 / 3); // 3

        System.out.println(3.5F / 2); // 1.75
        System.out.println(5 % 2); // 1


        // modulus (%) - returns the remainder after division of one numeric value by another
        System.out.println(9 % 3); // 0
        System.out.println(10 % 3); // 1
        System.out.println(11 % 3); // 2

        System.out.println(3.5F % 2); // 1.5
        System.out.println(-4 % 2); // 0
        System.out.println(-5 % 2); // -1

        //Casting operators
        float d1 = 21.9F;
        int i1 = (int) d1;
        System.out.println(i1);//We can see that we lost 0.9 from the number
        //Overflow is when a number is so large that it will no longer fit within the
        //data type, so the system “wraps around”

        int age = 29;
        short castAge = (short) age;
        System.out.println(castAge);

        short mouse = 10;
        short hamster = 5;
        short vCapybara = 15; //Works ok
        short capybara = (short) (mouse + hamster);//As we learned on numeric promotion (see chapter 2, page 75) when adding 2 values
        //of type short, these are automatically promoted to int => we need to cast the result to short otherwise we will have an error
        //this happens only for byte, short and char

        //Casting is not necessary when working with literal values that fit into the data type
        short boots = 5 + 1; //works ok
        short boo = 5;
        short ts = 1;
        short boots2 = (short) (boo + ts); // we need to cast the expression to short
        short boots3 = (short) (5 + ts); //the same here...we need to cast the expression to short
        //When working with values/literals the compilers knows what is our intention...but when working with variables, no.
        short shortMaxValue = 32766 + 1; //Short max value = 32767 ... this works ok because the compiler see that the result will fit in a short
        short shortOverflowMaxValue = (short) (32766 + 2);//Result is > 32767 (max value of short)
        System.out.println("shortOverflowMaxValue " + shortOverflowMaxValue);
        int a = boots + boots2; //Works ok, no need to cast because the result is automatically promoted to int

        //Compound operators:
        // +=, -=, *=, /=
        int camel = 2, giraffe = 3;
        camel = camel + giraffe;
        //line 97 is the same with line 99
        camel += giraffe;

        //Compound operators does the casting automatically
        short x = 10, y = 5;
        x = (short) (x + y);
        //or we can write like this
        x += y; // casting done automatically

        //Return value of assignment operators
        long wolf = 5;
        long coyote = (wolf = 3);
        System.out.println(wolf); // 3
        System.out.println(coyote); // 3

        //Equality operators:

        //(wolf=3) does two things. First, it sets the value of the variable
        //wolf to be 3. Second, it returns a value of the assignment, which is also 3.
        boolean healthy = false;
        if (healthy = true) {
            System.out.println("Good!");
        }
        boolean bear = false;
        boolean polar = (bear = true);
        System.out.println(polar);//this will print true because, first bear values is changed from false to true and second this value is assigned to polar

        var monday = new File("schedule.txt");
        var tuesday = new File("schedule.txt");
        var wednesday = tuesday;
        System.out.println(monday == tuesday); // false monday and tuesday are two separate and distinct objects because the new keyword is used
        System.out.println(tuesday == wednesday); // true

        //Instanceof
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;
        openZoo(zooTime);

        System.out.println(null instanceof Integer); // false

        //Chapter 2 - page 87 logical operators and conditional operators
    }

    public static void openZoo(Number time) {
        if (time instanceof Integer)
            System.out.print((Integer)time + " O'clock");
        else
            System.out.print(time);
    }
}
