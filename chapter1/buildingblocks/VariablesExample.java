package chapter1.buildingblocks;

public class VariablesExample {
    static int classVariable;
    //var classVar = 10; //var is only a local variable, not a class variable

    public VariablesExample(int /*var - compile error*/ a) {
        classVariable = a;
    }

    public static void main(String[] args) {
        System.out.print(classVariable);//It's not necessary to initialize a class variable because it has a default value
        int localVariable;
        //System.out.print(localVariable);//It NECESSARY to initialize a class variable -- compile error

        //Valid ways to write the name of variables
        int variableName = 9__8;
        int variableName2 = 9___8;
        int $variableName3$ = 1; //Only currencies are accepted
        int vatName1 = 1;

        //Invalid ways to write the name of variables
        //int 1varName = 1; //A variable name can't start with a digit
        //int vat@Name = 1; //No special characters

        //Invalid ways to initialize a variable:
        //var x = _10; //Cannot start with _
        //var x = 10_;//Cannot end with _
        //var x = 10_.0;//Cannot place _ in front of .
        //var x = 10.0_;
        //var x = 10._2;//Cannot place _ after the .

        {
            int hairs = 3_000_0;
            System.out.print(hairs);
        }
        //System.out.print(hairs);Compile error because hairs is not visible outside {}

        //---> var keyword <--- Chapter 1: page 43

        //NOTE: Is not a reserved keyword ... meaning that you can name a variable with var
        //var var = 2; //Valid
        int var = 10; //Valid
        int Var = 100; //Valid

        //var fall = 2, autumn = 2; //Invalid
        int fall = 2, autumn = 2; //You can do this in java but with a var you can't do the same thing
        var fall2 = 2;
        var autumn2 = 2;

        //A var cannot be initialized with a null value without a type, but it can be
        //assigned a null value later if the underlying type is not a primitive.
        var name = ""; //You can initialize with empty String, but you can't initialize with null
        //var varName = null; //Cannot infer type: variable initializer is 'null'

        var park = new Park();//var can be an Object()
        park = null; //Valid

        var age = 30;
        //age = null;//Invalid. Because age is an int (primitive)

        System.out.print(sum(fall, age));//var can be passed as a parameter when a method is called
    }

    public static int sum(int x, /*var -- compile error*/int y) {
        return x + y;
    }
}


//Java has 8 primitives: boolean, byte, short, int, long, float, double, char
//byte, short, int, long = integer values, no decimals

//String is not a primitive, it's an object = reference type

//Object = has a method()
//String test = null; -> an object can be initialized with null...a primitive NO.
//test.length()