public class Main{
  public static void main(String[] args){
    
    Manager m1=new Manager(121,"Mehadi Hasan Mithun",3000,"Dhaka");
    m1.showManagerDetails();

    Salesman s1=new Salesman(221,"Abdullah",500,"Dhaka","Ac",121);
    s1.showSalesmanDetails();

    System.out.println("After Increament ");
    m1.incrementSalary(s1,1000);
    s1.showSalesmanDetails();
   
  }
}