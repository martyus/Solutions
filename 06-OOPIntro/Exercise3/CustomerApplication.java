public class CustomerApplication {

    public static void main(String[] args) {
        //task 1
        Customer cust1 = new Customer("Martina");
        Customer cust2 = new Customer("John");

        System.out.println(cust1.getName());
        System.out.println("Cust1 status is " + cust1.getStatus());
        System.out.println(cust2.getName());

        Customer cust3 = new Customer("Santa", 'M');
        System.out.println("Cust3 status is " + cust3.getStatus());

        Customer cust4 = new Customer("Harry Potter", 'I');
        System.out.println("Cust4 status is " + cust4.getStatus());

        //task 2
        cust3.changeDetails("Santa Claus");
        System.out.println("Cust3 new name is " + cust3.getName());

        cust1.changeDetails("Martina Yusuf", 'I');
        System.out.println("Cust1 new name is " + cust1.getName() + " and their status is " + cust1.getStatus());

        //task3
        System.out.println("Cust1 account number " + cust1.getAccountNumber());
        System.out.println("Cust2 account number " + cust2.getAccountNumber());
        System.out.println("Cust3 account number " + cust3.getAccountNumber());
        System.out.println("Cust4 account number " + cust4.getAccountNumber());
        //reset the last used account number
        Customer.setLastUsedAccountNumber(2000);
        //create new customer objects and check their account number
        Customer customer1 = new Customer("Peppa Pig", 'I');
        System.out.println("Customer1 account number " + customer1.getAccountNumber());

        Customer  customer2 = new Customer("George Pig", 'A');
        System.out.println("Customer2 account number " + customer2.getAccountNumber());
    }
}
