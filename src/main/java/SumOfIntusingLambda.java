public class SumOfIntusingLambda {

    private  static double sumInt(int a,int b) {
        SumOfInt sm = new SumOfInt() {
            @Override
            public double sum(int a, int b) {
                return a + b;
            }
        };
        return sm.sum(a,b);
    }

    private static double square(int n){
        Squareroot sq=  (m)->(Math.sqrt(m) );
        return sq.suareRoot(n);
    }
    public static void main(String args[]){
        System.out.println(sumInt(4,7));
        System.out.println(square(9) );
    }
}
