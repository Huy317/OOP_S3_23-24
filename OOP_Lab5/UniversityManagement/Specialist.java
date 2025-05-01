package UniversityManagement;

import java.util.ArrayList;

public class Specialist extends Staff {
    private ArrayList<String> projectCode = new ArrayList<String>();    
    private int yearOfExp;
    public Specialist(){}
    public Specialist(String fullName, String dob, String id, ArrayList<String> projectCode, int yearOfExp){
        super(fullName, dob, id);
        this.projectCode = projectCode;
        this.yearOfExp = yearOfExp;
    }
    @Override
    public void Input(){
        super.Input();
        AskInput input = new AskInput();
        int n = input.askInt("Enter number of projects: ");
        for (int i = 0; i < n; i++){
           String pj = input.askString("Enter project code: ");
            projectCode.add(pj);
        }
        yearOfExp = input.askInt("Enter year of experience: ");
    }
    @Override
    public void Edit(){
        Input();
    }
    @Override
    public double getSalary() {
        int count = 0;
        for (String code : projectCode){
            if (code.startsWith("T")){
                count++;
            }
        }
        return (double)(yearOfExp*4 +count)*18000;
    }
}
