import java.util.ArrayList;

public class Person {

    public String name;
    protected String likes;
    private String location;
    private double money, sleep;
    private static ArrayList<Person> personList = new ArrayList<>();

    public Person(String n, String lik, String loc, double m, double s){
        name = n;
        favorite = lik;
        location = loc;
        money = m;
        sleep = s;
    }

    public String getName() {
        return name;
    }
    protected String getLikes() {
        return favorite;
    }
    private String getLocation() {
        return location;
    }
    private double getMoney() {
        return money;
    }
    private double getSleep() {
        return sleep;
    }
    public static ArrayList<Person> getPersonList() {
        return personList;
    }

}
