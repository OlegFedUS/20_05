package HM7;

public class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee();

        Month[] months = {new Month("June", 30, 27),
                new Month("September", 30, 19)
        };

        System.out.println(emp1.getSalary(months));


    }
}
