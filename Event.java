package javafinalprojectspring2022;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Event 
{
    private String choiceOfEvent;
    private double price;
    
    public Event() 
    {
        this.choiceOfEvent = "";
        this.price = 0;
    }
    public Event(String choiceOfEvent, double price) 
    {
        this.choiceOfEvent = choiceOfEvent;
        this.price = price;
    }
    public Event(Event event) 
    {
        this.choiceOfEvent = event.choiceOfEvent;
        this.price = event.price;
    }
    
    public void setChoiceOfEvent(String choiceOfEvent)
    {
        this.choiceOfEvent = choiceOfEvent;
    }
    public String getChoiceOfEvent()
    {
        return choiceOfEvent;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
    
    public String toString()
    {
            return "Event Info:\nEvent: "+this.choiceOfEvent+"\nPrice per ticket: "+this.price;      
    }
    
    public void writeInFile() throws IOException
    {
        FileWriter fwrite = new FileWriter("Event.txt",true);
        PrintWriter write = new PrintWriter(fwrite);
        write.print(this.choiceOfEvent+"\t\t");
        write.println(this.price);
        write.close();  
    }
    
    //public void displayEventInfo() throws FileNotFoundException
    //{
        //System.out.println("No.\tEvent\t\tPrice Per Ticket");
        //File file = new File("Event.txt");
        //Scanner read = new Scanner(file);
        //int count = 1;
        //while(read.hasNext())
        //{
        //    String line = read.nextLine();
        //    System.out.println(count+"\t"+line);
        //    count++;
        //}
        //read.close();
    //}
}
