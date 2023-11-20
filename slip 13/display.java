import java.io.*; 
class display{ 
 public static void main(String argd[]) throws Exception{ 
 String fname=argd[0]; 
 File f=new File(fname); 
 if(f.isFile()) 
 { 
 FileInputStream fis=new FileInputStream(fname); 
 int ch,cnt=0; 
 while((ch=fis.read())!=-1){ 
 if(ch=='\n'){ 
 cnt++; 
 } 
 } 
 System.out.println("Number of line in Given file is "+cnt); 
 } 
 else{ 
 System.out.println("file not exists"); 
 } 
 } 
}