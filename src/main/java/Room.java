import java.util.ArrayList;

public abstract class Room {

    protected int capacity;

    protected ArrayList<Guest> guestList;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
    }

    public int getGuestList(){
        return this.guestList.size();
    }

    public int getCapacity() {
        return capacity;
    }
}
