import java.io.*;
import java.util.Scanner;
public class aa {
	public static void main(String args[]) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String o ;
		do{
			System.out.println("1. grade");
			System.out.println("2. tax");
			System.out.println("3. com");
			System.out.println("4. cal");
			System.out.println("5. mul");
			System.out.println("0. exit");
			o = stdin.readLine();
			System.out.println(stdin.readLine());
			
			if(o.equals("1")) {
				grade();
			}else if(o.equals("2")){
				tax();
			}else if(o.equals("3")){
				com();
			}else if(o.equals("4")){
				cal();
			}else if(o.equals("5")){
				mul();
			}
		}while(Integer.parseInt(o) !=0);
	}





	public static void grade() throws IOException {  
	System.out.println("----------------PP------------------");
         BufferedReader stdid = new BufferedReader(new InputStreamReader(System.in));  

        int i; 
        String studentNum;  
        System.out.print("Enter student: ");  
        studentNum = stdid.readLine();  
        String student[][] = new String[Integer.parseInt(studentNum)][3];
        for (i = 0; i < Integer.parseInt(studentNum); i++) {  

            System.out.print("ID: ");  
            student[i][0] = stdid.readLine();  
            
	    System.out.print("Name: ");  
            student[i][1] = stdid.readLine();  
            
	    System.out.print("Score: ");  
            student[i][2] = stdid.readLine();  
        }  

        System.out.println("----------------------------------");  

        for (i = 0; i < Integer.parseInt(studentNum); i++) {  

            String stdGarde;  
            if (Integer.parseInt(student[i][2]) > 80) {  
                stdGarde = "A";  
            } else if (Integer.parseInt(student[i][2]) > 70) {  
                stdGarde = "B";  
            } else if (Integer.parseInt(student[i][2]) > 60) {  
                stdGarde = "C";  
            } else if (Integer.parseInt(student[i][2]) > 50) {  
                stdGarde = "D";  
            } else {  
                stdGarde = "F";  
            }  
            System.out.println("ID: " + student[i][0] + "\tName: " + student[i][1] + "\tGarde: " + stdGarde); 
	System.out.println("----------------PP------------------"); 
        }  
    }  
	


	public static void tax() throws IOException {  
	System.out.println("----------------PP------------------");
         BufferedReader stdid = new BufferedReader(new InputStreamReader(System.in));  

        int i; 
        String taxNum;  
        System.out.print("How many calculate: ");  
        taxNum = stdid.readLine();  
        String tax[][] = new String[Integer.parseInt(taxNum)][3];
        for (i = 0; i < Integer.parseInt(taxNum); i++) {  

            System.out.print("EmployeeID: ");  
            tax[i][0] = stdid.readLine();  
            
	    System.out.print("Employee: ");  
            tax[i][1] = stdid.readLine();  
            
	    System.out.print("Salary: ");  
            tax[i][2] = stdid.readLine();  
        }  

        System.out.println("----------------------------------");  

        for (i = 0; i < Integer.parseInt(taxNum); i++) {  

            double vat;  
            if (Integer.parseInt(tax[i][2]) <= 5000) {  
               vat = (Integer.parseInt(tax[i][2])* 4) /100;  
            } else if (Integer.parseInt(tax[i][2]) >=5000 && Integer.parseInt(tax[i][2]) >=9999) {  
                vat = (Integer.parseInt(tax[i][2])* 8) /100; 
            } else if (Integer.parseInt(tax[i][2]) >=10000 && Integer.parseInt(tax[i][2]) >=19999) {  
                 vat = (Integer.parseInt(tax[i][2])*10) /100; 
            } else if (Integer.parseInt(tax[i][2]) >=20000 && Integer.parseInt(tax[i][2]) >=29999) {  
                vat = (Integer.parseInt(tax[i][2])*13) /100;
            } else {  
                vat = (Integer.parseInt(tax[i][2])*15) /100;
            }  
            System.out.println("EmployeeID: " + tax[i][0] + "\t Employee: " + tax[i][1] + "\t tax: " + vat); 
		System.out.println("----------------PP------------------"); 
        }  
    }  



	
	public static void com() throws IOException {  
	System.out.println("----------------PP------------------");
         BufferedReader stdid = new BufferedReader(new InputStreamReader(System.in));  

        int i; 
        String comNum;  
        System.out.print("How many calculate: ");  
        comNum = stdid.readLine();  
        String com[][] = new String[Integer.parseInt(comNum)][3];
        for (i = 0; i < Integer.parseInt(comNum); i++) {  

            System.out.print("EmployeeID: ");  
            com[i][0] = stdid.readLine();  
            
	    System.out.print("Employee: ");  
            com[i][1] = stdid.readLine();  
            
	    System.out.print("Salary: ");  
            com[i][2] = stdid.readLine();  
        }  

        System.out.println("----------------------------------");  

        for (i = 0; i < Integer.parseInt(comNum); i++) {  

            double net;
	    double salarynet;	  
            if (Integer.parseInt(com[i][2]) <= 5000) {  
                 net = 0;
		salarynet=(Integer.parseInt(com[i][2])+net);  
            } else if (Integer.parseInt(com[i][2]) <= 20000) {  
                net = (Integer.parseInt(com[i][2])* 5) / 100;
		salarynet = (Integer.parseInt(com[i][2])+ net); 
            } else {  
                net = (Integer.parseInt(com[i][2]) * 7) / 100;
   		salarynet = (Integer.parseInt(com[i][2]) + net);
            }  
            System.out.println("EmployeeID: " + com[i][0] + "\t Employee: " + com[i][1] + "\t com: " + salarynet+"\t Bonus "+net);
	System.out.println("----------------PP------------------");  
        }  
    }  




		static void cal()throws IOException{
		System.out.println("----------------PP------------------");
		BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
		String a[][] = new String[1][3];
			System.out.print("Number1 : ");
				a[0][0] = stdin.readLine();
			System.out.print("Symbol : ");
				a[0][1] = stdin.readLine();
			System.out.print("Number2 : ");
				a[0][2] = stdin.readLine();
		double x=0;
			if(a[0][1].equals("+")){
				x = Double.parseDouble(a[0][0])+Double.parseDouble(a[0][2]);
			}
			else if(a[0][1].equals("-")){
				x = Double.parseDouble(a[0][0])-Double.parseDouble(a[0][2]);
			}
			else if(a[0][1].equals("*")){
				x = Double.parseDouble(a[0][0])*Double.parseDouble(a[0][2]);
			}
			else if(a[0][1].equals("/")){
				x = Double.parseDouble(a[0][0])/Double.parseDouble(a[0][2]);
			}
			System.out.println("Answer Is : "+x);
		System.out.println("----------------PP------------------");
		}


		



	 static void mul() {
	 System.out.println("----------------PP------------------");
	 Scanner Keyboard = new Scanner(System.in);
	 System.out.print("Enter Multiplication table : ");
         int number1 = Keyboard.nextInt();
		int i = number1;
		int a = 1;
		while(a<=12){
			System.out.println(i+"*"+a+"="+i*a);
			a++;
	System.out.println("----------------PP------------------");
		}
	}
}
