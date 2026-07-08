import java.util.Collections;
import java.util.HashSet;
class PairSum{
    public static void main(String[] args) {
        int sum=9,sub,i=0;
        Integer[] a={-1,2,7,10,11,12};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        Collections.addAll(set, a);
        for (Object e: set) {
            sub=sum-(int)e;
            if(set.contains(sub) && !res.contains(e))
                System.out.println("pair-:"+(++i)+" = ("+sub+","+e+")");
            res.add((Integer)e);
            res.add((Integer)sub); 
        }
        if(i==0)
        System.out.println("no pairsum occured");
    }
}