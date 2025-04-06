package polimorfismo;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<employee> list = new ArrayList<>();
        System.out.println("enter the number of employes: ");
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            System.out.println("Employye "+ i +" data: ");
            System.out.print("Outsourced y/n?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours : ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employee emp = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
                list.add(emp);
            }





        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();

    }
}
