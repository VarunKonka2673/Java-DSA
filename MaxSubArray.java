class MaxSubArray{
    // public static int sum(int[] a,int st,int end){
    //     int s=0;
    //     for(int i=st;i<=end;i++)s+=a[i];
    //     return s;
    // }
    // public static int subarray(int[] a){
    //     int max=a[0];
    //     for(int st=0;st<a.length;st++){
    //         for(int end=st;end<a.length;end++){
    //             int max2=sum(a,st,end);
    //             if(max2>max)
    //             max=max2;
    //         }
    //     }
    //     return max;
    // }

    // KADANE"S ALGORITHM
    public static int subarray(int[] a){
        int max=Integer.MIN_VALUE;
        int cs=0;
        for(int st=0;st<a.length;st++){
            cs+=a[st];
            max=max<cs?cs:max;
            if(cs<0)
            cs=0;
        }
        return max;
    }


    public static void main(String[] args) {
        int[] a={3,-4,5,4,-1,7,-8};
        int r = subarray(a);
        System.out.println("Maximum sum = "+r);
    }
}