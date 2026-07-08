class SQRT{
    public static void main(String[] args) {
        int n = 26;
        float f;
        int[] a={1,2,3,4,5,6,7,8};
        int l=0,h=a.length,mid=-1;
        while(l<=h){
            mid=(h-l)/2;
            f=mid*mid;
            if(f==n)
            System.out.println("Search is Successful");
            else if(f<n){
                h=mid-1;
            }
            else if(f>n)
                l=mid+1;
        }
        if( mid== -1)
            System.out.println("Search unsuccessful");
        System.out.println("the SQRT of "+n+" is "+ a[mid]);
    }
}