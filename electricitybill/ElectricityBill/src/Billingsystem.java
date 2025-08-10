import java.util.Scanner;

public class Billingsystem {
    static Custmer[] custemers=new Custmer[100];
    static Bill[] bills=new Bill[100];
    static int custmercount=0;
    static int billcount=0;
    static Scanner sc=new Scanner(System.in);
    //1.
    public static void addCustomer() {
    	System.out.print("Add new Customer id : ");
    	int id=sc.nextInt();sc.nextLine();
    	System.out.print("Add name :");
    	String name=sc.nextLine();
    	System.out.print("Add mobile :");
    	String mobile=sc.nextLine();
    	System.out.print("Add Address :");
    	String address=sc.nextLine();
    	
    	custemers[custmercount]=new Custmer(id,name,mobile,address);
    	custmercount++;
    	System.out.println("Custemer added Successfully....");
    }
    
    //2
    public static void addBill() {
    	System.out.print("Add bill no :");
    	String bill_no=sc.next();
    	System.out.print("Add reading of meter :");
    	int reading=sc.nextInt();
    	System.out.print("Enter month no :");
    	int month=sc.nextInt();
    	System.out.print("Add year :");
    	int year=sc.nextInt();
    	System.out.print("Add customer id :");
    	int customer_id=sc.nextInt();
    	System.out.print("Add bill amount :");
    	double bill_amount=sc.nextDouble();
    	boolean paid_status=false;
    	
    	bills[billcount]=new Bill( month, year, bill_no, reading, new Date(month,year), customer_id,  bill_amount,paid_status);
    	billcount++;
    	System.out.println("Bill Added Successfully......");
    }
    //3
   public static void displayBillAmount() {
     System.out.print("Enter customer id :");
	   int id=sc.nextInt();
	   boolean found=false;
	   for(int i=0;i<bills.length;i++) {
		   if(bills[i]!=null && bills[i].customer_id==id) {
			  System.out.println("Bill no :"+bills[i].bill_no+",Reading :"+bills[i].reading+",Month :"+bills[i].month+",Year :"+bills[i].year+",Id :"+bills[i].customer_id+",Bill amount :"+bills[i].bill_amount);
	             found=true;	   
		     }
		   }
	   if(!found) {
		   System.out.println("Invalid CustomerID...");
	   }
   }
	   
   
   //4
   public static void displayAllUnpaidBills() {
	 ///boolean found=false;
	 for(int i=0;i<bills.length;i++) {
		 if(bills[i]!=null && !bills[i].paid_status) {
			 System.out.println("Bill no :"+bills[i].bill_no+",Bill amount :"+bills[i].bill_amount+"Customer ID :"+bills[i].customer_id);
		 }
		
		 
	 }
   }
   //5
   public static void  payBill() {
	   System.out.print("Enter Customer id :");
	   int id=sc.nextInt();
	   boolean found=false;
	   for(int i=0;i<bills.length;i++) {
		   if(bills[i]!=null && bills[i].customer_id==id && !bills[i].paid_status) {
			   bills[i].paid_status=true;
			   System.out.println("Bill no"+bills[i].bill_no+",Paid successfully");
			   found=true;
		   }
		   }
	   if(!found) {
		   System.out.println("Invalid CustomerID...");
	   }
   }
   //6
   public static void displayUnpaidBillsByDate() {
	   System.out.print("Enter the month : ");
	   int month=sc.nextInt();sc.nextLine();
	   System.out.print("Enter the year :");
	   int year=sc.nextInt();sc.nextLine();
	   for(int i=0;i<bills.length;i++) {
		   if(bills[i]!=null && !bills[i].paid_status && bills[i].date.month==month && bills[i].date.year==year) {
			 System.out.println("Bill no :"+bills[i].bill_no +",Cutomer id :"+bills[i].customer_id +",Amount :"+bills[i].bill_amount);
		   }
		
	   }
	   
   }
   

	public static void main(String[] args) {
	while(true) {
		Scanner sc=new Scanner(System.in);
        System.out.println("\n--- Billing Menu ---");
        System.out.println("1. Add New Customer");
        System.out.println("2. Add New Bill");
        System.out.println("3. Display Bill Amount of Particular Customer");
        System.out.println("4. Display All Unpaid Bills");
        System.out.println("5. Pay Bill for Given Customer ID");
        System.out.println("6. Display Unpaid Bills for Given Date");
        System.out.println("7. Exit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        if (choice == 1) addCustomer();
        else if (choice == 2) addBill();
        else if (choice == 3) displayBillAmount();
        else if (choice == 4) displayAllUnpaidBills();
        else if (choice == 5) payBill();
        else if (choice == 6) displayUnpaidBillsByDate();
        else if (choice == 7) {
            System.out.println("Exiting...");
            break;
        } else {
            System.out.println("❌ Invalid choice!");
	}

	}

}
}
