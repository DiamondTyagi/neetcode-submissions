class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> surface = new HashSet<>();
        for(int num: nums){
            if(surface.contains(num)){
                return true;
            }
            else{
                surface.add(num);
            }
        }
        return false;
    }
}