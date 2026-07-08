import java.util.Arrays;
class KRotate{
    public static int[] shift(int [] a,int n) {
        if(n==0)
        return a;
        else{
            int k=a[a.length-1];
            for(int i=a.length-1;i>=1;i--){
                a[i]=a[i-1];
            }
            a[0]=k;
            return shift(a, n-1);
            
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int k=3;
        a=shift(a, k);
        System.out.println("Rotated Array = "+Arrays.toString(a));
    }
}