public class Operation {
    int data =50;

    protected String str="";
    void chage(int data){
        data = data+100;
    }
    public static void main(String args[]){
        Operation op=new Operation() ;
        System.out.println("before chane"+ op.data );
        op.chage(500);
        System.out.println("after chane"+ op.data );
    }
}
