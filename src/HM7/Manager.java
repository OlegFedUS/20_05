package HM7;

public class Manager extends Employee {

    private int numberOfWorkers;
    private String name;
    private char gender;
    private int age;
    private double salary;



    public int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(int numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(Month[] monthArray){
        double result = 0;
        for (int i = 0; i < monthArray.length; i++){
            result += getSalary() * monthArray[i].getWorkingDays();
        }
        return result;
    }


}
