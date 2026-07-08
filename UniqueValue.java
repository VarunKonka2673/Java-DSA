import java.util.HashSet;
class UniqueValue{
    public static void main(String[] args) {
        int a[]={1,1,2,2,3,4,3,5};
        HashSet<Integer> set= new HashSet<>();
        int i=-1;
        while(++i<a.length){
            if(set.contains(a[i]))
            set.remove(a[i]);
            else
            set.add(a[i]);
        }
        if(!set.isEmpty()){
        Object[] arr=set.toArray();
        System.out.println("Unique Number = " + arr[0]);
        }
        else 
        System.out.println("No unique element");
    }
}