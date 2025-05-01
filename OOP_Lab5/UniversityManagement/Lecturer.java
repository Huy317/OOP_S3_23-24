package UniversityManagement;

import java.util.*;

public class Lecturer extends Staff {
    private String academicRank;
    private String academicDegree;
    private int yearOfExp;
    private int subjectsCount;
    private ArrayList<String> subjects = new ArrayList<String>();
    public Lecturer() {
    }

    public Lecturer(String fullName, String dob, String id, String academicRank, String academicDegree, int yearOfExp,
            int subjectsCount) {
        super(fullName, dob, id);
        this.academicRank = academicRank;
        this.academicDegree = academicDegree;
        this.yearOfExp = yearOfExp;
        this.subjectsCount = subjectsCount;
    }

    @Override
    public void Input() {
        super.Input();
        AskInput input = new AskInput();
        academicRank = input.askString("Enter academic rank: ");
        academicDegree = input.askString("Enter academic degree: ");
        yearOfExp = input.askInt("Enter year of experience: ");
        subjectsCount = input.askInt("Enter number of subjects: ");
        for (int i = 0; i < subjectsCount; i++) {
            String a = input.askString("Enter subject " + (i + 1) + ": ");
            subjects.add(a);
        }
    }
    @Override
    public void Edit() {
        Input();
    }
    @Override
    public double getSalary() {
        return (double) (subjectsCount * yearOfExp * 0.12d) * 20000;
    }
}
