package leetcoding.challenge.thirtydays;

public class SingleNumber {
	    public int singleNumber(int[] nums) {
	        int result = 0;
	        for(int i: nums){
	            result = result ^ i;
	        }
			return result;
	    }
	
	    public static void main(String[] args) {
			int[] arr = {4,1,2,1,2};
			SingleNumber sn = new SingleNumber();
			sn.singleNumber(arr);
		}
	
}
