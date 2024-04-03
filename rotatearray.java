import java.util.*;
class rotatearray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int[] res=new int[n];
		 int left=0,right=((nums.length)-1);

		 // int temp1=nums[0];
		 // nums[0]=nums[n/2];
		 // nums[n/2]=temp1;
        while(left<right){
           System.out.println(nums[left]+" "+ nums[right]);

            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            //System.out.println(nums[left]+" "+ nums[right]);
            left++;
            right--;
        }
        left=0;right=k-1;
         while(left<right){
           System.out.println(nums[left]+" "+ nums[right]);

            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            //System.out.println(nums[left]+" "+ nums[right]);
            left++;
            right--;
        }
        left=k;right=n-1;
         while(left<right){
           System.out.println(nums[left]+" "+ nums[right]);

            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            //System.out.println(nums[left]+" "+ nums[right]);
            left++;
            right--;
        }
System.out.println(Arrays.toString(nums));
	}
}