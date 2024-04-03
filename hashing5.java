import java.util.*;
class hashing5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		Map<Integer,Integer> h1=new HashMap<Integer,Integer>();
		for(int i:nums){
			h1.put(i,h1.getOrDefault(i,0)+1);
		}
		//System.out.println(h1);
		int count=0;
		for(int i:h1.keySet()){
			if(h1.containsKey(i+1)){
          //System.out.print(i+1+" ");
             count=count+h1.getOrDefault(i,0);
            // System.out.println(count);
			}
		}
		System.out.println(count);
	}
}