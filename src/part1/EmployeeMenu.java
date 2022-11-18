package part1;

import java.util.Scanner;

public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee("Max", 15000, "Python developer");


        while (true) {
            System.out.println("1) Output information about the employee");
            System.out.println("0) Exit from the main menu");

            int command = sc.nextInt();

            if(command == 1) {
                System.out.println(employee);
            } else if (command == 0) {
                break;
            }else {
                System.out.println("Error! Please enter an item from the menu");
            }
        }
    }


}
