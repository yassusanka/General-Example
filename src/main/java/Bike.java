public class Bike {
    void run() {
        System.out.println("running safely");
    }
}
     class splender extends Bike {
        void run() {
            System.out.println("running successfully");
        }

    public static void main(String args[]){
        Bike sp= new splender() ;
        sp.run() ;

    }
}
