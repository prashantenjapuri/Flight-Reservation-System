package frs.upgrad;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Passenger newPassenger = new Passenger("3RD Street","Mumbai","Maharashtra",
                "Prashant","7838440069","pras@gmail.com");

        Flight newFlight = new Flight("AH23GG","Indigo",10000);

        TouristTicket touristTicket1 = new TouristTicket(154,"HYD","MUM","12/09/2021",
                "13/09/2021","23:50","09:50",120.30f,
                "E4503",false,newPassenger,newFlight,"Gulab Estate, T2 Terminal International Airport"
                ,new String[]{"Gateway of India","Elephanta Caves","Nehru Center","EsselWorld","Juhu Beach"});

        RegularTicket regTicket1 =  new RegularTicket(145,"MUM","HYD","12/09/2021",
                "13/09/2021","23:00","08:50",145.15f,"A2312",
                false,newPassenger,newFlight,"Biryani","Yes","Waffers");


        printTicketDetails(touristTicket1);
        printTicketDetails(regTicket1);
//        touristTicket1.addTouristLocation(new String[]{"one","two","three"});
//        System.out.println(Arrays.toString(touristTicket1.getTouristLocation()));
//        touristTicket1.removeTouristLocation();
//        System.out.println(Arrays.toString(touristTicket1.getTouristLocation()));
    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnrNumber());
    }
}
