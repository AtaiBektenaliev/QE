package part2;

public class ItCompany extends Company{
    Integer incomeFromOutsourcing;
    Integer incomeFromOutstaffing;
    Integer expensesOfOffice;
    Integer expensesOfPayment;


    public ItCompany(String name, Employee[] employees, Integer budget, String nameLeaderOfCompany, Integer incomeFromOutsourcing, Integer incomeFromOutstaffing, Integer expensesOfOffice, Integer expensesOfPayment) {
        super(name, employees, budget, nameLeaderOfCompany);
        this.incomeFromOutsourcing = incomeFromOutsourcing;
        this.incomeFromOutstaffing = incomeFromOutstaffing;
        this.expensesOfOffice = expensesOfOffice;
        this.expensesOfPayment = expensesOfPayment;
    }

    public Integer getIncomeFromOutsourcing() {
        return incomeFromOutsourcing;
    }

    public void setIncomeFromOutsourcing(Integer incomeFromOutsourcing) {
        this.incomeFromOutsourcing = incomeFromOutsourcing;
    }

    public Integer getIncomeFromOutstaffing() {
        return incomeFromOutstaffing;
    }

    public void setIncomeFromOutstaffing(Integer incomeFromOutstaffing) {
        this.incomeFromOutstaffing = incomeFromOutstaffing;
    }

    public Integer getExpensesOfOffice() {
        return expensesOfOffice;
    }

    public void setExpensesOfOffice(Integer expensesOfOffice) {
        this.expensesOfOffice = expensesOfOffice;
    }

    public Integer getExpensesOfPayment() {
        return expensesOfPayment;
    }

    public void setExpensesOfPayment(Integer expensesOfPayment) {
        this.expensesOfPayment = expensesOfPayment;
    }
}
