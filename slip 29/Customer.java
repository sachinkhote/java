import java.util.Scanner; 
 class Customer 
 {  
 int cno; 
 String cname,cmob,cadd; 
 
 public static void main(String [] args) 
 { 
 int i=0; 
 { 
 Scanner sc = new Scanner(System.in); 
 Customer ob[]=new Customer[5]; 
 
 for(i=0;i<5;i++) 
 { 
 System.out.println("Enter cno,cname,cmob,cadd"); 
 ob[i]=new Customer(); 
 ob[i].cno=sc.nextInt(); 
 ob[i].cname=sc.next(); 
 ob[i].cmob=sc.next(); 
 ob[i].cadd=sc.next(); 
 } 
 String mb; 
 System.out.print("enter mob to search"); 
 for(i=0;i<5;i++) 
 { 
 if(mb.equals(ob[i]).cmob) 
 { 
 System.out.println("Name"+ob[i].cname); 
 } 
 
 } 
 } 
 } 
 }