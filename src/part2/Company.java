package part2;

import java.util.Scanner;

public class Company {
    private String name;
    private Employee[] employees;
    private Integer budget;
    private String nameLeaderOfCompany;

    public Company(String name) {
        this.name = name;
    }

//    public Company() {
//    }

    public Company() {
        employees = new Employee[5];
    }



    public Company(String name, Integer budget, String nameLeaderOfCompany) {
        this.name = name;
        this.budget = budget;
        this.nameLeaderOfCompany = nameLeaderOfCompany;
    }

    public Company(String name, Employee[] employees, Integer budget, String nameLeaderOfCompany) {
        this.name = name;
        this.employees = employees;
        this.budget = budget;
        this.nameLeaderOfCompany = nameLeaderOfCompany;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public String getNameLeaderOfCompany() {
        return nameLeaderOfCompany;
    }

    public void setNameLeaderOfCompany(String nameLeaderOfCompany) {
        this.nameLeaderOfCompany = nameLeaderOfCompany;
    }

    public void addCompany() {

    }

    public void listOfEmployees() {
        Employee[] employees = this.employees;
        System.out.println("List of employees: ");

        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                System.out.println((i + 1) + " | " + employees[i].getName() +
                        " | " + employees[i].getPayment() +
                        " | " + employees[i].getRank());
            }
        }
    }


    public void laborCosts() {
        Employee[] employees = this.employees;
        double count = 0d;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                count = count + employees[i].getPayment();
            }
        }
        System.out.println("Total employee pay " + count + "$");
    }


    public void addEmployees(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null) {
                employees[i] = employee;
                System.out.println(employee.getName() + " employee was added.");
                return;
            }
        }
        System.out.println(employee.getName() + " employee add error.");
    }

    public void removeEmployees(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == employee) {
                employees[i] = null;
                System.out.println(employee.getName() + " employee was fired.");
                return;
            }
        }
        System.out.println(employee.getName() + " employee firing error.");
    }


    public void changeEmployeeToDirector() {

    }

    public void showCompany() {}











    public void getEmployeeByName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name the employee: ");
        String employeeName = sc.nextLine();
        Employee[] employees = this.employees;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] != null) {
                if(employees[i].getName().equals(employeeName)) {
                    System.out.println("Such an employee is: ");
                    System.out.println("His name : " + employees[i].getName());
                    System.out.println("His payment : " + employees[i].getPayment());
                    System.out.println("His position : " + employees[i].getRank());
                }
            }
        }
        System.out.println("There is no such employee.");
    }
}
