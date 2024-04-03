import java.util.*;
class lambda{
	interface print{
		public void print(int n1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print p=(n1)->System.out.println(n1);
		p.print(n);
	}
}