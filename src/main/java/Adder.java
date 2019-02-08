public class Adder {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

}
  class test{
    public static void main(String args[]){
        Adder ad=new Adder() ;
        System.out.println(ad.add(10,2) );
        System.out.println(ad.add(3,4,5) );
    }
}
