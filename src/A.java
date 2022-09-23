public class A {
    public static void selection(int a[]){
        for(int i=0;i<a.length;i++){
            int small=i;
            for(int j=i+1;j<a.length;j++){
                if(a[small]>a[j]){
                    small=j;
                }
            }
            //swap
            int temp=a[i];
            a[i]=a[small];
            a[small]=temp;
        }
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }



    public static void main(String[] args) {
        int a[]={7,8,3,1,2};
        selection(a);
    }
}
