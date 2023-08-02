package org.java8.programming.dsa.array;

public class CanJump {
    public static void main(String[] args) {
        canJump(new int[]{2, 3, 1, 1, 4});
    }

    public static boolean canJump(int[] nums) {

        int jump = 0;
        int i = 0;
        int n = nums.length;
        while (i < n) {
            while (jump <= nums[i]) {
                jump++;
            }
            i = jump;
            if(jump>n) break;
        }
        return jump == n - 1 ? true : false;
    }
}
