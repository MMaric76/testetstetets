package people;

public class Person {
    private final String name;
    private final int age;
    private final String tumID;

    public Person(String name, int age, String tumID) {
        this.name = name;
        this.age = age;
        this.tumID = tumID;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getTumID() {
        return this.tumID;
    }

    public final void say(String text){
        System.out.println(this.name + "said: " + text);
    }
}
