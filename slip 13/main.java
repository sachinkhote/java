mport java.text.SimpleDateFormat; 
import java.util.Date; 
 
class main { 
 public static void main(String[] args){ 
 Date date = new Date(); 
 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
 String strDate= formatter.format(date); 
 System.out.println(strDate); 
 
 SimpleDateFormat formatter1 = new SimpleDateFormat("MM-dd-yyyy"); 
 String strDate1= formatter1.format(date); 
 System.out.println(strDate1); 
 
 SimpleDateFormat formatter2 = new SimpleDateFormat("EEEEE MMMMM dd yyyy"); 
 String strDate2= formatter2.format(date); 
 System.out.println(strDate2); 
 
 SimpleDateFormat formatter3 = new SimpleDateFormat("EEEEE MMMMM dd HH:mm:ss z yyyy"); 
 String strDate3= formatter3.format(date); 
 System.out.println(strDate3); 
 
 SimpleDateFormat formatter4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a"); 
 String strDate4= formatter4.format(date); 
 System.out.println(strDate4); 
 } 
} 