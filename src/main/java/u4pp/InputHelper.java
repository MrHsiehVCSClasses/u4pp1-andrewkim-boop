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
        int i = min - 1;
        while(i < min || i > max){
            System.out.println(prompt);
            System.out.println("Your input is - " + hold);
            hold = myScanner.nextLine();
            i = Integer.parseInt(hold);
        }
        return i;
    }
}
