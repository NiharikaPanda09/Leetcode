public class MissingNumber {
    public static void main(String[] args) {
        int [] arr = {0,1,3};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

        static int missingNumber(int[] nums) {
            int n=nums.length;
            int total= n*(n+1)/2;
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=nums[i];
            }
            return total-sum;
        }
    }

