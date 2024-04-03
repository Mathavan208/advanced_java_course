import java.util.*;
class heap3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		ArrayList<Integer> l1=new ArrayList<Integer>();
		Set<Integer> s1=new LinkedHashSet<Integer>();
		for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
		l1.add(arr[i]);
		}
		int k=sc.nextInt();
		for(int i=0;i<n;i++){
			s1.add(l1.get(i));
		}
		//System.out.println(s1);
		ArrayList<Integer> l2=new ArrayList<Integer>();
		for(int i:s1){
			l2.add(Collections.frequency(l1,i));
		}
		Collections.sort(l2,Collections.reverseOrder());
		System.out.println(l2);
		HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
		
		for(int i:l1){
			h1.put(i,h1.getOrDefault(i,0)+1);
		}
		//System.out.println(h1);
			PriorityQueue<Map.Entry<Integer,Integer>> p1=new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
			for(Map.Entry<Integer,Integer> i:h1.entrySet()){
				p1.offer(i);
				if(p1.size()>k){
					p1.poll();
				}
			}
//p1.forEach(System.out::println);
ArrayList<Integer> res=new ArrayList<Integer>();
while(!p1.isEmpty()){
	res.add(p1.poll().getKey());
}

}
}
