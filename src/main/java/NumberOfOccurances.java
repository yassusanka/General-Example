public class NumberOfOccurances {
    public static void main (String args[]){
        int[] arra={3,2,5,6,3,8};

        int count=0;
        for(int i=0;i<arra.length-1;i++){

            if(arra[i]==3){
                count++;
            }

        }
        System.out.println(count);
        stringPol("welcome");

    }

    public  static void stringPol(String s){
        int n=s.length() ;
        String res="";
        for(int i=n-1;i>0;i--){
            res=res+s.charAt(i);

        }
        System.out.println(res);
    }
}
