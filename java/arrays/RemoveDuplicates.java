//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

public class RemoveDuplicates {
    public int removeDuplicateElements(int[] nums) {
        int i=0, n = nums.length;
        if (n==0) return 0;
        for(int j=1; j<n; j++) {
            if(nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = rd.removeDuplicateElements(nums);
        System.out.println("Length after removing duplicates: " + k);
        System.out.print("Array after removing duplicates: ");
        for(int i=0; i<k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}