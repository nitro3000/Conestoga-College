package Lesson1;

public class Player

{
    private String name;
    private  char position;
    private double avgPoint;
    private  double avgRebounds;
    private double avgAssists;

    public Player(String name, char position, double avgPoint, double avgRebounds, double avgAssists) {
        this.name = name;
        this.position = position;
        this.avgPoint = avgPoint;
        this.avgRebounds = avgRebounds;
        this.avgAssists = avgAssists;
    }
    public String toFile()
    {
         return name + " "+position+" "+avgPoint+" "+avgRebounds+" "+avgAssists;
    }

    @Override
    public String toString() {
        return "Player: " + name +

                "\n Position: " + position +
                "\n Points/Game: " + avgPoint +
                "\n Rebounds/Game: " + avgRebounds +
                "\n Assists/Game: " + avgAssists;
    }
}

