package Java.N_ObjectsAndCollections.GrossSalary;

public class CalculateSalary {
    double salary;

    public CalculateSalary(double salary) {
        this.salary = salary;
    }

    public void grossSalary(){
        double grossSalary = 0;
        if (salary < 1500) {
            double HRA = 0.1 * salary;
            double DA = 0.9 * salary;
            grossSalary = HRA + DA + salary;
        } else if (salary >= 1500) {
            double HRA = 500;
            double DA = 0.98 * salary;
            grossSalary = HRA + DA + salary;
        }
        System.out.println("Your gross salary will be : " + grossSalary);
    }
}
