package youtube;

public class Bus {
    public String name;
    public int maxPassengers;
    public int passengers;
    public double weight;
    public double averagePassengerWeight;

    public void busWeight() {
        System.out.println(weight+passengers*averagePassengerWeight);
    }
    public void freePlaces() {
        System.out.println(maxPassengers-passengers);
    }

}
