import java.util.*;
class hashing1{
	public static void main(String[] args){
		//It is target pair sum problem 
		//they are given an array we need to find the sum of pairs that is equal to the target
		//So here we used to find second integer of the sum
		// that is if target =8 the one integer must be in array target=a+b b=target-a we need to find position of b in the array 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num=new int[n];
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
			m1.put(num[i],i);
		}
		int target=sc.nextInt();
		ArrayList<Integer> l1=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++){
			int c=target-num[i];
			if(m1.containsKey(c)){
         l1.add(m1.get(c));
         l1.add(i);
         break;
			}
		
		}
		System.out.println(l1);
}
}