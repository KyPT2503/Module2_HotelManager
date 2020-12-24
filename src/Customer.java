import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Customer extends Person {

    private int dayCount;
    private String kindOfRoom;

    public Customer(String name, int[] birthday, String cardNumber, int dayCount, String kindOfRoom) {
        super(name, birthday, cardNumber);
        this.dayCount = dayCount;
        this.kindOfRoom = kindOfRoom;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "dayCount=" + dayCount +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", name='" + name + '\'' +
                ", Birthday=" + Arrays.toString(Birthday) +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }
}
