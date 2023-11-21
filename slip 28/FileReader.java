import java.util.*; 
import java.io.*; 
class FileReader 
{ 
 public static void main(String ar[]) 
 { 
 Scanner sc=new Scanner(System.in); 
 System.out.println("enter file name"); 
 
 String f1=sc.next(); 
 File f=new File(f1); 
 
 if(f.exists()) 
 { 
 System.out.println("Name of the File is "+f.getName()); 
 
 if(f.canRead()) 
 System.out.println("File is Readable "); 
 else 
 System.out.println("File is not Readable "); 
 
 if(f.canWrite()) 
 System.out.println("File is Writeable"); 
 else 
 System.out.println("File is not Writeable"); 
 
 System.out.println("Length of the File= "+f.length()); 
 } 
 else 
 System.out.println("File not found!"); 
 } 
 }