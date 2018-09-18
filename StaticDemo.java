public class StaticDemo {
    private static int objectCounter = 0;

    public static  int numberOfStudent = 10;
    private String className = "SelBoot";

    public StaticDemo(){
        StaticDemo.objectCounter++;
    }
    public static  void  staticPrint() {

        System.out.println("Coming from Static Print");
    }

    public void print(){
        System.out.println(className);
    }
    public static void printCount(){
        System.out.println("Total count is"+objectCounter);
    }
}
