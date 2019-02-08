public  abstract class Person {
    abstract void eat();
}

class testAmonymous{
    public static void main(String args[]){
        Person p=new Person() {
            @Override
            void eat() {
                System.out.println("heloo yummy");
            }
        };

      p.eat() ;

    }

}

interface ediable{
    void eat();
}

class TestAnonymous {
    public static void main(String args[]) {
        ediable e = new ediable() {
            @Override
            public void eat() {
                System.out.println("welcome");
            }
        };
        e.eat();
    }
}