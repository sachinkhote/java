import java.util.*; 
class InvalidDateException extends Exception 
{} 
class MyDate { 
 int day,month,year; 
 public void accept(){ 
 System.out.println("Enter Date, Month and Year"); 
 try{ 
 Scanner sc=new Scanner(System.in); 
 
 day=sc.nextInt(); 
 if(day<1 || day>31) 
 throw new InvalidDateException(); 
 month=sc.nextInt(); 
 if(month>12 ||month<1) 
 throw new InvalidDateException(); 
 year=sc.nextInt(); 
 if(year>10000 ||year<1000) 
 throw new InvalidDateException(); 
 } 
 catch(InvalidDateException e) {
    System.out.println("Invalid Date entered"); 
    System.exit(0); 
 } 
 catch(Exception e) { 
    System.out.println("Enter Valid Date"); 
    System.exit(0); 
 } 
 } 
 public void display(){ 
    System.out.println("Entered Date is "+day+":"+month+":"+year); 
 } 
 public static void main(String args[]) { 
    MyDate ob=new MyDate(); 
    ob.accept(); 
    ob.display(); 
 } 
}