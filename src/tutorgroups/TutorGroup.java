package tutorgroups;

import people.Person;
import people.Student;
import time.WeeklyTimeSlot;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TutorGroup {

    private final String id;
    private final WeeklyTimeSlot timeSlot;
    private final Person tutor;
    private final Set<Student> students = new HashSet<>();
    private List<TutorGroupMeeting> meetings;

    public TutorGroup(String id, WeeklyTimeSlot timeSlot, Person tutor) {
        this.id = id;
        this.timeSlot = timeSlot;
        this.tutor = tutor;
    }

    void addMeeting(TutorGroupMeeting meeting){
        if (meeting != null){
            this.meetings.add(meeting);
        }
    }

    public void register(Student student){
        if (student != null){
            this.students.add(student);
        }
    }

    public String getId() {
        return this.id;
    }

    public WeeklyTimeSlot getTimeSlot() {
        return this.timeSlot;
    }

    public Person getTutor() {
        return this.tutor;
    }

    public Set<Student> getStudents() {
        return this.students;
    }

    public List<TutorGroupMeeting> getMeetings() {
        return this.meetings;
    }
}
