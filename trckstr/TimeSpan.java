package com.trckstr;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        // minutes < 60
        if (minutes > 60) {
            throw new IllegalArgumentException("bla-bla");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public void add(TimeSpan timeSpan) {
        hours += timeSpan.hours;
        minutes += timeSpan.minutes;
        if (minutes >= 60) {
            hours += 1;
            minutes = minutes % 60;
        }
        System.out.println("Результат сложения: " + TimeSpan.this);
    }

    public void sub(TimeSpan timeSpan) {
        hours -= timeSpan.hours;
        minutes -= timeSpan.minutes;
        if (hours < 0) {
            System.out.println("Неправильно заданы параметры");
        } else if (hours == 0 && minutes < 0) {
            System.out.println("Неправильно заданы параметры");
        } else if (hours > 0 && minutes < 0) {
            hours -= 1;
            minutes = 60 + minutes;
            System.out.println("Рещультат вычитания: " + TimeSpan.this);
        } else {
            System.out.println("Рещультат вычитания: " + TimeSpan.this);
        }
    }

    public void mult(double times) {
        double timeSpanToMinutes = (hours * 60 + minutes) * times;
        double hoursResult = timeSpanToMinutes / 60;
        double minutesResult = Math.round(timeSpanToMinutes % 60);
        System.out.println("Результат умножения: " + (int) hoursResult + " hours " + (int) minutesResult + " minutes");
    }

    @Override
    public String toString() {
        return hours + " hours " + minutes + " minutes";
    }
}