import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    
    public static long countTrue() {
        Boolean[] arr = {true, false, false, true, false, false};
        long count = Arrays.stream(arr).filter(s -> s).count();
        System.out.println("Count is: " + count);
        return count;
    }

    public static void main(String[] args) {
        countTrue();
    }
}
