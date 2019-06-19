import java.util.Scanner;

public class pik {

    int seria, tolshina, zona;
    double dlina;

    pik (int s, int t, int z) {
        seria = s;
        tolshina = t;
        zona =z;
    }

    pik (){

    }

    int pickSeria(){
        System.out.println("Выберите серию:");
        System.out.println("1. ПИК 2.0");
        System.out.println("2. ПИК 3.0");

        Scanner S = new Scanner(System.in);
        return seria = S.nextInt();
    }

    int pickTolshina(){
        System.out.println("Выберите толщину:");
        System.out.println("1. 180 мм");
        System.out.println("2. 200мм");

        Scanner T = new Scanner(System.in);
        return tolshina = T.nextInt();

    }

    int pickZona(){
        System.out.println("Выберите зону:");
        System.out.println("1. 1 зона");
        System.out.println("2. 2 зона");
        System.out.println("3. 3 зона");

        Scanner Z = new Scanner(System.in);
        return zona = Z.nextInt();
    }

    double pickDlina(){

        System.out.println("Введите длину (разделяя целую и дробную части запятой)");

        Scanner D = new Scanner(System.in);
        return dlina = D.nextDouble();
    }

    double p2_t18_z1 () {
        return 5.65 / 1.131;
    }
    double p2_t18_z2 () {
        return 3.93 / 0.785;
    }
    double p2_t18_z3 () {
        return 2.52 / 0.503;
    }

    double p2_t20_z1 () {
        return 3.93 / 0.785;
    }
    double p2_t20_z2 () {
        return 2.52 / 0.503;
    }
    double p2_t20_z3 () {
        return 1.13 / 0.283;
    }

    double p3_t18_z1 () {
        return 5.65 / 1.131;
    }
    double p3_t18_z2 () {
        return 3.93 / 0.785;
    }
    double p3_t18_z3 () {
        return 2.52 / 0.503;
    }

    double p3_t20_z1 () {
        return 3.14 / 0.785;
    }
    double p3_t20_z2 () {
        return 2.10 / 0.503;
    }
    double p3_t20_z3 () {
        return 1.13 / 0.283;
    }



}
