package com.trckstr;

public class Main {

    public static void main(String[] args) {

        TimeSpan timeSpan = new TimeSpan(1, 10);
        TimeSpan timeSpan2 = new TimeSpan(2, 22);
        TimeSpan timeSpan3 = new TimeSpan(3, 33);
        TimeSpan timeSpan4 = new TimeSpan(4, 44);
        TimeSpan timeSpan5 = new TimeSpan(5, 55);
        TimeSpan timeSpan6 = new TimeSpan(1, 59);
        TimeSpan timeSpan7 = new TimeSpan(3, 40);
        TimeSpan timeSpan8 = new TimeSpan(2, 50);
        TimeSpan timeSpan9 = new TimeSpan(2, 45);

        //timeSpan.add(timeSpan6);
        //timeSpan2.sub(timeSpan3);
        timeSpan.mult(0.58);
    }
}
