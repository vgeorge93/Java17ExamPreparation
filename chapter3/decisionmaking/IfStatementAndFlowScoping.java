package chapter3.decisionmaking;

public class IfStatementAndFlowScoping {
    public static void main(String[] args) {
        int ticketsTaken = 0;
        if (ticketsTaken > 1)
            System.out.println("Nr of tickets taken is greater than 1");
        System.out.println("Print message outside of if statement");
        //We might think that no message will be displayed here because ticketsTaken is not > than 0 but the second message will be printed

        printOnlyIntegers(5);
    }

    void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.print(data.compareTo(5));
        }
    }

    void compareIntegersJavaPatternMatching(Number number) {
        if (number instanceof Integer data) {
            System.out.print(data.compareTo(5));
        }
    }

    void compareIntegersJavaPatternMatchingReassignVariable(Number number) {
        if (number instanceof Integer data) {
            data = 10;
        }
    }

    void compareIntegersJavaPatternMatchingBlockReassignVariable(Number number) {
        if (number instanceof final Integer data) {
            //data = 10; //Because data was made final we have here a compilation error...in this way we prevent reassigning the variable
            //see chapter 3 page 107 reassigning pattern variables
        }
    }

    void filterWithPatternMatching(Number number) {
        if (number instanceof final Integer data && data.compareTo(5) > 0) {
            System.out.print(data);
        }
    }

    //Flow scoping
    //printIntegersOrNumbersGreaterThan5 does not compile because we have that || and the compiler doesn't know if the variable is of type Integer
    //If we replace || with && then it will work ok
//    void printIntegersOrNumbersGreaterThan5(Number number) {
//        if(number instanceof Integer data || data.compareTo(5)>0)
//            System.out.print(data);
//    }

    //printIntegerTwice does not compile because data.intValue() is of type Integer only inside the if...outside we don't know the type of data.
    void printIntegerTwice(Number number) {
        if (number instanceof Integer data)
            System.out.print(data.intValue());
        //System.out.print(data.intValue()); // DOES NOT COMPILE
    }

    //data stays in scope
    static void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.print(data.intValue());
    }

    int printOnlyIntegers2(Number number) {
        if (!(number instanceof Integer data)) {
            //return data.intValue(); //error cannot resolve symbol data
            return -1;
        } else {
            System.out.print(data.intValue());
            return 1;
        }
    }
}
