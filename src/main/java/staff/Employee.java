package staff;

public abstract class Employee {

    private String name;
    private int niNmunber;
    private double salary;

    public Employee(String name, int niNmunber, double salary) {
        this.name = name;
        this.niNmunber = niNmunber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getNiNmunber() {
        return this.niNmunber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double increase){
        if(increase > 0)
        {this.salary += increase;}
    }

    public double payBonus(){
        double bonus = 0;
        bonus = (this.salary/100);
        return bonus;
    }

    public void setName(String name) {
        if(name != null)
        {this.name = name;}
    }
}
