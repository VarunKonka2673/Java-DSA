import java.util.Scanner;
class MaxElement{
    public static int findMax(){
        int max=0,t;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[sc.nextInt()];
        for(int i=0;i<a.length;i++){
            t=sc.nextInt();
            if(max<t){
                max=t;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        System.out.println("Max element= "+findMax());
    }
}