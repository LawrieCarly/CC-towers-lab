import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    Guest guest;
    Bedroom bedroom;
    public ArrayList<Bedroom> bedroomList;
    public ArrayList<ConferenceRoom> conferenceRoomList;

    public Hotel(){
        this.bedroomList = new ArrayList<Bedroom>();
        this.conferenceRoomList = new ArrayList<ConferenceRoom>();
    }

    public int getBedroomList() {
        return bedroomList.size();
    }

    public int getConferenceRoomList() {
        return conferenceRoomList.size();
    }

    public void addBedroom(Bedroom bedroom){
        bedroomList.add(bedroom);
    }

    public void guestCheckIn(Guest guest, Bedroom bedroom){
        addBedroom(bedroom);
        bedroom.addGuest(guest);
    }

    public void guestCheckOut(Bedroom bedroom){
        bedroom.removeGuest(bedroom);
    }
}
