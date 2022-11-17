package u4pp;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if((year % 400 == 0) && year > 1582){
            return true;
        }
        else if((year % 4 == 0) && year > 1582 && year % 100 != 0){
            return true;
        }
        else{
            return false;
        }
    }
}
