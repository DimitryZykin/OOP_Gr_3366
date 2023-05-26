package Task_1;

import java.util.Date;

public class Emploee {
    private String name;
    private Date dob;

    public Emploee(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }
}
