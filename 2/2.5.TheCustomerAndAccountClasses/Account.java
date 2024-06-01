public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer+" balance=$"+String.format("%.2f",balance);
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount) {
        if(balance<amount) {
            System.out.println("Amount withdrawn exceeds the current balance!");
        } else {
            balance-=amount;
            System.out.println("Successful operation!");
        }
    }
}
