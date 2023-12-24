import java.util.*;
public class Main {
    public static void browse_all(){
        Product_DB stock = new Product_DB();
        stock.setProductsInfo();
        for(int i = 0; i < stock.available.size(); i++){
            System.out.println("Category: "+stock.available.get(i).category);
            System.out.println("Name: " + stock.available.get(i).name);
            System.out.println("Price: " +  "$" + stock.available.get(i).price);
            System.out.println("Vendor: "+stock.available.get(i).vendor);
            System.out.println("Available Quantity: "+stock.available.get(i).quantity);
        }
    }
    public static void display(Customer c){
        System.out.println(c.name);
        System.out.println(c.balance);
        System.out.println(c.address);
        System.out.println(c.email);
        System.out.println(c.mobile);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Ordering Application");
        System.out.println("Select an option to proceed:");
        System.out.println("1- Login");
        System.out.println("2- Sign Up");
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        /////
        customer2.setName("Abdo");
        customer2.setAddress("13th Cornelia Street, NYC, USA");
        customer2.setEmail("thirteenkitty@gmail.com");
        customer2.setMobile("1-800-700-1234");
        customer2.setPassword("swifties_13$");
        customer2.setBalance(50.00);
        /////
        int choice1, choice2, choice3;
        choice1 = sc.nextInt();
        sc.nextLine();
        switch (choice1) {
            case 1:
                System.out.println("Enter your name and password to browse:");
                String name, pass;
                name = sc.nextLine();
                pass = sc.nextLine();
                if(name == customer2.name && pass == customer2.password){
                    System.out.println("Logged in successfully!");
                }
                break;
            case 2:
                System.out.println("Enter the following data to set up your account:");
                System.out.println("Name, Password, Email, Mobile, Address");
                System.out.println();
                customer1.setName(sc.nextLine());
                customer1.setPassword(sc.nextLine());
                customer1.setEmail(sc.nextLine());
                customer1.setMobile(sc.nextLine());
                customer1.setAddress(sc.nextLine());
                customer1.setBalance(0.0);
                System.out.println();
                System.out.println("Account created successfully!");
                break;
        }
        System.out.println("Choose what do you want to do:");
        System.out.println("1- Browse all the products currently available for purchase");
        System.out.println("2- Deposit into account balance");
        System.out.println("3- See account information");
        System.out.println("4- Add an item to cart");
        System.out.println("5- Proceed to checkout");
        System.out.println("9- Exit program");
        choice2 = sc.nextInt();
        while (choice2 != 9) {
            switch (choice2){
                case 1:
                    browse_all();
                    break;
                case 2:
                    System.out.println("Select a customer to deposit (TEMP_TEST)");
                    choice3 = sc.nextInt();
                    if(choice3 == 1){
                        //deposit(customer1)
                        System.out.println("Enter amount to deposit: ");
                        double amount;
                        amount = sc.nextDouble();
                        customer1.setBalance(customer1.balance + amount);
                        System.out.println("Updated balance!");
                        System.out.println("Your balance is now:" + customer1.getBalance());
                    }
                    else {
                        //deposit(customer2)
                        System.out.println("Enter amount to deposit: ");
                        double amount;
                        amount = sc.nextDouble();
                        customer2.setBalance(customer2.balance + amount);
                        System.out.println("Updated balance!");
                        System.out.println("Your balance is now:" + customer2.getBalance());
                    }
                    break;
                case 3:
                    display(customer1);
                    System.out.println();
                    display(customer2);
                    break;
                case 4:
                    System.out.println("I don't implement this");
                    break;
                case 5:
                    System.out.println("I didn't implement this");
                    break;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid command");
            }
            System.out.println("Choose what do you want to do:");
            System.out.println("1- Browse all the products currently available for purchase");
            System.out.println("2- Deposit into account balance");
            System.out.println("3- See account information");
            System.out.println("4- Add an item to cart");
            System.out.println("5- Proceed to checkout");
            System.out.println("9- Exit program");
            choice2 = sc.nextInt();
        }
    }
}