package tutorgroups;

import skill.Skill;
import time.FixedDateTimeSlot;

public class VirtualTutorGroupMeeting extends TutorGroupMeeting{

    private String url;

    public VirtualTutorGroupMeeting(FixedDateTimeSlot timeSlot, TutorGroup tutorGroup, Skill skillToPractise, String url) {
        super(timeSlot, tutorGroup, skillToPractise);
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public void practise(){
        getTutorGroup().getTutor().say("Thank you for joining using " + url + " today.");
        getTutorGroup().getStudents().forEach(student -> student.learnSkill(getSkillToPractise()));
        getTutorGroup().getTutor().say("See you next time!");
    }
}
