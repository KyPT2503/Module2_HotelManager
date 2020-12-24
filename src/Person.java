import java.util.Arrays;

public class Person {
    protected String name;
    protected int[] Birthday;
    protected String cardNumber;

    public Person() {
    }

    public Person(String name, int[] birthday, String cardNumber) {
        this.name = name;
        Birthday = birthday;
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public int[] getBirthday() {
        return Birthday;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Birthday=" + Arrays.toString(Birthday) +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
