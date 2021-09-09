package frs.upgrad;

public class RegularTicket extends Ticket{
    private String food;
    private String water;
    private String snacks;

    //constructor
    public RegularTicket(int pnrNumber, String departure, String destination,
                         String dateOfDeparture, String dateOfArrival,
                         String timeOfDeparture, String timeOfArrival, float price,
                         String seatNumber, boolean isCancelled, Passenger passenger,
                         Flight flight,String food, String water,String snacks){
        super(pnrNumber,departure,destination,dateOfDeparture,dateOfArrival,timeOfDeparture,
                timeOfArrival,price,seatNumber,isCancelled,passenger,flight);
        this.food=food;
        this.water=water;
        this.snacks=snacks;
    }

    //getters and setters

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }

    //methods
    public String checkSpecialServicesAvailed(){
        return ("Food- " + this.food + ", " + "Water- " + this.water + ", " + "Snacks- " + this.snacks);
    }

    public String updateSpecialServices(String food, String water, String snacks){
        this.food=food;
        this.water=water;
        this.snacks=snacks;
        return "Special services updated.";
    }
}
