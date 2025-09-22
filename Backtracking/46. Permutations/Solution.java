class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }

    private void backtrack(List<List<Integer>> rs, ArrayList<Integer> temp, int nums[]) {
        if (temp.size() == nums.length) {
            rs.add(new ArrayList<>(temp));
            return;
        }

        for (int num : nums) {
            if (temp.contains(num)) continue;

            temp.add(num);
            backtrack(rs, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}