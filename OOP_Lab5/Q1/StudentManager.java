package Q1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {
    ArrayList<Student> list = new ArrayList<>();

    public StudentManager() {
    }

    public void add(Student stu) {
        list.add(stu);
    }

    public void removeById(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentNumber().equals(id)) {
                list.remove(i);
                break;
            }
        }
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).print();
        }
    }

    public void printGraduateListAndNumber() {
        int temp = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isGraduate()) {
                list.get(i).print();
                temp++;
            }
        }
        System.out.println("number of eligible: " + temp);
    }

    public void sort() {
        Collections.sort(list, (Comparator.comparingInt(Student::getType).thenComparing(Student::getStudentNumber)));
    }

    public void searchByName(String name) {
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                list.get(i).print();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student doesn't exist");
        }
    }

    public void writeFile() {
        try {
            FileOutputStream f = new FileOutputStream("D:\\student.dat");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (Student stu : list) {
                oStream.writeObject(stu);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error write file");
        }
    }

    public void readFile() {
        try {
            FileInputStream f = new FileInputStream("D:\\student.dat");
            ObjectInputStream inStream = new ObjectInputStream(f);
            Student st = null;
            while ((st = (Student) inStream.readObject()) != null) {
                list.add(st);
            }
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error read file");
        }
    }
}
