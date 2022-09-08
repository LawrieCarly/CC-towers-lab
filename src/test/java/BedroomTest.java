import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 1, RoomType.SINGLE){
        };
        guest1 = new Guest("Sam");
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(1, bedroom1.getRoomCapacity());
    }

    @Test
    public void canAddGuest(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestList.size());
    }

}
