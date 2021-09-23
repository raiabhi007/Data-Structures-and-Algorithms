class Solution {
    int minRow(int N, int M, int A[][]) {
        int Min = M;
        int ans = 1;
        for(int i=0;i<N;i++){
            int count = 0;
         for(int j=0;j<M;j++){
             if(A[i][j]==1)
             count++;
         }
         if(count<Min){
         Min = count;
         ans = i;
         }
        }
        return ans+1;
    }
};