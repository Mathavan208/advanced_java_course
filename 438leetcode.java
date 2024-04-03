import java.util.*;
class leetcode438{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		Map<Character,Integer> m1=new HashMap<Character,Integer>();
        // Map<Integer,Integer> m2=new HashMap<Integer,Integer>();
         ArrayList<Character> l1=new ArrayList<Character>();
for(int i=0;i<s1.length();i++){
m1.put(s1.charAt(i),Collections.frequency(l1,s1.charAt(i)));
}
System.out.println(m1);
	}
}