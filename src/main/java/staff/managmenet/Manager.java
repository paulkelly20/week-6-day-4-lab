package staff.managmenet;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;
    public Manager(String name, int niNmunber, double salary, String deptName) {
        super(name, niNmunber, salary);

        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
