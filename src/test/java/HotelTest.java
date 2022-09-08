import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(1, 1, RoomType.SINGLE) {
        };
        guest1 = new Guest("Sam");
        hotel = new Hotel();
    }

    @Test
    public void canAddBedroomToList(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getBedroomList());
    }

    @Test
    public void canGuestCheckIn(){
        hotel.guestCheckIn(guest1, bedroom1);
        assertEquals(1, bedroom1.getGuestList());
    }

    @Test
    public void canGuestCheckOut(){
        hotel.guestCheckIn(guest1, bedroom1);
        hotel.guestCheckOut(bedroom1);
        assertEquals(0, bedroom1.getGuestList());
    }


}