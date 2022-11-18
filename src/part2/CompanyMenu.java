package part2;

import java.util.Scanner;

public class CompanyMenu {
    public static void main(String[] args) {
        Company company = new Company();
        Scanner sc = new Scanner(System.in);

        Employee employee1 = new Employee("Max", 15000, "Python developer");
        Employee employee2 = new Employee("Robert", 20000, "Manager");
        Employee employee3 = new Employee("Dimon", 27000, "C++ developer");
        Employee employee4 = new Employee("Karl", 30000, "Frontend developer");
        Employee employee5 = new Employee("Timoha", 50000, "Java developer");

        company.addEmployees(employee1);
        company.addEmployees(employee2);
        company.addEmployees(employee3);
        company.addEmployees(employee4);
        company.addEmployees(employee5);


        while(true) {
            System.out.println("Menu for working with the company: ");

            System.out.println("1) Output information about the company");
            System.out.println("2) Displaying a list of company employees");
            System.out.println("3) Displaying total expenses for employee salaries");
            System.out.println("4) Adding an employee to a company");
            System.out.println("5) Removing an employee from a company");
            System.out.println("6) Change the head of the company");
            System.out.println("7) Menu for working with employees");
            System.out.println("0) Exit from the main menu");


            int command = sc.nextInt();


            switch (command) {
                case(1):
                    System.out.println(company);
                    System.out.println();
                    break;
                case(2):
                    company.listOfEmployees();
                    System.out.println();
                    break;
                case(3):
                    company.laborCosts();
                    System.out.println();
                    break;
                case(4):
                    company.addEmployees(employee1);
                    System.out.println();
                    break;
                case(5):
                    company.removeEmployees(employee3);
                    System.out.println();
                    break;
                case(6):
                    company.changeEmployeeToDirector();
                    System.out.println();
                    break;
                case(7):
                    company.getEmployeeByName();
                    System.out.println();
                    break;
                case(0):
                    break;
                default:
                    System.out.println("Error! Please enter an item from the menu");
                    System.out.println();
            }

        }
    }
}
