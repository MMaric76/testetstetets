package people;

public class Instructor extends Person{

    public Instructor(String name, int age, String tumID) {
        super(name, age, tumID);
    }

    public void teach(String lectureContent){
        this.say("Please learn \"" + lectureContent + "\"");
    }
}
