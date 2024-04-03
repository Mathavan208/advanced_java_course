import java.util.*;
class hashing3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Set<Character> s1=new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			s1.add(s.charAt(i));
		}
		if(s1.size()==26){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}