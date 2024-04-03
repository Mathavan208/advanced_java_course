import java.util.*;
class sliding3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;

		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int left=0,right=0;
		int count=0;int product=1;
		while(right<n){
          product=product*arr[right];
          while(product>=k&&left<=right){
          	product=product/arr[left];
          	left++;
          }
          count=count+(right-left+1);
          right++;
           //System.out.println(arr[left]*arr[right]);
          
		}
		System.out.println(count);
	}
}