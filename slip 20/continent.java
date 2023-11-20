import java.util.*; 
class continent{ 
 String c1; 
 
} 
class country extends continent{ 
 String c2;
} 
class state extends country{ 
 String s1; 
 String p1; 
 
public void display(){ 
    System.out.println("Continent name: "+c1+"\n"+"Country name: "+c2+"\n"+"State Name: "+s1+"\n"+"Place: "+p1); 
 } 
public static void main(String args[]){ 
    state ob=new state(); 
    Scanner sc=new Scanner(System.in); 
    System.out.println("Enter the continent"); 
    ob.c1=sc.next(); 
    System.out.println("Enter the Country"); 
    ob.c2=sc.next(); 
    System.out.println("Enter the state"); 
    ob.s1=sc.next(); 
    System.out.println("Enter the place"); 
    ob.p1=sc.next(); 
    ob.display(); 
 } 
} 