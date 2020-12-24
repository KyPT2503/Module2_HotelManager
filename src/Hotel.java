import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {

    public static final String NO_CARD_NUMBER_AVAILABLE = "No card number available.";
    private static Map<String, Integer> priceEachRoom = new HashMap<String, Integer>();

    static {
        priceEachRoom.put("small", 1000);
        priceEachRoom.put("normal", 2000);
        priceEachRoom.put("luxury", 3000);
    }

    private List<Customer> customers;

    public Hotel() {
        this.customers = new ArrayList<Customer>();
    }

    public Customer getCustomerByCardNumber(String cardNumber) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCardNumber().equals(cardNumber)) {
                return customers.get(i);
            }
        }
        throw new UnsupportedOperationException(NO_CARD_NUMBER_AVAILABLE);
    }

    public void removeCustomer(String cardNumber) {
        customers.remove(getCustomerByCardNumber(cardNumber));
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayAllCustomer() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }

    public int getBill(String cardNumber) {
        return getCustomerByCardNumber(cardNumber).getDayCount() * Hotel.priceEachRoom.get(getCustomerByCardNumber(cardNumber).getKindOfRoom());
    }
}
