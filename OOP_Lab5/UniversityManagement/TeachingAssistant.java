package UniversityManagement;


public class TeachingAssistant extends Staff {
    private int subjectsCount;

    public TeachingAssistant() {
    }

    public TeachingAssistant(String fullName, String dob, String id, int subjectsCount) {
        super(fullName, dob, id);
        this.subjectsCount = subjectsCount;
    }

    @Override
    public void Input() {
        super.Input();
        AskInput input = new AskInput();
        subjectsCount = input.askInt("Enter subjects count: ");
    }
    @Override
    public void Edit(){
        Input();
    }
    @Override
    public double getSalary() {
        return (double)subjectsCount * 0.3d * 18000;
    }
}
