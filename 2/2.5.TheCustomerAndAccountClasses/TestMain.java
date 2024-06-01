public class TestMain {
    public static void main(String[] args) {
        Customer testCustomer = new Customer(123,"Elias",'m');
        Account testAccount = new Account(123,testCustomer);

        System.out.println(testCustomer);
        System.out.println(testAccount);
        testAccount.deposit(103.435);
        System.out.println(testAccount.getBalance());
        System.out.println(testAccount);
        testAccount.withdraw(103.436);
        testAccount.withdraw(103.435);
        System.out.println(testAccount);
    }
}
