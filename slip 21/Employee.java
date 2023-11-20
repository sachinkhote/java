class Employee{ 
 int id; 
 String name,deptname; 
 double sal; 
 static int cnt=0; 
 Employee(){ 
 cnt++; 
 displayCount(); 
 } 
 Employee(int id,String name,String deptname,double sal){ 
 this.id=id; 
 this.name=name; 
 this.deptname=deptname; 
 this.sal=sal; 
 cnt++; 
 displayCount(); 
 } 
 public static void displayCount() {
 System.out.println("Total Objects created "+cnt);
 } 
 public void displayData(){ 
 System.out.println(this.id+"\t\t"+this.name+"\t\t\t"+this.deptname+"\t\t"+this.sal); 
 } 
 public static void main(String args[]) { 
 Employee e1=new Employee(101,"Maithili","HR",120020.20);
 Employee e2=new Employee(102,"Soham","IT",140020.20); 
 Employee e3=new Employee(104,"Akshay","Accounts",100020.20); 
 System.out.println("EID\t\tName\t\t\tDepartment\t\tSalary"); 
 e1.displayData(); 
 e2.displayData(); 
 e3.displayData(); 
 } 
} 