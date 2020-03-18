import java.util.Scanner;
public class Challenge1_4
{
    public static void main(String[] args)
   {
      Scanner myScanner = new Scanner(System.in);
      // Fill in values for these variables
      int currentYear = myScanner.nextInt();
      int birthYear = myScanner.nextInt();
      int dogBirthYear = myScanner.nextInt();
      myScanner.close();
      // Write a formula to calculate your age
      // from the currentYear and your birthYear variables
      int age = currentYear - birthYear;

      // Write a formula to calculate your dog's age
      // from the currentYear and dogBirthYear variables
      int dogAge = currentYear - dogBirthYear;

      // Calculate the age of your dog in dogYears (7 times a human year)
      int dogYearsAge = dogAge*7;

      // Print out your age, your dog's age, and your dog's age in dog years. Make sure you print out text too so that the user knows what is being printed out.
      
      System.out.println("Your age: " + age);
      System.out.println("Dog's age: "+ dogAge);
      System.out.println("Dog's age in dog year: "+ dogYearsAge);

   }
}