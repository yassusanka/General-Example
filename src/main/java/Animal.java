public class Animal {
    String sound;

    public void Sound() {
        System.out.println("hello");
    }
}
    class Horse extends Animal{
        String sound;

        public void sound(){
            System.out.println("neigh");
        }



        public static void main(String args[]) {
            Animal an = new Animal();
            Horse an1= new Horse() ;
            // System.out.println(an.Sound());
                 an.Sound() ;
                 an1.sound() ;

        }
    }


