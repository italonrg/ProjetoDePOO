package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class worker {
    private String name;
    private worklevel level;
    private Double BaseSalary;

    private String Department;
    private departament department;
    private List<hourContract> contracts = new ArrayList<>();

    public worker() {
    }

    public worker(String name, worklevel level, String baseSalary, String department) {
        this.name = name;
        this.level = level;
        BaseSalary = Double.valueOf(baseSalary);
        Department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public worklevel getLevel() {
        return level;
    }

    public void setLevel(worklevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return BaseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        BaseSalary = baseSalary;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment( departament department) {
        Department = department.toString();
        this.department = department;
    }

    public List<hourContract> getContracts() {
        return contracts;
    }

    public void addContract (hourContract contract){
         contracts.add(contract);
    }
    public void removeContract(hourContract contract){
        contracts.remove(contract);
    }
    public double income( int year , int month){
        Calendar cal = Calendar.getInstance();
        double soma = BaseSalary;
for (hourContract C : contracts){
    cal.setTime(C.getDate());
    int c_year = cal.get(Calendar.YEAR);
    int c_month = 1+ cal.get(Calendar.MONTH);
    if(year == c_year && month == c_month){
        soma += C.TotalValue();
    }
}
return soma;
    }

}





























