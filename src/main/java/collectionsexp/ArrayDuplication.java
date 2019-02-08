package collectionsexp;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayDuplication {
    public void duplication(Integer[] array){
        HashSet<Integer>set=new HashSet<>();
        int n= array.length ;
        for(int i=0;i<n;i++){
            set.add(array[i]);

        }
        System.out.println(set);
//        ArrayList<Integer>al=new ArrayList();
//        for(Integer i: array){
//            al.add(array[i]);
//        }
//        Integer[] arr=new Integer[al.size()];
//        return  arr;arr
    }
 public static void main(String args[]){
        Integer[] in={2,3,1,2,3,1,5};
        ArrayDuplication  al=new ArrayDuplication() ;
        al.duplication(in) ;
 }
}
