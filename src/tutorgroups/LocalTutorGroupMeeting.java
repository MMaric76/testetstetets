package tutorgroups;

import skill.Skill;
import time.FixedDateTimeSlot;

public class LocalTutorGroupMeeting extends TutorGroupMeeting {

    private String room;

    public LocalTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractise, String room) {
        super(timeSlot, tutorGroup, skillToPractise);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void practise() {
        getTutorGroup().getTutor().say("Thank you for coming to " + room + " today.");
        getTutorGroup().getStudents().forEach(student -> student.learnSkill(getSkillToPractise()));
        getTutorGroup().getTutor().say("See you next time!");
    }
}
