package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double V1 = 4.0 / 3.0 * 3.14 * (radius * radius * radius);
        return V1;
    }
    public static float volumeBallFloat(float radius){
        float V2 = 4f / 3f * 3.14f * (radius * radius * radius);
        return V2;
    }
    public static double calculateAccuracy(double radius){
        double d = volumeBallDouble(6371.2);
        float f = volumeBallFloat(6371.2f);
        float r = (float) (d - f);
        return r;
    }
}
