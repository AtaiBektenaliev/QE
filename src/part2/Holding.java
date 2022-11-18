package part2;

import java.util.Scanner;

public class Holding {
    private Company[] companies;

    public Holding() {
        companies = new Company[5];
    }

    public Holding(Company[] companies) {
        this.companies = companies;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }

    public void addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if(companies[i] == null) {
                companies[i] = company;
                System.out.println(company.getName() + " was added.");
                return;
            }
        }
        System.out.println(company.getName() + " add error.");
    }

    public void showCompanies() {
        Company[] companies = this.companies;
        System.out.println("List of companies: ");

        for (int i = 0; i < companies.length; i++) {
            if(companies[i] != null) {
                System.out.println((i + 1) + " | " + companies[i].getName() +
                        " | " + companies[i].getBudget() +
                        " | " + companies[i].getNameLeaderOfCompany());
            }
        }
    }


    public void getCompanyByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name the company: ");
        String companyName = sc.nextLine();
        Company[] companies= this.companies;
        for (int i = 0; i < companies.length; i++) {
            if(companies[i] != null) {
                if(companies[i].getName().equals(companyName)) {
                    System.out.println("This name is: ");
                    System.out.println("Name of this company: " + companies[i].getName());
//                    System.out.println(": " + companies[i].getEmployees());
                    System.out.println("Company budget: " + companies[i].getBudget());
                    System.out.println("Director of company: " + companies[i].getNameLeaderOfCompany());
                }
            }

        }
    }

    public void countBudget() {
        Company[] companies = this.companies;
        double count = 0d;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null) {
                count = count + companies[i].getBudget();
            }
        }
        System.out.println("The total budget of the holding: " + count + "$");
    }

    public void deleteCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if(companies[i] == company) {
                companies[i] = null;
                System.out.println(company.getName() + " was removed.");
            }
        }
        System.out.println(company.getName() + " deletion error.");
    }
}
