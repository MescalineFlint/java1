package ru.progwards.java1.lessons.test;

public class If {
    static String textGrade(int grade) {
        String s;
        if (grade == 0)
            s = "не оценено";
        else if (grade >= 1 && grade <= 20)
            s = "очень плохо";
        else if (grade >= 21 && grade <= 40)
            s = "плохо";
        else if (grade >= 41 && grade <= 60)
            s = "удовлетворительно";
        else if (grade >= 61 && grade <= 80)
            s = "хорошо";
        else if (grade >= 81 && grade <= 100)
            s = "отлично";
        else
            s = "не определено";
        return s;
    }

    public static void main(String[] args) {
        System.out.println(textGrade(100));
    }
}
