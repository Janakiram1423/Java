import java.util.Scanner;
class EBBill
{ 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int cno,previous,current,units;
double bill;
String type;
System.out.print("Enter previous Reading:");
previous=sc.nextInt();
System.out.print("Enter current meter reading:");
current=sc.nextInt();
sc.nextLine();
System.out.print("Enter Connection Type (Domestic/Commercial):");
type=sc.nextLine();
units=current-previous;
if (type.equalsIgnoreCase("Domestic"))
 if(units<=100)
 bill=0;
 else if(units<=200)
 bill=(units-100)*2;
 else if(units<=500)
 bill=(100*2)+(units-200)*4;
 else
 bill=(1100*2)+(300*4)+(units-500)*60;
else if (type.equalsIgnoreCase("Commercial"))
 if(units<=100)
 bill=units*2;
 else if(units<=200)
 bill=(100*2)+(units-100)*4;
 else if(units<=500)
 bill=(100*2)+(100*4)+(300*6)+(units-200)*6;
 else
 bill=(10082)+(100*4)+(300*6)+(units-200)*6;
else{
 System.out.println("Invalid Connection Type");
 return;
}
System.out.println("\n---EB Bill---");
System.out.println("Units comsumed:"+units);
System.out.println("Bill Amount=Rs."+bill);
}
}