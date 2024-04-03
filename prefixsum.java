import java.util.*;
class prefixsum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int[] prefix=new int[n];
		//prefix[0]=0;
		for(int i=0;i<n;i++){
         sum=sum+arr[i];
         prefix[i]=sum;
		}
		//System.out.println(Arrays.toString(prefix));
	int[][] queries={{0,3},{2,5},{2,4}};
	boolean[] b=new boolean[3];
	int k=sc.nextInt();
	int summer[]=new int[3];
	for(int i=0;i<3;i++){
		int sum1=0;
		int[] arr1=queries[i];
		if(arr1[0]==0){
			 sum1=prefix[arr1[1]];
			summer[i]=prefix[arr1[1]];
}
		else{
		    sum1=prefix[arr1[1]]-prefix[arr1[0]-1];
		
		summer[i]=prefix[arr1[1]]-prefix[arr1[0]-1];
	}
		if(sum1<k){
b[i]=true;
		}
		else{
			b[i]=false;
		}
	}
	System.out.println(Arrays.toString(b));
	System.out.println(Arrays.toString(summer));

	}
}