class Solution
{
    static long countAndMerge(long[] arr,int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        long left[] = new long[n1];
        long right[] = new long[n2];
        
        for(int i=0;i<n1;i++)
        left[i] = arr[l+i];
        
        for(int i=0;i<n2;i++)
        right[i] = arr[mid+i+1];
        
        long res = 0;
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
                res = res + (n1-i);
            }
            k++;
        }
        while(i<n1){
            arr[k++] = left[i++];
            
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
        return res;
    }
    static long mergeSort(long[] arr,int l,int r){
        long res = 0;
        if(l<r){
            int mid = (l+r)/2;
            res+= mergeSort(arr,l,mid);
            res+= mergeSort(arr,mid+1,r);
            res+= countAndMerge(arr,l,mid,r);
        }
        return res;
    }
    static long inversionCount(long arr[], long N)
    {
        int n = (int)N;
        
        return mergeSort(arr,0,n-1);
    }
}