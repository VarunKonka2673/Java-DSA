import java.util.Arrays;
class ZerosLast{
    public static void main(String[] args) {
        int a[]={1,0,8,0,4,3,2,0,0,5};
        if(a.length<1)System.out.println("no elements in the Array");
        else{
            int j=0;
            for(int i=0;i<a.length;i++){
                if(a[i]!=0)
                a[j++]=a[i];
            }
            for(int i=j;i<a.length;i++){
                a[i]=0;
            }
            System.out.println("Array = "+Arrays.toString(a));
        }
    }
}