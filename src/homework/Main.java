package homework;

public class Main {
    public static void main(String[] args) {

        Vehicles[] vehicles = Vehicles.values();
        for (Vehicles v : vehicles) {
            System.out.println(v);
        }
    }
}
