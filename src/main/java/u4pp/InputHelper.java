package u4pp;
import java.util.Scanner;
public class InputHelper {
    static Scanner myScanner = new Scanner(System.in);
    public static boolean getYesNoInput(String prompt){
        System.out.println(prompt);
        String hold = myScanner.nextLine();
        while(hold.charAt(0) != 'Y' && hold.charAt(0) != 'y' && hold.charAt(0) != 'N' && hold.charAt(0) != 'n'){
            System.out.println("Your input is - " + hold + "\nPlease input either yes or no");
            System.out.println(prompt);
            hold = myScanner.nextLine();
        }
        if(hold.charAt(0) != 'Y' || hold.charAt(0) != 'y'){
            return true; 
        }
        else{
            return false;
        }
    }
    //this code doesn't work so i gave up
    public static int getIntegerInput(String prompt, int min, int max){
        System.out.println(prompt);
        String hold = myScanner.nextLine();
        String hsieh = "hi";
        int num;
        while(hsieh != "bye")
            System.out.println("Your input is - " + hold + "\nPlease input a number");
            System.out.println(prompt);
            hold = myScanner.nextLine();
            try {
                num = Integer.parseInt(prompt);
                if(num >= min && num <= max){
                    return num;
                }
                else{
                    System.out.println("Please type a number between " + min + " and " + max);
                    System.out.println(prompt);
                    hold = myScanner.nextLine();
                    return num;
                }
            }   
            catch (NumberFormatException e) {
                System.out.println("That was not an integer, please try again");
            }
            return 0;
            //this try, catch sequence has been reutilized from https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java
    }
}
