package sdet;

public class PrintWeekNames {
    static void main(String[] args) {
        int week_no = 1;
        if(week_no == 1) System.out.println("Sunday");
        else if(week_no == 2) System.out.println("Monday");
        else if(week_no == 3) System.out.println("Tuesday");
        else if(week_no == 4) System.out.println("Wednesday");
        else if(week_no == 5) System.out.println("Thursday");
        else if(week_no == 6) System.out.println("Friday");
        else if(week_no == 7) System.out.println("Satursay");
        else System.out.println("Invalid week number");
    }
}
