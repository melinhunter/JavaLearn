package interfaceExample;

public class Car implements Vehicle{
    String type;
    String speed;
    String color;

    public Car(String type, String speed, String color) {
        this.type = type;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public String getSpeed() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }
}
