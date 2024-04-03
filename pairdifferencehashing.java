import java.util.*;
class pairdifferencehashing{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		int[] num=new int[n];
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
			m1.put(num[i],i);
		}
		int k=sc.nextInt();
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int c=k+num[i];
			if(m1.containsKey(c)){
				l1.add(i);
				l1.add(m1.get(c));
				
				break;
			}
			
		}
		System.out.println(l1);
	}
}