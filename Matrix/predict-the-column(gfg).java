class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        int Max = 0;
        int ans = -1;
        for(int j=0;j<N;j++){
            int count = 0;
            for(int i=0;i<N;i++){
                if(arr[i][j]==0)
                count++;
            }
            if(count>Max){
                Max = count;
                ans = j;
            }
        } 
        return ans;
    }
}