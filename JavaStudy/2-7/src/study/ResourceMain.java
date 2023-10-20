package study;
import java.util.ResourceBundle;

public class ResourceMain {

 public static void main(String args[]) {
 ResourceBundle bundle = ResourceBundle.getBundle("test");
 String value = bundle.getString("5432");
 System.out.println(value);
 }
}
