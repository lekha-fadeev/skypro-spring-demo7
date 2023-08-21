package pro.sky.skyprospringdemo7;

public class TestUtils {
    public static String formatResult (int num1, int num2, String operation, String result){
        return String.format("%x %x %x = %s", num1, operation, num2, result);
    }
}
