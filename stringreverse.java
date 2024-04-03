import java.util.*;
class stringreverse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--){
s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
	}
}