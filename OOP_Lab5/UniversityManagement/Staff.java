package UniversityManagement;
import java.io.Serializable;

public class Staff implements Serializable {
    protected String fullName;
    protected String dob;
    protected String id;
    public Staff(){
    }
    public Staff(String fullName, String dob, String id){
        this.fullName = fullName;
        this.dob = dob;
        this.id = id;
    }
    public void Input(){
        AskInput input = new AskInput();
        fullName = input.askString("Enter Full Name: ");
        dob = input.askString("Enter Date of Birth: ");
        id = input.askString("Enter ID: ");
    }
    public String getId(){
        return id;
    }
    public void Edit(){
        Input();
    }
    public double getSalary(){
        return 0;
    }
}
