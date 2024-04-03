import java.util.*;
class hashing2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<Character> l1=new ArrayList<Character>();
		Map<Character,Integer> h1=new HashMap<Character,Integer>();

		for(int i=0;i<s.length();i++){
			l1.add(s.charAt(i));
		}
		for(int i=0;i<s.length();i++){
h1.put(s.charAt(i),Collections.frequency(l1,s.charAt(i)));
		}
		for(Character i:h1.keySet()){
			if(h1.get(i)>=2){
				System.out.println(i);
				break;
			}
		}
	}
}