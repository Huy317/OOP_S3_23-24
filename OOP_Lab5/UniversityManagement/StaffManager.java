package UniversityManagement;

import java.util.*;
import java.io.*;

public class StaffManager {
    ArrayList<Staff> list = new ArrayList<Staff>();

    public void addStaff(Staff staff) {
        list.add(staff);
        writeFile();
    }

    public void removeStaffById(String id) {
        for (Staff st : list) {
            if (st.getId().equals(id)) {
                list.remove(st);
                break;
            }
        }
        writeFile();
    }

    public Staff searchById(String id){
        for (Staff st : list) {
            if (st.getId().equals(id)){
                return st;
            }
        }
        return null;
    }
    public void writeTotalSalary() {
        double total = 0;
        for (Staff staff : list) {
            total += staff.getSalary();
        }
        try {
            FileOutputStream f = new FileOutputStream("D:\\TotalSalary.eiu");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            oStream.writeUTF(total + "");
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error write file");
        }
    }

    public void writeTotalSalaryByType(){
        HashMap<String,Double> map = new HashMap<String,Double>();
        for (Staff staff : list){
            String className = staff.getClass().getSimpleName();
            map.put(className, map.getOrDefault(className,0d)+staff.getSalary());
        }
        StringBuilder sb = new StringBuilder();
        for (String key : map.keySet()){
            sb.append(key+" "+map.get(key));
        }
        try{
            FileOutputStream f = new FileOutputStream("D:\\TotalSalaryByType.eiu");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            oStream.writeUTF(sb.toString());
            oStream.close();
        }catch(IOException e){
            System.out.println("Error write file");
        }
    }

    public void writeTop3HighestPaid(){
        Collections.sort(list, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                return Double.compare(o2.getSalary(),o1.getSalary());
            }
        });
        try{
            FileOutputStream f = new FileOutputStream("D:\\Top3HighestPaid.eiu");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            int counter = 3;
            for (Staff st : list){
                if (counter > 0){
                    oStream.writeObject(st);
                    counter--;
                }
            }
            oStream.close();
        }catch(IOException e){
            System.out.println("Error write file");
        }
    }

    public void writeFile() {
        try {
            FileOutputStream f = new FileOutputStream("D:\\EiuStaff.eiu");
            ObjectOutputStream oStream = new ObjectOutputStream(f);
            for (Staff staff : list) {
                oStream.writeObject(staff);
            }
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error write file");
        }
    }

    public void readFile() {
        try {
            FileInputStream f = new FileInputStream("D:\\EiuStaff.eiu");
            ObjectInputStream inStream = new ObjectInputStream(f);
            Staff staff = null;
            while ((staff = (Staff) inStream.readObject()) != null) {
                list.add(staff);
            }
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error read file");
        }
    }
}
