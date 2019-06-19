public class Bumblebee {
    public static void main(String[] args) {

        TSimpleGarland girl1 = new TSimpleGarland();
        System.out.println("Одноцветная гирлянда : ");
        girl1.PrintStateOfLights();

        TColorGarland girl2 = new TColorGarland();
        System.out.println("Многоцветная гирлянда : ");
        girl2.PrintStateOfLights();

    }
}
