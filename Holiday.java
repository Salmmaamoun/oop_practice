package task4_rout;

public class Holiday {

    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday holiday1,Holiday holiday2) {
        if (holiday1.month.equalsIgnoreCase(holiday2.month)) {
            return true;
        }
        return false;
    }

    public double avgDay(Holiday[] arr) {
        double sum = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].day;
            c++;

        }
        return sum/c;
    }
    
  
    public static void main(String[] args) {
        Holiday independenceDay=new Holiday("sa", 4, "july");
        Holiday h1=new Holiday("sa", 4, "july");
        Holiday []k={independenceDay,h1};
        System.out.println(independenceDay.avgDay(k));
    
        System.out.println(h1.inSameMonth(h1, h1));
        System.out.println("sss");
    }
}

