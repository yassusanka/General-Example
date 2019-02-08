public class Vechile {
    String color;
    int speed;

    public Vechile (){

    }

    public Vechile(String color, int speed) {
        this.speed = speed;
        this.color = color;

    }

    public void applyBrake(int decrement) {

        speed = speed - decrement;
    }
    public String toString()
    {
        return ("Speed is "+ speed + " color is " + color);
    }
    }
         class Bicycle extends Vechile {
             int seatheight;

             public Bicycle(String color, int speed, int seatheight) {
                 super(color, speed);
                 this.seatheight = seatheight;


             }

             public void SeatHeight(int value) {
                 value = seatheight;

             }
           // @Override
             public String toString() {
                 return (super.toString() + "  seatheight " + seatheight);
             }

             public static void main(String args[]) {
                 Bicycle bc = new Bicycle("red", 200, 20);
                 System.out.println(bc.toString());
             }
         }

