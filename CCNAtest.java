//****************************************************//
//* Author:1717859                                   *//
//* Week:5                                           *//
//* Task:3A                                          *//
//* Description:A program that counts the number of   *//
//*              passes for a CCNA Course and returns*//
//*              the passes, fails, meeting urgently *//
//*              required using JOption Pane          *//
//*Date: 08/03/2019                                   *//
//*                                                  *//
//*                                                  *//
//****************************************************//

import javax.swing.JOptionPane; 
public class CCNAtest{

	//declare variables 
		private static int amountPasses = 0;
		private static int amountFails = 0;
		private static int countGrade = 0; //Counts Passes / fails
		private static int gradeResult = 0; //Grade result = feedback
			
	public static void main(String[] args)
	{
		while (countGrade <=19)
		{
			gradeResult = Integer.parseInt(JOptionPane.showInputDialog("Enter The Result: 1 For Pass , 2 For Fail" ));
			
			if (gradeResult ==1) {
				amountPasses = amountPasses  + 1;
				countGrade = countGrade +1;
				
			} else if (gradeResult == 2) {
				
				amountFails = amountFails + 1;
				countGrade = countGrade +1;
			} else {
				
				JOptionPane.showMessageDialog(null,"Invalid Entry Try Again");
			} 
		}//End while
		JOptionPane.showMessageDialog(null,"Amount of Passes are: " + amountPasses + 
				"\n Amount of Fails are: " + amountFails);
		// Message will show if 16 students have passed
	    //4 students fail and a fail message appears1
	if (amountPasses >=16) {
		JOptionPane.showMessageDialog(null," Congratulations To The Tutors " + amountPasses + " Students Passed");
	} else if (amountFails >=4) {
		JOptionPane.showMessageDialog(null," Better Luck Next Time " + amountFails +" Students Failed");
		}else{
		JOptionPane.showMessageDialog(null," Meeting Urgentley Required");
		} 
}
} // End Class