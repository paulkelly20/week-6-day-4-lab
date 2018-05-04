package staff.managmenet;

import staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, int niNmunber, double salary, String deptName, double budget) {
        super(name, niNmunber, salary, deptName);
        this.budget = budget;
    }



    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus() {
        double bonus = 0;
        bonus = (getSalary() /100) * 2;
        return bonus;
    }
}
