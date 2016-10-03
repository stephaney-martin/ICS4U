package martin;
import java.util.Scanner;
import java.util.ArrayList;
public class SchoolSystem {
	
static ArrayList<Student>studRecs=new ArrayList<Student>();

// Create a method to add student
	public static void addStudent() {
		
		Student student1=new Student();
		Scanner input= new Scanner(System.in);
		System.out.println("First name : ");
		String stu1fn=input.nextLine();
		student1.setfirstName(stu1fn);
		System.out.println("Last name : ");
		String stu1ln=input.nextLine();
		student1.setlastName(stu1ln);
		System.out.println("Address : ");
		String stu1add=input.nextLine();
		student1.setaddress(stu1add);
		System.out.println("City : ");
		String stu1city=input.nextLine();
		student1.setcity(stu1city);
		System.out.println("Province : ");
		String stu1prov=input.nextLine();
		student1.setprovince(stu1prov);
		System.out.println("Postal Code : ");
		String stu1pos=input.nextLine();
		student1.setpostalCode(stu1pos);
		studRecs.add(student1);  
		System.out.println("The student "+student1.getfirstName()+" "+student1.getlastName()+" has been added.");							}
// Create a method to add to the array list(for loop)
// Create a method to call the for loop for all the input
	public static void main (String[]args){

		// make menu
		// if they select that option, add student
		int addStudent=1; // option 1
		int printStudent=2;//option 2
		int printAll=3;//option 3
		int remove=4;//option 4
		
		Scanner input= new Scanner(System.in);
		System.out.println("Would you like to : \n 1. Add a student \n 2. Print a student\n 3. Print all students \n 4. Remove student");
		int userInput = input.nextInt();
		
		if (userInput==1){
			addStudent();
	
		} 	else if  (userInput==2){		// give options that match last name ---> (if last name is equal to user input)
//			 Find student by last name
			 System.out.println("Search student by last name. Enter last name. ");
			 String userSearch=input.nextLine();
			// if(lastname==userSearch){
			 System.out.println("Search student by first name. Enter first name. ");
			 String userSearch=input.nextLine();
			} else if (userInput==3) {
				System.out.println(studRecs);
			}else{
				System.out.println("What student would you like to remove?");
				 arrlist.remove(removeStudent);
			}
			
		
			
//		}
//	}

//		for (int i=0; i< studRecs.size();i++)
//		{
//			System.out.println(studRecs.get(i).getfirstName());
//			

	}
}
