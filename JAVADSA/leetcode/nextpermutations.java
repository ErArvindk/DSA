import array.questions.revelrsar;

public class nextpermutations {
            public void nextPermutation(int[] nums) {
                int len = nums.length;
                int i = len - 2;
                while(i >= 0 && nums[i] >= nums[i+1]){
                    i--;
                }
                if(i >= 0){
                    int j = len - 1;
                    while(nums[j] <= nums[i])
                        j--;
                    
                    swap(nums, i, j);
                }
                reverse(nums, i+1, len-1);
            }
            private void swap(int[] nums, int i, int j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            private void reverse(int[] nums, int st, int end){
                while(st < end){
                    swap(nums, st, end);
                    st++; 
                    end--;
                }
            }
    
      // public void nextPermutation(int[] nums) {
      //     int ind1 = -1;
      //     int ind2 = -1;
  
      //     // Step 1: Find the first decreasing element from the right
      //     for (int i = nums.length - 2; i >= 0; i--) {
      //         if (nums[i] < nums[i + 1]) {
      //             ind1 = i;
      //             break;
      //         }
      //     }
  
      //     if (ind1 == -1) {
      //         // If no such element is found, reverse the entire array
      //         reverse(nums, 0);
      //     } else {
      //         // Step 2: Find the next greater element to swap with
      //         for (int i = nums.length - 1; i >= 0; i--) {
      //             if (nums[i] > nums[ind1]) {
      //                 ind2 = i;
      //                 break;
      //             }
      //         }
  
      //         // Swap elements at ind1 and ind2
      //         swap(nums, ind1, ind2);
  
      //         // Step 3: Reverse the part of the array after ind1
      //         reverse(nums, ind1 + 1);
      //     }
      // }
  
      // // Helper method to swap two elements in the array
      // void swap(int[] nums, int i, int j) {
      //     int temp = nums[i];
      //     nums[i] = nums[j];
      //     nums[j] = temp;
      // }
  
      // // Helper method to reverse the array starting from a given index
      // void reverse(int[] nums, int start) {
      //     int i = start;
      //     int j = nums.length - 1;
      //     while (i < j) {
      //         swap(nums, i, j);
      //         i++;
      //         j--;
      //     }
      // }
  
      public static void main(String[] args) {
          int[] num = {1, 2, 3, 4, 5};
          nextpermutations np = new nextpermutations();
          np.nextPermutation(num);
  
          // Output the next permutation
          for (int i = 0; i < num.length; i++) {
              System.out.print(num[i] + " ");
          }
      }
  }
  