package lab3;

public class Lab3 {
    public static void main(String[] args) {
//        Counter c = new Counter();
//        System.out.println("count = "+c.getCount());
//        c.increment();
//        c.increment();
//        c.increment();
//        System.out.println("count = "+c.getCount());
//        c.reset();
//        System.out.println("count = "+c.getCount());
////////////////////////////////////////////////////////////////
//        Student s = new Student(2024, "Khaled", 23, "CYN");
///////////////////////////////////////////////////////////////
        BankAccount ba = new BankAccount();
        System.out.println("Current Cash : "+ba.getAmount());
        ba.deposit(2000);
        ba.deposit(10000);
        ba.withdraw(150000);
    }
    
}
