package bt.Employee;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable {
    int id;
    String name;
    boolean status;
    List<Skill> skill;

    public Employee(int id, String name, boolean status, List<Skill> skill) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", skill=" + skill +
                '}';
    }
}
