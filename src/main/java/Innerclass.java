public class Innerclass {
    private int value=30;
    void display(){
        int value=50;
        class inner {
            void msg() {
                System.out.println("hello"+ " "+ value);
            }
        }
        inner l=new inner();
            l.msg();
    }
    public static void main(String args[]){
        Innerclass in=new Innerclass() ;
        in.display() ;
    }
}
