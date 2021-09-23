class GFG
{
    static void rotate(int matrix[][]) 
    {
        int n = matrix.length;
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }
       for(int i=0;i<n/2;i++){
          int  k = n-i-1;
           for(int j=0;j<n;j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[k][j];
               matrix[k][j] = temp;
           }
       }
    }
}