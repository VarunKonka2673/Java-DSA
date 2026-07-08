class SecondMax{
    public static void main(String args[]){
        int a[] = {-5, -2, -3};
        int t,max=0,max2=0;
        if(a.length<2)
        System.out.println("invalid length");
        else{
            if(a[0]<a[1]){
                max=a[1];
                max2=a[0];
            }
            else{
                max=a[0];
                max2=a[1];
            }
            for(int i=2;i<a.length;i++){
                if(a[i]<max && a[i]>max2)
                max2=a[i];
                else if(a[i]>max){
                    t=max;
                    max=a[i];
                    max2=t;
                }
            }
        }
        if(max>max2)
        System.out.println("Second Max = "+max2);
        else
        System.out.println("no secomd maximum");
    }
}