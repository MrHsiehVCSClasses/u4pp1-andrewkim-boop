package u4pp;

public class MyMath {
    public static int abs(int x){
        if(x < 0){
            return(x * -1);
        }
        return x;
    }
    public static double abs(double x){
        if(x < 0){
            return(x * -1);
        }
        return x;
    }
    public static double pow(double base, int exponent){
        double store = base;
        if(exponent == 0){
            return 1;
        }
        for(int i = 1; i < exponent; i++){
            store *= base;
        }
        return store;
    }
    public static int perfectSqrt(int x){
        if(x < 0){
            return(-1);
        }
        for(int i = 0; i <= x; i++){
            if(i * i == x){
                return i;
            }
            if(i * i > x){
                return -1;
            }
        }
        return -1;
    }
}