//****************************************************//
//* Author:1717859                                   *//
//* Week:5                                           *//
//* Task:3A                                          *//
//* Description:A program that counts the number of   *//
//*              passes for a CCNA Course and returns*//
//*              the passes, fails, meeting urgently *//
//*              required                             *//
//*Date: 08/03/2019                                   *//
//*                                                  *//
//*                                                  *//
//****************************************************//
import java.util.Scanner;
public class CCNA {

	//declare variables 
	private static int amountPasses = 0;
	private static int amountFails = 0;
	private static int countGrade = 0; // Counts Passes / fails
	private static int gradeResult = 0; //Grade result = feedback

	public static void main(String[] args) {
		//Reads users input
		Scanner in =new Scanner(System. in );
		countGrade = 0;
		
		while (countGrade <= 19) {
			System.out.println("Enter The Result: 1 For Pass , 2 For Fail"); //Displays Grade Marker
			gradeResult = in.nextInt(); // Will run 20 times
			if (gradeResult == 1) {
				amountPasses = amountPasses + 1; //if =1 then add to grade counter
				countGrade = countGrade + 1;
			} else if (gradeResult == 2) {
				amountFails = amountFails + 1; //if = 2 then add to grade counter
				countGrade = countGrade + 1;
			}
			else {
				System.out.println("Invalid Entry Try Again"); //Default Case for Code Stability
			}
			
			
		} //End While

		// Message will show if 16 students have passed
		//4 students fail and a fail message appears
		System.out.println(" Amount of Passes are: " + amountPasses + "\n Amount of Fails are: " + amountFails);
		if (amountPasses >= 16) {
			System.out.println(" Congratulations To The Tutors " + amountPasses + " Students Passed ");
		} else if (amountFails >=4) {
			System.out.println(" Better Luck Next Time " + amountFails + " Students Failed ");
		} else {
			System.out.println(" Meeting Urgently Required ");
		}
	}
} // End Class
