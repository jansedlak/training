public class FindMin {
    /**
     * Find bug and change one line of code for proper solution.
     * Values in array are from <-1000, 1000>
     *
     */
    public static void main(String[] args) {
        findMinValue(new int[]{ -2, 5, -3, 6, 10, -100});
    }

    static void findMinValue(int[] arr){
        int ans = 0;
        for (int i=1; i<arr.length; i++){
            if(ans > arr[i]){
                ans = arr[i];
            }
        }
        System.out.println("Min value: " + ans);
    }
}
