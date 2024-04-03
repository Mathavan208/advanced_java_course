import java.util.*;
class mapentry{
	// interface sort{
	// 	public List<Integer> sort(Set<Map.Entry<Integer,String>> x);
	// }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> h1=new HashMap<>();
	int n=sc.nextInt();
		for(int i=0;i<n;i++){
h1.put(sc.nextInt(),sc.next());
		}
		//Set<Map.Entry<Integer,String>> s1=h1.entrySet();
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		h1.entrySet().forEach(i->p1.add(i.getKey()));
		p1.forEach(i->System.out.println(i));
		//s1.forEach(i->System.out.println(i.getValue()));
		// for(Map.Entry<Integer,String> i:s1){
		// 	System.out.print(i.getValue()+" ");
		// 	System.out.print(i.getKey()+" ");
		// }
	}
}