import java.util.*;
class stack1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stack<Character> s1=new Stack<>();
		boolean b=true;
		ArrayList<Character> l1=new ArrayList<Character>();
		for(Character c:s.toCharArray()){
			l1.add(c);
		}
		for(Character c:l1){
			if(c=='('||c=='['||c=='{'){
				if(c=='('&&l1.contains(')'))
				s1.push(c);
			else if(c=='['&&l1.contains(']'))
				s1.push(c);
			else if(c=='{'&&l1.contains('}'))
				s1.push(c);
			else{
				b=false;
			    break;
			}
		}
			else if(c==')'&&!s1.isEmpty()&&s1.peek()=='('){
				s1.pop();
			}
			else if(c=='}'&&!s1.isEmpty()&&s1.peek()=='{'){
				s1.pop();
			}
			else if(c==']'&&!s1.isEmpty()&&s1.peek()=='['){
				s1.pop();
			}
			else{
b=false;
break;
			}
		}
		System.out.println(b);
	}
}