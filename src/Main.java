import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static final String NEW_CUSTOMER = "1/ New customer.";
    public static final String DISPLAY_ALL_CUSTOMER = "2/ Display all customer.";
    public static final String CUSTOMER_CHECKOUT = "3/ Customer checkout.";
    public static final String OUT = "4/ Out.";

    private static Hotel pricelessHotel = new Hotel();

    public static void main(String[] args) {
        displayOptions();
        int option = scanner.nextInt();
        while (option != 4) {
            if (option == 1) {
                getCustomer();
            } else if (option == 2) {
                displayAllCustomer();
            } else if (option == 3) {
                checkout();
            }
            displayOptions();
            option = scanner.nextInt();
        }
    }

    private static void displayOptions() {
        System.out.println(NEW_CUSTOMER);
        System.out.println(DISPLAY_ALL_CUSTOMER);
        System.out.println(CUSTOMER_CHECKOUT);
        System.out.println(OUT);
    }

    private static void getCustomer() {
        scanner.nextLine();
        System.out.println("New customer: ");
        System.out.print("Name :");
        String name = scanner.nextLine();
        System.out.print("Birthday :");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Card number :");
        String cardNumber = scanner.nextLine();
        System.out.print("How many day customer want to rent: ");
        int dayCount = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Kind of room (small/normal/luxury) : ");
        String kindOfRoom = scanner.nextLine();
        pricelessHotel.addCustomer(new Customer(name, new int[]{day, month, year}, cardNumber, dayCount, kindOfRoom));
        System.out.println("Customer added!");
    }

    private static void displayAllCustomer() {
        pricelessHotel.displayAllCustomer();
    }

    private static void checkout() {
        try {
            scanner.nextLine();
            System.out.print("Type card number of customer want to checkout: ");
            String cardNumber = scanner.nextLine();
            System.out.println("Customer's bill: " + pricelessHotel.getBill(cardNumber) + "$");
            pricelessHotel.removeCustomer(cardNumber);
            displayAllCustomer();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
