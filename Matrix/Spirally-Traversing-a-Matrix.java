class Solution
{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int top=0,left=0,right=c-1,bottom=r-1;
        while(top<=bottom&&left<=right){
            
            for(int i=left;i<=right;i++)
            list.add(matrix[top][i]);
            top++;
            
            for(int i=top;i<=bottom;i++)
            list.add(matrix[i][right]);
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--)
            list.add(matrix[bottom][i]);
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--)
            list.add(matrix[i][left]);
            left++;
            }
        }
        return list;
    }
}
