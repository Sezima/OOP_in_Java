package Banks_class;

import java.util.Scanner;

public class Banc {
        static String name = "Optima Bank";
        static String address = "st.Ai 520";
        int year = 2015;


        public static void call(){
            System.out.println(name);
            System.out.println(address);

        }

        public void WorkYear(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the present year: ");
            int nowYear = sc.nextInt();
            System.out.println("the company has been in existence for " + (nowYear - year) + " years");
        }

}
