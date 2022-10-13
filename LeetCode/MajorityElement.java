Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2



class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int target = nums[0];
        int count = 0;
        
        for(int i  = 0;i<nums.length;i++){
            if(nums[i] == target){
                count++;
                if(count > nums.length/2){
                    return nums[i];
                }
            }
            else{
                count = 1;
                target = nums[i];
            }
        }
        return 0;
    }
}

class Solution {
     public int  majorityElement(int[] nums) {
    	Arrays.sort(nums);
    	return nums[nums.length/2];
    }
}
