package javafinalprojectspring2022;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class JAVAFinalProjectSpring2022 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Client> clientList = new ArrayList<>();
        ArrayList<Event> eventList = new ArrayList<>();
        Event e = new Event();
        Client c = new Client();
        Booking b = new Booking();
        int entry;
        
        do
        {
        System.out.println("\t\tWELCOME TO JEDDAH SEASON!");
        System.out.println("Enter 1 to book a visit");
        System.out.println("Enter 2 to view booking");
        System.out.println("Enter 3 to view client information");
        System.out.println("Enter 4 to exist program");
        
        entry = scan.nextInt();
        
        while(entry < 1 || entry > 3) 
        {
            System.out.println("Error! Try again.\n");
            System.out.println("Enter 1 to book a visit");
            System.out.println("Enter 2 to view booking");
            entry = scan.nextInt();
        }
         
        switch(entry)
        {
            case 1:
                System.out.println("\nSTEP 1");
                String nameOfClient;
                int id;
                int phoneNumber;
                String email;
//------------------------------------------------------------------------------
                System.out.println("\nSTEP 2");
                String choiceOfEvent = "";
                double price = 0;
                int choice;
                int confirm;
                System.out.println("2022 JEDDAH SEASON'S EVENTS");
                System.out.println("Enter 1 for Safari (50 SAR per ticket)");
                System.out.println("Enter 2 for Concert (80 SAR per ticket)");
                System.out.println("Enter 3 for Museum (70 SAR per ticket)");
                System.out.println("Enter 4 for Circus (50 SAR per ticket)");
                choice =  scan.nextInt();
                while(choice < 1 || choice > 4) 
                {
                        
                    System.out.println("Error! Try again.\n");
                    System.out.println("Enter 1 for Safari (50 SAR per ticket)");
                    System.out.println("Enter 2 for Concert (80 SAR per ticket)");
                    System.out.println("Enter 3 for Museum (70 SAR per ticket)");
                    System.out.println("Enter 4 for Circus (50 SAR per ticket)");
                    choice =  scan.nextInt();
                }
                if(choice == 1)
                {
                    choiceOfEvent = "Safari";
                    price = 50.00;
                }
                if(choice == 2)
                {
                    choiceOfEvent = "Concert";
                    price = 80.00;
                }
                if(choice == 3)
                {
                    choiceOfEvent = "Museum";
                    price = 70.00;
                }
                if(choice == 4)
                {
                    choiceOfEvent = "Circus";
                    price = 50.00;
                }
                
                Event event = new Event(choiceOfEvent, price); 
                eventList.add(event);
                event.writeInFile();
//------------------------------------------------------------------------------
                System.out.println("\nSTEP 3");
                int ticket;
                double total = 0;
                //String nameOfClient;
                int cardNumber;
                int cvvNumber;
                double calculatedTotal = 0;
                
                System.out.println("Enter number of tickets to purchase: ");
                ticket = scan.nextInt();
                calculatedTotal = ticket * price;
                System.out.println("Total: "+calculatedTotal+" SAR"); //total = 0.0
                System.out.println("Enter card number: ");
                cardNumber = scan.nextInt();
                System.out.println("Enter card cvv number: ");
                cvvNumber = scan.nextInt();
                System.out.println("All Done! You are booked.");
                System.out.println("\nName: "); //nameOfClient
                System.out.println("Phone number: "); //phoneNumber
                System.out.println("Event: "+choiceOfEvent);
                System.out.println("Number of tickets: "+ticket);
                System.out.println("Total: "+calculatedTotal);
                
                //write in booking file  
                break;
            case 2:
                b.displayBookingInfo();
                break;
            case 3:
                //c.displayClientInfo();
        }
        }while(entry!=4);
    }
}
