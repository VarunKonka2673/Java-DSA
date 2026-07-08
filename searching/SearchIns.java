class SearchIns{
    public static int searchpos(int a[],int target){
        int index=-1;
        int l=0,h=a.length-1;
        int mid;
        while(l<h){
            mid=(l+h)/2;
            if(target>mid)
                l=mid+1;
            else if(target<mid)
                h=mid-1;
            index=mid;
        }
        return index;
    }
    public static void main(String[] args){
    //sorted array
    int[] a={1,3,4,6,7,7,9};
    int target=8;
    int index=searchpos(a, target);
    if(index==-1)
    System.out.println("Array is empty");
    else if(a[index]==target)
    System.out.println("element found");
    else
    System.out.println("element can be found at "+(index+1));
}
}