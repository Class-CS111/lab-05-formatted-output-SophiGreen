// STUDENT NAME:Sophia Platas
// COLLABORATORS: <tutors, instructor, or anyone else who helped you>
// DATE: 4/9/2025
// DESCRIPTION: <a sentence about what the purpose of this program is>

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double initialAmount = 1.68; 
    int centsRemaining = 0;
    int numQuarters = 0;
    int numDimes = 0;
    int numNickles = 0;


    //CALCULATION SECTION
    centsRemaining = (int) (100 * initialAmount);
    numQuarters = centsRemaining / 25;
    centsRemaining %= 25;
    numDimes = centsRemaining / 10;
    centsRemaining %= 10;
    numNickles = centsRemaining / 5;
    centsRemaining %= 5;



    //OUTPUT SECTION
    System.out.println(centsRemaining);
    System.out.println(numQuarters);
    System.out.println(numDimes);
    System.out.println(numNickles);
    
     System.out.printf("$%.2f can be coverted to %d quarters, %d dimes, %d nickles, and % pennies.",initialAmount,numQuarters,numDimes,numNickles,centsRemaining);
    
  }

}
