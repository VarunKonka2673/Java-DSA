import java.util.Arrays;
class Reverse{
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int j=a.length-1,t;
        System.out.println("Array :" +Arrays.toString(a));
        for(int i=0;i<a.length/2;i++){
            t=a[i];
            a[i]=a[j];
            a[j--]=t;
        }
        System.out.println("Reversed Array :" +Arrays.toString(a));
    }
}