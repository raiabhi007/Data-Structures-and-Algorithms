class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int Max = 0;
        int ans = -1;
        for(int i=0;i<n;i++){
            int count = 0;
            int j=m-1;
            while(j>=0){
                if(arr[i][j]==1){
                count++;
                j--;
                }
                else
                break;
            }
            if(Max<count){
                Max = count;
                ans = i;
            }
        }
        return ans;
    }
}