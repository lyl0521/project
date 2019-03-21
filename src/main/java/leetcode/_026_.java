package leetcode;

public class _026_ {
    //    给定排序的数组nums，就地删除重复项，使每个元素只出现一次并返回新的长度。
//
//    不要为另一个数组分配额外的空间，你必须这样做修改输入数组就地用O（1）额外的内存。
    public int removeDuplicates(int[] nums){
        int i = 0;
        for (int j = 1 ; j< nums.length -1; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];

            }
        }
        return i+1;
    }
}
