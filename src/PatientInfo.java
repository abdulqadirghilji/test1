import java.util.Date;
import java.util.*;


public class PatientInfo {

	public static void main(String[] args) {
		// TODO Auto-generated methodds 
		
	
		

		Scanner scan=new Scanner(System.in);
                System.out.println(" ************************** Hospital Information System*********************** ");
                
                System.out.println("Enter patient name:");
                String patientname = scan.nextLine();
                
                
                System.out.println("Enter father patient/Husband name:");
                String fathername = scan.nextLine();
                
                
                System.out.println("Enter ward name:");
                String wardname =scan.nextLine();
                
                System.out.println("MR No:");
                int mrno = scan.nextInt();
                
               
                System.out.println("Cnic no:");
                int cnic = scan.nextInt();
                
                System.out.println(" ************************** Hospital Information System*********************** ");
                
                
                
                System.out.println(  "Your name is:" + patientname +"\n"   +fathername +"\n" +wardname +"\n"  +mrno   +"\n" +cnic );
                 
               
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Patients Disease:");
                System.out.println("-----------------");
                String [] patientills = {"fever","flu","BP"};
                for (String temp1:patientills)
                {
                	System.out.println(temp1);
                }
                
                System.out.println("------------------------------------------------------------------------");
                System.out.println("Doctors:");
                System.out.println("--------");
                
                String [] doctors = {"Sadaqat Ali","Farooq memon","Ejaz Yousafzai"};
                for (String temp2:doctors)
                {
                	System.out.println(temp2);
                }
                
           
                System.out.println("------------------------------------------------------------------------");
                System.out.println("module2");
                System.out.println("-------");
                System.out.println("Dr appointment time:");
                System.out.println("4pm");
                
                System.out.println("Dr appointment fees:");
                System.out.println("1000");
                
            
               
                
                
                System.out.println("fee option:");
                System.out.println("(a)online");
                System.out.println("(b)online");
                System.out.println("(c)online");
                System.out.println("(d)online");
             
                System.out.println("------------------------------------------------------------------------");
                Date date = new Date();
                System.out.println(date);
                
                
               
          
             
	}

}
