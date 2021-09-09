package frs.upgrad;

public class Flight {
    private String flightNumber;
    private String airlineName;
    private int capacity;
    private int noOfSeatsBooked;

    //constructor
    public Flight(String flightNumber, String airlineName, int capacity) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.capacity = capacity;
        this.noOfSeatsBooked = 0;
    }

    //getters and setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoOfSeatsBooked() {
        return noOfSeatsBooked;
    }

    public void setNoOfSeatsBooked(int noOfSeatsBooked) {
        this.noOfSeatsBooked = noOfSeatsBooked;
    }

    //methods
    public String getFlightDetails(){
        return this.flightNumber + ", " + this.airlineName;
    };

    public boolean checkAvailabilityOfSeats(){
        if(noOfSeatsBooked<capacity){
            return true;
        }else {
            return false;
        }
    };

    public void updateNoOfSeatsBooked(){
        System.out.println("Booked Seats count updated");
        System.out.println("Now booked seats count is " +this.noOfSeatsBooked);
    };

}
