package part1;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Holding holding = new Holding();

        Scanner sc = new Scanner(System.in);

        Company company1 = new Company("RoboTech Inc.", 1000000, "Rick Robinson");
        Company company2 = new Company("HiTech elec.", 1200000, "Kevin Largo");
        Company company3 = new Company("IT Team", 960000, "Danil Andre");
        Company company4 = new Company("TechnoLizer", 900000, "Kiril Kovalchuk");
        Company company5 = new Company("CyberPC", 1500000, "Grik Joi");

        holding.addCompany(company2);
        holding.addCompany(company3);
        holding.addCompany(company4);
        holding.addCompany(company5);

        while (true) {
            System.out.println("Main menu for working with a holding: ");

            System.out.println("1) Displaying a list of companies in a holding");
            System.out.println("2) Conclusion of the general budget of the holding");
            System.out.println("3) Displaying a list of companies in the holding with the number of jobs and already working employees");
            System.out.println("4) Adding a company to a holding");
            System.out.println("5) Removing a company from a holding");
            System.out.println("6) Menu for working with the company");
            System.out.println("0) Exit from the main menu");


            int command = sc.nextInt();

            switch(command) {
                case(1):
                    holding.showCompanies();
                    System.out.println();
                    break;
                case(2):
                    holding.countBudget();
                    System.out.println();
                    break;
                case(3):
                    Employee[] employee = new Employee[5];
                    holding.countWorkplaces(employee);
                    System.out.println();
                    break;
                case(4):
                    holding.addCompany(company1);
                    System.out.println();
                    break;
                case(5):
                    holding.deleteCompany(company3);
                    System.out.println();
                    break;
                case(6):
                    holding.getCompanyByName();
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
