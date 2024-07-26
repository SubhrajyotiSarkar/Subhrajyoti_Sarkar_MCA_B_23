import java.util.*;

class Time {
    int hour, min, sec;

    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    void add(Time o) {
        int hour = this.hour + o.hour;
        int min = this.min + o.min;
        int sec = this.sec + o.sec;

        int temp = 0;
        temp = sec;
        sec = sec % 60;
        min = min + temp / 60;
        temp = min;
        min = min % 60;
        hour = hour + temp / 60;

        System.out.print("Added Time: " + hour + " hr " + min + " min " + sec + " sec");
    }
}

class q2_time_addition {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int h1, m1, s1, h2, m2, s2;
        System.out.print("Enter First Hour: ");
        h1 = sc.nextInt();
        System.out.print("Enter First Minute: ");
        m1 = sc.nextInt();
        System.out.print("Enter First Second: ");
        s1 = sc.nextInt();
        System.out.print("Enter Second Hour: ");
        h2 = sc.nextInt();
        System.out.print("Enter Second Minute: ");
        m2 = sc.nextInt();
        System.out.print("Enter Second Second: ");
        s2 = sc.nextInt();
        Time obj1 = new Time(h1, m1, s1);
        Time obj2 = new Time(h2, m2, s2);
        obj1.add(obj2);
    }
}
