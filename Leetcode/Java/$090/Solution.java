package $090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 2:55 PM 2018/07/02.
 */
public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length == 0){
            return lists;
        }
        Arrays.sort(nums);
        subsets(lists, new ArrayList<>(), 0, nums);
        return lists;
    }
    public void subsets(List<List<Integer>> lists, List<Integer> list, int index, int[] nums){
        if (!lists.contains(list)){
            lists.add(new ArrayList<>(list));
        }
        for (int i = index; i < nums.length; i++){
            list.add(nums[i]);
            subsets(lists, list, i + 1, nums);
            list.remove(list.size() - 1);
        }
    }

}
