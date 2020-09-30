package employee;

import java.util.Scanner;

public class PayrollInterface {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Employee emp;
        String prompt;
        String name;
        int type;
        double rate;
        int hours;
        emp = new Employee();
        do {
            while (true) {
                //get the name and break if blank
                System.out.print("Enter name: " + emp.getNameRules());
                name = s.nextLine();
                if (!emp.setName(name)) {
                    break;
                }
            }

            while (true) {
                System.out.print("Enter type: " + emp.getTypeRules());
                type = s.nextInt();
                if (emp.setType(type)) {
                    break;
                }
            }

            while (true) {
                System.out.print("Enter hours: " + emp.getHourRules());
                hours = s.nextInt();
                if (emp.setHours(hours)) {
                    break;
                }
            }

            while (true) {
                System.out.print("Enter rate: " + emp.getRateRules());
                rate = s.nextDouble();
                if (emp.setRate(rate)) {
                    break;
                }
            }
            System.out.println("-----------------------");
            System.out.println("Pay this week for " + emp.getName());
            System.out.println("$" + emp.getPay());
            
            System.out.print("\nEnter another? y or n > ");
            prompt = s.next();
            s.nextLine();//clear scanner for next employee
        } while (prompt.equals("y") || prompt.equals("Y"));
        System.out.println("Goodbye");
    }

}
