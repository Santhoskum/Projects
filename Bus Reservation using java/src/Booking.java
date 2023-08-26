import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    private String name;
    private int busno;
    private Date date;
    Booking() throws ParseException {
        Scanner s=new Scanner(System.in);
        System.out.println("enter your name");
        name=s.next();
        System.out.println("enter busno");
        busno=s.nextInt();
        System.out.println("enter the date of journey");
        date=new SimpleDateFormat("dd/MM/yyyy").parse(s.next());
    }
    public boolean isavailable(ArrayList<Bus> buses,ArrayList<Booking>bookings){
        int cap=0;
        for(Bus x:buses){
            if(this.busno==x.getBusno())
                cap=x.getCapacity();
        }
        int count=0;
        for(Booking y:bookings){
            if(this.busno==y.busno && this.date.equals(y.date))
                count++;
        }
        return cap>count;

}}

