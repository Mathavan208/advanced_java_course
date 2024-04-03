import java.util.*;
class stack2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> s1=new Stack<Character>();
		for(Character c:s.toCharArray()){
			if(s1.isEmpty()){
				s1.push(c);
			}
			else if(c==s1.peek()&&!s.isEmpty()){
                     s1.pop();
			}
			else{
				s1.push(c);
			}
		}
		s1.forEach(System.out::print);
	}
}