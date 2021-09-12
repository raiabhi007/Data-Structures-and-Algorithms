class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
       int Max = 0;
       int Min = 0;
       int result = arr[n-1] - arr[0];
       for(int i=1;i<n;i++){
           
           if(arr[i]>=k){
               Max = Math.max(arr[i-1]+k,arr[n-1]-k);
               Min = Math.min(arr[i]-k,arr[0]+k);
               result = Math.min(result,Max-Min);
           }
           else
           continue;
       }
      return result;
    }
}
