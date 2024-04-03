import java.util.*;
class leetcode{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       int target=sc.nextInt();
        int[] prefix=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
sum=sum+arr[i];
prefix[i]=sum;
        }
       
        int left=0,right=0;
        int minlength=0;
       //ArrayList<Integer> l1=new ArrayList<Integer>();
        while(right<arr.length){
             int sum1=0;
            if(right==0||left==0){
            sum1=prefix[right];

            }
            else{
                sum1=prefix[right]-prefix[left-1];
                 //System.out.print(sum1+" ");
            }
            
             while(sum1>=target&&left<=right){
                minlength=Math.min(minlength,right-left+1);
       sum1=sum1-prefix[left];
       left++;
   }
   else{
     right++;
   }
   
 
   
    }
    System.out.println(minlength);
}
}