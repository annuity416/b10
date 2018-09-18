import java.util.Scanner;

public class FindMiddle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();

        int position;
        int length;

        if(name.length()%2==0)
        {
            position=name.length()/2 -1;
            length=2;
        }
    else
        {
        position=name.length()/2;
        length=1;
    }
        System.out.println(name.substring(position, position+length));
}
}

