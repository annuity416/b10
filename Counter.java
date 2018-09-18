public class Counter {
    private static int staticCounter = 0;
    private int counter =0;

    public static void incrementStatic(){
        staticCounter++;
    }

    public void incrementCounter(){
        staticCounter++;
        counter++;

    }

    public void printCounter(){
        System.out.println("Static Counter is " + staticCounter);
        System.out.println("Non Static Counter is " + counter);
    }
}
