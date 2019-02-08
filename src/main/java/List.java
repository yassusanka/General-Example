import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String args[]){
        ArrayList  al=new ArrayList();
        al.add("jack");
        al.add("welcome");
//        for(int i=0;i<al.size();i++ ){
//            System.out.println(al.get(i) );
//        }
        Iterator il= al.iterator() ;
        while(il.hasNext() ){
            System.out.println(il.next() );
        }
    }
}
