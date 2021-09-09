package frs.upgrad;
import java.util.ArrayList;
import java.util.Arrays;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation;

    //constructor
    public TouristTicket(int pnrNumber, String departure, String destination,
                         String dateOfDeparture, String dateOfArrival,
                         String timeOfDeparture, String timeOfArrival, float price,
                         String seatNumber, boolean isCancelled, Passenger passenger,
                         Flight flight,String hotelAddress, String[] selectedTouristLocation) {
        super(pnrNumber, departure, destination, dateOfDeparture, dateOfArrival, timeOfDeparture,
                timeOfArrival, price, seatNumber, isCancelled, passenger, flight);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = new String[5];
    }

        //getters and setters
        public void setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
        }

        public String getHotelAddress() {
            return hotelAddress;
        }

        //methods
        //to set single location
        public void addTouristLocation(String location){
           this.selectedTouristLocation[0]=location;
        };

        public void removeTouristLocation(){
            this.selectedTouristLocation = null;
        }

        public void addTouristLocation(String[] selectedTouristLocation) {
            this.selectedTouristLocation = selectedTouristLocation;
        }

        public String[] getTouristLocation(){
            return selectedTouristLocation;
        };

}

