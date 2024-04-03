import java.util.*;
class sliding2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int left=0,right=1;
		int length=0;
		int flipcount=0;
		int n=s.length();
		char[] c=s.toCharArray();
		//System.out.println(s.substring(left,right));
		while(right<n){
			if(c[right]=='0'){
				flipcount++;
			}

while(flipcount>1){
	if(c[left]=='0'){
		flipcount--;
	}
	left++;
}

			length=Math.max(length,right-left+1);
			right++;
		}
		System.out.println(length);
	}
}