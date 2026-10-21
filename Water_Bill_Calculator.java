import java.util.Scanner;
public class Water_Bill_Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter water units consumed:");
        int units=sc.nextInt();
        double bill;
        if (units<=50){
            bill=units*1.5;
        } else if(units<=100){
            bill=(50*1.5)+(units-50)*2.5;
        } else if(units<=200){
            bill=(50*1.5)+(50*2.5)+(units-100)*4.0;
        } else{
            bill=(50*1.5)+(50*2.5)+(100*4.0)+(units-200)*6.0;
        }
        System.out.println("Units consumed:"+units);
        System.out.println("Total water bill: Rs."+bill);
        sc.close();
    }
}
    
