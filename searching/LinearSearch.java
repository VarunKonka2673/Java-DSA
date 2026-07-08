class LinearSearch{
    public static int linearsearch(int a[],int key){
        int index=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] a={9,0,1,4,6,};
        int key=2;
        int index=linearsearch(a,key);
        if(index>0)
        System.out.println("element found at :"+index+" index");
        else
        System.out.println("element not found");
    }
}