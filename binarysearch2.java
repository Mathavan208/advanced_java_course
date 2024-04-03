import java.util.*;
class binarysearch2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		
		int left=0;
		int right=n-1;
		int res=0;
		while(left<right){
			int mid=(left+right)/2;
			if(arr[mid]==target){
				break;
			}
			if(arr[mid]>target){
				right=mid-1;
			}
			else{
				left=mid+1;
			}
res=mid;
		}
		System.out.println(res);
	}
}