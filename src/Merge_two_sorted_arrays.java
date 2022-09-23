public class Merge_two_sorted_arrays {
   public  static void merge(int a[], int b[], int m, int n){
       int i=0,j=0;
       while(i<m && j<n){
           if(a[i]<=b[j]){
               System.out.print(a[i]+" ");
               i++;
           }
           else
               System.out.print(b[j]+" ");
           j++;
       }
       while(i<m){
           System.out.print(a[i]+" ");
           i++;
       }
       while(j<n){
           System.out.print(b[j]+" ");
           j++;
       }
   }



    public static void main(String[] args) {
        int a[] = new int[]{10,15,20,40};
        int b[] = new int[]{5,6,6,10,15};

        int m = a.length;
        int n = b.length;
        merge(a,b,m,n);    //5 6 6 10 10 15 15 20 40
    }
}
