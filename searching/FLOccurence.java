import java.util.Scanner;
class FLOccurence{
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,3,4,2,3};
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the key value");
        int key=sc.nextInt();
        int i=0,j=arr.length-1;
        boolean booli=false;
        boolean boolj=false;
        for(int k=0;k<arr.length;k++){
            if(arr[i]!=key && booli!=true)
            i++;
            else
            booli=true;

            if(arr[j]!=key &&boolj!=true)
            j--;
            else
            boolj=true;

            if(booli ==true && boolj == true)
            break;
        }
        System.out.println("first : "+(i+1)+" last : "+(j+1));
    }
}