import java.awt.*;
import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
//        Point point1 = new Point(10, 10);
//        Point point2 = point1;
//        point1.x = 20;
//        System.out.println(point2);

        String message = "Hello world " + "My Friend";
        boolean isStartWithH =  message.startsWith("h");
        int count = message.length();
        String lowerCase = message.toLowerCase();
        String upperCase = message.toUpperCase();

        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(message);
        System.out.println(count);
    }
}
