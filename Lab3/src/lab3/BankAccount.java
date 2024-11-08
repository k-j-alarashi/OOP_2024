package lab3;

public class BankAccount {

    private int id;
    private String name;
    private double amount;

    public BankAccount() {
        id = 1;
        name = null;
        amount = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double amount) {
        this.amount = this.amount + amount;
        System.out.println("==============================");
        System.out.println("Deposit : " + amount);
        System.out.println("Current Cash : " + this.amount);
        System.out.println("==============================");
    }

    public void withdraw(double amount) {
        if (this.amount > 0 && this.amount >= amount) {
            System.out.println("==============================");
            System.out.println("Withdraw : " + amount);
            System.out.println("Current Cash : " + this.amount);
            System.out.println("==============================");
        } else {
            System.out.println("==============================");
            System.out.println("Sorry You Don't Have Enough Cash ..!");
            System.out.println("==============================");
        }
    }
}
