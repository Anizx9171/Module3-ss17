package bt.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RunE {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // khoi tao + luu
        List<Employee> employees = new ArrayList<>();
        List<Skill> skills = new ArrayList<>();
        File employeeData = new File("src/bt/Employee/employee.dat");
        FileOutputStream fop = new FileOutputStream(employeeData);
        ObjectOutputStream ops = new ObjectOutputStream(fop);
        skills.add(new Skill("Bu da", 18));
        skills.add(new Skill("An cuop", 18));
        skills.add(new Skill("An xin", 18));
        Employee employee1 = new Employee(1,"Ngyen bu co", true, skills);
        Employee employee2 = new Employee(2,"Ngyen bu da", false, skills);
        employees.add(employee1);
        employees.add(employee2);
        ops.writeObject(employees);
        ops.close();

        // doc
        FileInputStream fip = new FileInputStream(employeeData);
        ObjectInputStream ois = new ObjectInputStream(fip);
        System.out.println("Doc file");
        System.out.println(ois.readObject());
        ois.close();
        System.out.println("Kết thúc đọc file");
    }
}
