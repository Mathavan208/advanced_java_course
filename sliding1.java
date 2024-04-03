import java.util.*;
class sliding1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int left=0,right=0;
		int sum=0;
		int maxlength=0;
		while(right<n){
             sum=sum+arr[right];


             while(sum>k){
             	sum=sum-arr[left];
             	left++;
             }
maxlength=Math.max(maxlength,right-left+1);
             right++;
		}
		System.out.println(maxlength);
	}
}