package part2;

import java.util.Scanner;

public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        while (true) {
            System.out.println("1) Output information about the employee");
            System.out.println("0) Exit from the main menu");

            int command = sc.nextInt();

            if(command == 1) {

            } else if (command == 0) {
                break;
            }else {
                System.out.println("Error! Please enter an item from the menu");
            }
        }
    }


}
