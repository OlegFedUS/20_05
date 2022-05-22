package HM7;

public class Month {

     private String monthName;
     private int totalDays;
     private int workingDays;

     public Month(String monthName, int totalDays, int workingDays) {
          this.monthName = monthName;
          this.totalDays = totalDays;
          this.workingDays = workingDays;
     }

     public String getMonthName() {
          return monthName;
     }

     public int getTotalDays() {
          return totalDays;
     }

     public int getWorkingDays() {
          return workingDays;
     }
}
