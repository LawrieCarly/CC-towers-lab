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
        hotel.addBedroom(bedroom1);
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getGuestList());
    }

}