public class Bus {
    private int busno;
    private int capacity;
    private boolean ac;
    private int fare;
    Bus(int n,int c,boolean a,int f){
        busno=n;
        capacity=c;
        ac=a;
        fare=f;
    }

    public int getBusno() {
        return busno;
    }

    public int getCapacity() {
        return capacity;
    }

    public void show(){
        String temp="";
        if(ac==true){
            temp="yes";
        }
        else
            temp="No";
        System.out.println(busno+" - "+" of capacity "+capacity+" | ac condition :"+temp+" | fare: Rs."+fare+" each ticket | From: Chennai - To: Salem");
    }
}
