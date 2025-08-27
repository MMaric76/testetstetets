package people;

import skill.Skill;
import skill.StudyLevel;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person {

    private final String matriculationNumber;
    private final int semester;
    private final StudyLevel studyLevel;

    private final Set<String> knowledge;
    private final Set<Skill> skills;

    public Student(String name, int age, String tumID, String matriculationNumber, int semester, StudyLevel studyLevel) {
        super(name, age, tumID);
        this.matriculationNumber = matriculationNumber;
        this.semester = semester;
        this.studyLevel = studyLevel;
        this.knowledge = new HashSet<>();
        this.skills = new HashSet<>();
    }

    public void acquireKnowledge(String knowledge) {
        if (knowledge != null && !knowledge.isEmpty()) {
            this.knowledge.add(knowledge);
        }
    }

    public void learnSkill(Skill skill) {
        if (skill != null) {
            this.skills.add(skill);
        }
    }

    public String getMatriculationNumber() {
        return this.matriculationNumber;
    }

    public int getSemester() {
        return this.semester;
    }

    public StudyLevel getStudyLevel() {
        return this.studyLevel;
    }

    public Set<String> getKnowledge() {
        return this.knowledge;
    }

    public Set<Skill> getSkills() {
        return this.skills;
    }
}
