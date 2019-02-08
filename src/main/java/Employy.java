public class Employy {
    private static Employy ourInstance = new Employy();

    public static Employy getInstance() {
        return ourInstance;
    }

    private Employy() {
    }
}
