import java.util.*;
class hashing4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
		for(int i:nums){
      h1.put(i,h1.getOrDefault(i,0)+1);
		}
		for(int i=0;i<n;i++){
			if(!h1.containsKey(i)){
				System.out.println(i);
				break;
			}
		}
		}
}