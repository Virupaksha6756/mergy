public class mergesort1 {

    public static void conquer(int arr[],int first,int mid,int last){
       int merged[] = new int[last - first +1];
       int idx1 = first;
       int idx2 = mid+1;
       int x = 0;

       while(idx1 <= mid && idx2 <= last){
        if(arr[idx1] <= arr[idx2]) {
            merged[x++] = arr[idx1++];
        }

          else {
            merged[x++] = arr[idx2++];
          } 
       }

       while(idx1 <= mid){
        merged[x++] = arr[idx1++];
       }

       while(idx2 <= last){
        merged[x++] = arr[idx2++];
       }

       for(int i=0, j=first; i<merged.length;i++,j++){
            arr[j]=merged[i];
       }

    }
    public static void divide(int arr[], int first,int last){
        if(first >= last) {
            return;
        }
        int mid = first + (last - first)/2;
        divide(arr, first, mid);
        divide(arr, mid + 1, last);
        conquer(arr,first,mid,last);

         
    }
    public static void main(String args[]){
        int arr[] = {5,6,7,8,9,4,3,12,14};
        int n = arr.length;

        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
