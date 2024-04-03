import java.util.*;
class practice{

	
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr=new int[n];
        for(int i=0;i<n;i++){
        	arr[i]=sc.nextInt();
       }
       int k=sc.nextInt();
       int[] temp=new int[k];
       for(int i=(n-k);i<n;i++){
temp[i-n+k]=arr[i];
       }
       System.out.println(Arrays.toString(temp));
       for(int i=(n-k)-1;i>=0;i--){
       	arr[i+k]=arr[i];
       }
       System.out.println(Arrays.toString(arr));
       for(int i=0;i<k;i++){
       	arr[i]=temp[i];
       }
     System.out.println(Arrays.toString(arr));
        }
   }