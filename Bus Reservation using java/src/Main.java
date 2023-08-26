import java.text.ParseException;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Scanner;
import java.lang.String;

public class Main{
    public static void main(String args[]) throws ParseException {
        System.out.println("\n--------------------------------------------------------");
        System.out.println("***** Welcome to LASK Travels *****");
        ArrayList<Bus>buses=new ArrayList<>();
        buses.add(new Bus(1,2,true,200));
        buses.add(new Bus(2,50,false,150));
        buses.add(new Bus(3,45,true,250));
        System.out.println("Available  buses : ");
        for(Bus b:buses){
            b.show();
        }
        ArrayList<Booking>bookings=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("--------------------------------------------------------");
        while(true){
            System.out.println("press y to book and n to exit");
            char choice=scanner.next().charAt(0);
            if(choice=='n')
            {
                System.out.println("Thankyou...visit again");
                break;
            }
            Booking book=new Booking();
            if(book.isavailable(buses,bookings)){
                System.out.println("*** your booking confirmed ***");
                bookings.add(book);
            }
            else{
                System.out.println("oops!...Bus is full...try another one or another date");}
        }


    }}