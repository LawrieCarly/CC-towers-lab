import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;
    private RoomType roomType;

    public Bedroom(int capacity, int roomNumber, RoomType roomType) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomCapacity() {
        capacity = roomType.getValue();
        return capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void addGuest(Guest guest) {
        if (guestList.size() < getRoomCapacity()) {
            this.guestList.add(guest);
        }
    }

    public void removeGuest(Bedroom bedroom) {
        if (bedroom.guestList.size() > 0) {
            this.guestList = new ArrayList<Guest>();
        }
    }
}
