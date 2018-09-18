import java.util.Scanner;

public class CalculationDemo {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);

        int i = -1;
        while(i!=0) {
            System.out.println("Enter Choice");
            System.out.println("1- for sum");
            System.out.println("2- for Multiple");
            System.out.println("0- for Exit");
            i = Integer.parseInt(consoleScanner.nextLine());

            if (i == 1 || i == 2) {
                System.out.println("Enter a value");
                Scanner a = new Scanner(System.in);

                System.out.println("Enter b value");
                Scanner b = new Scanner(System.in);
            }
            int sum = a+b

        }
}

//
//public class ScannerDemo {
//    public static void main(String[] args) {
//        Scanner consoleScanner = new Scanner(System.in);
//
//        int i = -1;
//        while(i!=0){
//            System.out.println(“Enter Choice”);
//            System.out.println(“1- for integer”);
//            System.out.println(“2- for double”);
//            System.out.println(“3- for String”);
//            System.out.println(“0- for Exit”);
//            i= Integer.parseInt(consoleScanner.nextLine());
//            if(i==1){
//                System.out.println(“Enter int value as String”);
//                String input = consoleScanner.nextLine();
//                int inputInt = Integer.parseInt(input);
//                System.out.println(“Double of what you gave is “+ inputInt*2);
//            }
//
//            if(i==2){
//                System.out.println(“Enter int value as String”);
//                String input = consoleScanner.nextLine();
//                double inputInt = Double.parseDouble(input);
//                System.out.println(“Double of what you gave is “+ inputInt*2);
//            }
//            if(i==3){
//                System.out.println(“Enter int value as String”);
//                String input = consoleScanner.nextLine();
//
//                System.out.println(“Your “+ input);