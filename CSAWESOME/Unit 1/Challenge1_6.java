public class Challenge1_6
{
   public static void main(String[] args)
   {
      // 1. Declare 3 int variables for grades and initialize them to 3 values
      int a = 90, b = 100, c = 94;
      // 2. Declare an int variable for the sum of the grades
      int sum;
      // 3. Declare a variable for the average of the grades
      double average;
      // 4. Write a formula to calculate the sum of the 3 grades (add them up).
      sum = a + b + c;
      // 5. Write a formula to calculate the average of the 3 grades from the sum using division and type casting.
      average = (double)sum/3;
      // 6. Print out the average
      System.out.println(average);
   }
}
