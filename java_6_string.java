
//MAKE A STRING BY TAKING INPUT INCLUDING SPACES, BUT DON'T SHOW THE OUTPUT WITH SPACES.
import java.util.Scanner;

public class java_6_string {
public static void main(String[] args)
{

    Scanner sc=new Scanner(System.in);
    String name= sc.nextLine();
    System.out.println(name);
    //DO IT NOW;
    String b=name.trim();
    System.out.println(b);
    //DONE//

}
}
