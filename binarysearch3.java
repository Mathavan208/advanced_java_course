import java.util.*;
class binarysearch3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] nums=new int[n];
        int[] queries=new int[m];
        int[] prefix=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
           nums[i]=sc.nextInt();
           sum=sum+nums[i];
           prefix[i]=sum;
        }

        for(int i=0;i<m;i++){
        	queries[i]=sc.nextInt();
        }
        Arrays.sort(prefix);
        //System.out.println(Arrays.toString(prefix));
        //System.out.println(Arrays.toString(queries));
        
        for(int i=0;i<m;i++){
        	int res=0;
        	int left=0;
        int right=nums.length-1;
        	//System.out.print(queries[i]);
               while(left<=right){
               	int mid=(left+right)/2;

               	if(prefix[mid]==queries[i]){
                     res=mid+1;
               		break;
               	}
               	else if(prefix[mid]<queries[i]){
               		left=mid+1;
               	}
               	else{
               		right=mid-1;
               	}
               	res=left;
               }
queries[i]=res;
        }
        System.out.println(Arrays.toString(queries));
	}
}