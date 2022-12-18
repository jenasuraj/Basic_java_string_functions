

//REPLACE A WORD BY ANOTHER WORD IN STRING:
import java.util.Scanner;

public class java_9_string {

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);

        String flame=name.replace('r','m');
        System.out.println(flame);

    }
}
