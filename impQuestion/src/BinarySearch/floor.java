package BinarySearch;


 public class floor {
    public static void main(String[] args) {
         int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 17;
        int ans = findfloor(arr, target);
        System.out.println(ans);
        // in ceiling if element id not there then it return above element the target
        System.out.println(arr[ans]);
    }

    private static int findfloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        while (start <=end) {
            int mid = start +(end - start)/2;
            if (target < arr[mid]){
                end = mid -1 ;

            }
            else if (target > arr[mid]){
                start = mid +1;

            }
            else{
                return mid;
            }
            
        }
        return end;
    }

}