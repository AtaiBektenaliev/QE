package part2;

public class Employee {
    private String name;
    private Integer payment;
    private String rank;

    public Employee(String name, Integer payment, String rank) {
        this.name = name;
        this.payment = payment;
        this.rank = rank;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayment() {
        return payment;
    }

    public void setPayment(Integer payment) {
        this.payment = payment;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
