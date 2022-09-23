public class MergeSort {


    public static void main(String[] args) {
        //int a[] = {10, 15, 20, 40, 8, 11, 15, 22, 25,45,9};
        int a[]={10,15,20,40,8,11,55};
        int l=0;
        int h=a.length-1;
        sort(a, 0, h);
        for (int x : a)
            System.out.print(x + " ");
    }


    static void sort(int arr[], int l, int h)
    {
         if(l<h) {
             int m = (l + h) / 2;
             sort(arr, l, m);
             sort(arr, m + 1, h);
             merge(arr, l, m, h);
         }
    }
    

    public static void merge(int arr[], int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h -m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[i+l];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[m+1+j];
        }
      // merge two sorted array
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];
    }
}

