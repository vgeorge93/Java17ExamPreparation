package chapter3.decisionmaking;

public class SwitchStatements {
    public static void main(String[] args) {
        int animal = 0;
        switch (animal) {
            case 1, 2: //starting with java 14 cases can be combined
                System.out.print("Lion");
            case 3:
                System.out.print("Tiger");
        }

        switch (animal) {
            case 1:
            case 2: //Prior to java 14 the equivalent of the above switch would be this one
                System.out.print("Lion");
            case 3:
                System.out.print("Tiger");
        }

        switch (animal) {
        } //It's a valid switch...a switch doesn't need to contain a case
        printSeason(2);//If we are not using a break in our code, when called with month = 2, then the output will be WinterSpringUnknownSummerFall ...
        //it goes and checks if the case matches our value then prints winter and then executes everything that is below
        printSeason(5); //If we are not using a break, when called with month = 5 then this method will output: SpringUnknownSummerFall
        //It checks and if our month value doesn't match the first case then it goes on the second one without printing winter...now it checks and it will execute the code that is under
        //the second case and then it will execute everything that is below because we don't have a break
        //For example when month = 5 if we add a break in the default then it will print:Spring Unknown
        //see page 113 from chapter 3

        System.out.println("switch expression where there is no need for break");
        printSeasonSwitchExpression(2);
        System.out.println("Switch with return type: " + printSeasonSwitchExpressionReturnTypeInt(2));

        int number = 2;
        String message = switch (number) {
            case 1:
                yield "Got a 1";
            case 2:
                yield "Got a 2";
            default:
                yield "More than 2";
        };
        System.out.println("Message: " + message);


    }

    //without the break this method will print WinterSpringUnknownSummerFall
    public static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3:
                System.out.println("Winter");
            case 4, 5, 6:
                System.out.println("Spring");
            default:
                System.out.println("Unknown");
                //break;
            case 7, 8, 9:
                System.out.println("Summer");
            case 10, 11, 12:
                System.out.println("Fall");
        }
    }

    public static void printSeasonSwitchExpression(int month) {
        switch (month) {
            case 1, 2, 3 -> System.out.println("Winter");
            case 4, 5, 6 -> System.out.println("Spring");
            default -> System.out.println("Unknown");
            case 7, 8, 9 -> System.out.println("Summer");
            case 10, 11, 12 -> System.out.println("Fall");
        }
        //There is no need for a break in this new switch expression
    }

    public static String printSeasonSwitchExpressionReturnTypeInt(int month) {
        return switch (month) {
            case 1, 2, 3 -> "Winter";
            case 4, 5, 6 -> "Spring";
            default -> "Unknown";
            case 7, 8, 9 -> "Summer";
            case 10, 11, 12 -> "Fall";
        };
        //There is no need for a break in this new switch expression
        //If we return a value from a switch then we need to add ; at the end of the switch
    }

    final int getCookies() {
        return 4;
    }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
                //case apples: // DOES NOT COMPILE
                //case getCookies(): // DOES NOT COMPILE
                //case cookies : // DOES NOT COMPILE
            case 3 * 5:
        }
    }

    enum Season {WINTER, SPRING, SUMMER, FALL, TEST}

    String getWeather(Season value) {
        return switch (value) {
            case WINTER -> "Coled";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
            //If we add a new value in our enum then we will get an error if we miss the default, and then we will need to modify the switch statement
            //we can't use a value that is not in the enum
            default -> "Test";
        };
    }

    //Here we can see the difference between yield and return with ->
    String getWeatherV2(Season value) {
        return switch (value) {
            case WINTER:
                yield "Coled";
            case SPRING:
                yield "Rainy";
            case SUMMER:
                yield "Hot";
            case FALL:
                yield "Warm";
                //If we add a new value in our enum then we will get an error if we miss the default, and then we will need to modify the switch statement
                //we can't use a value that is not in the enum
            default:
                yield "Test";
        };
    }
}
