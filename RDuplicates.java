import java.util.Arrays;
class RDuplicates{
    public static void main(String[] args) {
        int a[]={1,1,4,4,5,6,6,7,8,8,9};
        if(a.length<1)
        System.out.println("no elements in array");
        else if(a.length<2){
            System.out.println("Elements ="+Arrays.toString(a));
        }    
        else{
            int j=0;
            int b[]=new int[a.length];
            b[j]=a[0];
            for (int i = 1; i < a.length; i++) {
                if(b[j]<a[i])
                b[++j]=a[i]; 
            }
            System.out.println("Elements = "+Arrays.toString(b));
        }

    }

}