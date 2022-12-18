

    //MAKE A STRING IN WHICH SHOW THE OUTPUT FROM N WORDS UPTO LAST:

import java.sql.SQLOutput;
import java.util.Scanner;

public class java_7_string {

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println("enter the first number from where string will start");
        int n =sc.nextInt();
        System.out.println(n);
        System.out.println("enter the second number upto which string will continue");
        int s=sc.nextInt();
        System.out.println(s);
        System.out.println("the first substring syntax for nth single term is :");
        String same=name.substring(n);
        System.out.println(same);
        System.out.println("the second one including both nth term :");
        String shame=name.substring(n,s);
        System.out.println(shame);


    }
}
