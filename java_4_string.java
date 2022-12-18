
//CONVERT THE STRING INTO A LOWERCASE MODULE:

import java.util.Scanner;

public class java_4_string {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(name);
        String same=name.toLowerCase();
        System.out.println(same);

    }
}
