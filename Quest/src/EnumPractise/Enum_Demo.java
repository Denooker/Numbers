package EnumPractise;

import java.util.Scanner;

public class Enum_Demo {
    public static void main(String[] args) {
        Boys b=Boys.KALIEKPUHA;
        switch (b){
            case KOLYAN:
                System.out.println(Boys.KOLYAN);
                break;
            case SEREGA:
                System.out.println(Boys.SEREGA);
                break;
            case KALIEKPUHA:
                System.out.println(Boys.KALIEKPUHA);
                break;
        }
    }
}
