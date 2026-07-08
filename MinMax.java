import java.util.Arrays;
class MinMax{
    public static void minmax(int a[]){
        int max=Integer.MIN_VALUE,min=a[0],maxind=0,mind=0;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
            max=a[i];
            maxind=i;
            }
            else if(min>a[i]){
            min=a[i];
            mind=i;
            }
        }
        int t=a[mind];
        a[mind]=a[maxind];
        a[maxind]=t;

        System.out.println("max = "+max+"\nmin = "+min);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.err.println(Arrays.toString(a));
        minmax(a);
        System.err.println(Arrays.toString(a));

    }
}