package UniversityManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StaffManager manager = new StaffManager();
        manager.readFile();
        Scanner sc = new Scanner(System.in);
        int n = -1;
        while (n != 0) {
            System.out.println("--------------------------------");
            System.out.println("1.Enter Lecturer");
            System.out.println("2.Enter Teaching Assistant");
            System.out.println("3.Enter Researcher");
            System.out.println("4.Enter Specialist");
            System.out.println("5.Edit by Id");
            System.out.println("6.Remove by Id");
            System.out.println("7.Write total salary");
            System.out.println("8.Write total salary by type");
            System.out.println("9.Write top 3 highest paid staff");
            System.out.println("0.Exit");
            System.out.println("--------------------------------");
            System.out.print("Input: ");
            n = sc.nextInt();
            sc.nextLine();
            switch (n) {
                case 1: {
                    Lecturer lecturer = new Lecturer();
                    lecturer.Input();
                    manager.addStaff(lecturer);
                    break;
                }
                case 2: {
                    TeachingAssistant teachingAssistant = new TeachingAssistant();
                    teachingAssistant.Input();
                    manager.addStaff(teachingAssistant);
                    break;
                }
                case 3: {
                    Researcher researcher = new Researcher();
                    researcher.Input();
                    manager.addStaff(researcher);
                    break;
                }
                case 4: {
                    Specialist specialist = new Specialist();
                    specialist.Input();
                    manager.addStaff(specialist);
                    break;
                }
                case 5: {
                    System.out.print("Enter id to edit: ");
                    String id = sc.nextLine();
                    Staff staff = manager.searchById(id);
                    if (staff != null){
                        staff.Edit();
                    }
                }
                case 6: {
                    String id = sc.nextLine();
                    manager.removeStaffById(id);
                    break;
                }
                case 7: {
                    manager.writeTotalSalary();
                    break;
                }
                case 8: {
                    manager.writeTotalSalaryByType();
                    break;
                }
                case 9: {
                    manager.writeTop3HighestPaid();
                    break;
                }
                case 0: {
                    manager.writeFile();
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }
}
