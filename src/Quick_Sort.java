public class Quick_Sort {
    public static void main(String[] args) {

        int arr[] = new int[]{8,4,7,9,3,10,5};

        int n = arr.length;
        qSort(arr, 0, n-1 );

        for (int x : arr)
            System.out.print(x + " ");

    }

    static void qSort(int arr[], int l, int h) {
        if (l < h) {
            int pivot = partition(arr, l, h);
            qSort(arr, l, pivot);
            qSort(arr, pivot + 1, h);
        }
    }

    public static int partition(int arr[], int l, int h) {
//

        int pivot = arr[l];
        int i = l - 1, j = h + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j) return j;    // if they crooss each other then you retuen pivot
            int temp = arr[i];      // otherwise you swap arr[i,arr[j]
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}

//        int i=l;int j=h;
//        while(i<j){
//            while(arr[i]<=pivot)i++;
//            while(arr[j]>pivot)j--;
//            if(i<j){
//                // swap(arr[i],arr[j]
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//            }
//        }
//        // swap arr[j],arr[l]
//        int temp=arr[j];
//        arr[j]=arr[l];
//        arr[l]=temp;
//       return j;   //pivot index
