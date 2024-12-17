package DSANotesProblems;

public class DPSingleton {
    private static DPSingleton instance = null;
    private DPSingleton() {
    }
    public static synchronized DPSingleton getInstance() {
        if (instance == null) {
            instance = new DPSingleton();
        }
        return instance;
    }
}