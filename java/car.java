package java;

public class car implements Comparable<car>
{
    int speed;
    int price;
    String color;

    public car(int s, int p, String c)
    {
        this.speed=s;
        this.price=p;
        this.color=c;
    }

    // this toString method will be used in sout(obj) when printing car object
    @Override
    public String toString() {
        return "car : {" +
                "speed=" + speed +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}' +"\n";
    }


    @Override
    public int compareTo(car other) {
        // if priority of this>other => return +ve;   else return -ve
        return this.speed - other.speed;
//        return this.color.compareTo(other.color);
    }


}
