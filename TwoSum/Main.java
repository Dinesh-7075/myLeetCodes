package TwoSum;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int arr[] = new int [n];
            for(int i=0; i<n; i++) {
                arr[i] = in.nextInt();
            }
            int target = in.nextInt();
            Solve s1 = new Solve();
            int ans[] = s1.twoSums(arr,target);
            for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
            }
        }
	}
}
class Solve {
    public int[] twoSums(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                  //  return new int[] { i, j };
                }
                }
            }
        return ans;
    }
}
