
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Pub]<---->[Outside]<---->[Theatre]
 *                 |
 *          [Computer Lab]<---->[Office]
 *             
 * @author Derek Peacock and Nicholas Day
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    private Location reception, corridoor1, corridoor2, cafe, dressing_room, shop, ball_section, pitch;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createReception();
        createCorridoor1();
        createCorridoor2();
        createCafe();
        createDressingRoom();
        createShop();
        createBallSection();
        createPitch();

        currentLocation = reception;  // start game outside
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createReception()
    {
        reception = new Location("In the reception of the sports center");
        
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createCorridoor1()
    {
        corridoor1 = new Location("in corridoor 1");
        
        corridoor1.setExit("west", reception);
        reception.setExit("east", corridoor1);
        
        corridoor1.setExit("north", cafe);
        cafe.setExit("south", corridoor1);
        
        corridoor1.setExit("south", dressing_room);
        dressing_room.setExit("north", corridoor1);
        
        corridoor1.setExit("east", corridoor2);
        corridoor2.setExit("west", corridoor1);
        
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createCorridoor2()
    {
        corridoor2 = new Location("in corridoor 2");
        
        corridoor2.setExit("east", corridoor1);
        corridoor1.setExit("west", corridoor2);
        
        corridoor2.setExit("north", shop);
        shop.setExit("south", corridoor2);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createCafe()    
    {
        cafe = new Location("in the computing admin office");
        
        cafe.setExit("south", corridoor1);
        corridoor1.setExit("south", cafe);
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createDressingRoom()
    {
        // create the Locations
        dressing_room = new Location("in a computing lab");
        
        dressing_room.setExit("north", corridoor1);
        corridoor1.setExit("south", dressing_room);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createPitch()    
    {
        pitch = new Location("in the computing admin office");
        
        pitch.setExit("west", corridoor2);
        corridoor2.setExit("east", pitch);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createShop()    
    {
        shop = new Location("in the computing admin office");
        
        shop.setExit("south", corridoor2);
        corridoor2.setExit("north", shop);
        
        shop.setExit("east", ball_section);
        ball_section.setExit("west", shop);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createBallSection()    
    {
        ball_section = new Location("in the computing admin office");
        
        ball_section.setExit("west", shop);
        shop.setExit("east", ball_section);
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
