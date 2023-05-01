package javafinalprojectspring2022;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Booking 
{
    private int ticket;
    private Event event;
    //private Client client;
    private double total;
    
    public Booking()
    {
        this.ticket = 0;
        this.event = null;
        //this.client = null;
        this.total = 0;
    }
    public Booking(int ticket, Event event) //, Client client
    {
        this.ticket = ticket;
        this.event = event;
        //this.client = client;
        this.total = total;
    }
    
    public void setTicket(int ticket)
    {
        this.ticket = ticket;
    }
    public int getTicket()
    {
        return ticket;
    }
    
    public void setEvent(Event event)
    {
        this.event = event;
    }
    public Event getEvent()
    {
        return new Event(this.event);
    }
    
    //public void setClient(Client client)
    //{
    //    this.client = client;
    //}
    //public Client getClient()
    //{
    //     return new Client(this.client);
    //}
    
    public void setTotal(double total)
    {
      this.total = total;  
    }
    public double getTotal()
    {
        return total;
    }
    
    public void calculateTotal()
    {
        this.total = this.ticket * this.event.getPrice();
    }
    
    public String toString()
    {
        String text="Booking Info: \n "+this.event+"\nTicket(s): "+this.ticket+"\nTotal Price:"+this.total;// +this.client+
        return text;
    }

    public void writeInFile() throws IOException
    {
        FileWriter fwrite = new FileWriter("Booking.txt",true);
        PrintWriter write = new PrintWriter(fwrite);
        //write.print(this.client.getnameOfClient()+"\t\t");
        //write.print(this.client.getphoneNumber()+"\t\t");
        write.print(this.event.getChoiceOfEvent()+"\t\t");
        write.print(this.ticket+"\t\t");
        write.print(this.total);
        write.close();  
    }

    public void displayBookingInfo() throws FileNotFoundException
    {  
        System.out.println("No.\tName\t Phone number\t Event \t Ticket\t  Total");
        File file = new File("Booking.txt");
        Scanner read = new Scanner(file);
        int count = 1;
        while(read.hasNext())
        {
            String line = read.nextLine();
            System.out.println(count+"\t"+ line);
            count++;
        }
        read.close();
    }
}
