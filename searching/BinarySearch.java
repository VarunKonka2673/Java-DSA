class BinarySearch{
    public static int binarysearch(int a[],int key){
        int index=-1;
        int l=0,h=8,mid;
        while(l<=h){
            mid=(l+h)/2;
            if(a[mid]==key){
                index=mid;
                return index;    
            }
            
            else if(a[mid]>key)
                h=mid-1;
            else if(a[mid]<key)
                l=mid+1;
        }
        return index;
    }
    
    
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int key=6;
        int index=binarysearch(a,key);
        if(index>=0)
        System.out.println("element found at "+index+" position");
        else
        System.out.println("element not found");
    }
}