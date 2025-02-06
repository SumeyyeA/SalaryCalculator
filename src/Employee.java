public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary < 1000){
            return 0;
        }
        else{
            return this.salary * 0.03;
        }
    }

    public double bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        else{
            return 0;
        }
    }
    public double raiseSalary(){
        int year = 2021 - this.hireYear; 
        if(year<10){
            return this.salary*0.05;
        }
        else if(year>=10 && year<20){
            return this.salary*0.10;
        }
        else{
            return this.salary*0.15;
        }
    }
    @Override
    public String toString() {
        return "Name: "+this.name+"\nSalary: "+this.salary+"\nWork Hours: "+this.workHours+"\nHire Year: "+this.hireYear
                +"\nTax: "+tax()+"\nBonus: "+bonus()+"\nRaise Salary: "+raiseSalary()+"\nSalary with Tax and Bonus: "+(this.salary-tax()+bonus())
                +"\nTotal Salary: "+ (this.salary + raiseSalary() - tax() + bonus());

    }
}
