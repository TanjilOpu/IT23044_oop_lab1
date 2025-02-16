
package javaapplication34;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Assignment31 {
    public static void main(String[] args) {
        LocalDateTime currentdate=LocalDateTime.now();
        DateTimeFormatter formate=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentdate.format(formate);
        System.out.println("current date and time "+formattedDateTime);
        
    }
    
}
