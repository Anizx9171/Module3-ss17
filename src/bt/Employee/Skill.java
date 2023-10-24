package bt.Employee;

import java.io.Serializable;

public class Skill implements Serializable {
    String name;
    int yoe;

    public Skill(String name, int yoe) {
        this.name = name;
        this.yoe = yoe;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "name='" + name + '\'' +
                ", yoe=" + yoe +
                '}';
    }
}
