

//CONVERT THE STRING INTO UPPER CASE MODULE:
//import java.sql.SQLOutput;
import java.util.Scanner;
public class java_5_string {

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);

        //CONVERT NOW
        String same=name.toUpperCase();
        System.out.println(same);
        //DONE...

    }
}
