import java.util.*;
class stack3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		Stack<Character> t1=new Stack<>();
		Stack<Character> t2=new Stack<>();
		for(Character i:s1.toCharArray()){
			if(i=='#'&&!t1.isEmpty()){
				t1.pop();
			}
			else{
				t1.push(i);
			}
		}
		for(Character i:s2.toCharArray()){
			if(i=='#'&&!t2.isEmpty()){
				t2.pop();
			}
			else if(i!='#'){
				t2.push(i);
			}
		}
		t1.forEach(System.out::print);
		t2.forEach(System.out::print);
		System.out.println(t1.equals(t2));
	}
}