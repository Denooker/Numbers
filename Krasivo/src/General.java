public class General {

    public static void main(String[] args) {
        int a, b, c;

        pik B = new pik();

        do {
            a = B.pickSeria();
        } while (a != 1 & a != 2);

        do {
            b = B.pickTolshina();
        } while (b != 1 & b != 2);

        do {
            c = B.pickZona();
        } while (c != 1 & c != 2 & c !=3);

        pik A = new pik(a,b,c);

        double T = A.pickDlina();


        if (A.seria == 1 & A.tolshina == 1 & A.zona == 1) System.out.println("Необходимо " + Math.ceil(T*A.p2_t18_z1()) + "стержней");
        else if (A.seria == 1 & A.tolshina == 1 & A.zona == 2) System.out.println("Необходимо " + Math.ceil(T*A.p2_t18_z2()) + "стержней");
        else if (A.seria == 1 & A.tolshina == 1 & A.zona == 3) System.out.println("Необходимо " + Math.ceil(T*A.p2_t18_z3()) + "стержней");

        else if (A.seria == 1 & A.tolshina == 2 & A.zona == 1) System.out.println("Необходимо " + Math.ceil(T*A.p2_t20_z1()) + "стержней");
        else if (A.seria == 1 & A.tolshina == 2 & A.zona == 2) System.out.println("Необходимо " + Math.ceil(T*A.p2_t20_z2()) + "стержней");
        else if (A.seria == 1 & A.tolshina == 2 & A.zona == 3) System.out.println("Необходимо " + Math.ceil(T*A.p2_t20_z3()) + "стержней");

        else if (A.seria == 2 & A.tolshina == 1 & A.zona == 1) System.out.println("Необходимо " + Math.ceil(T*A.p3_t18_z1()) + "стержней");
        else if (A.seria == 2 & A.tolshina == 1 & A.zona == 2) System.out.println("Необходимо " + Math.ceil(T*A.p3_t18_z2()) + "стержней");
        else if (A.seria == 2 & A.tolshina == 1 & A.zona == 3) System.out.println("Необходимо " + Math.ceil(T*A.p3_t18_z3()) + "стержней");

        else if (A.seria == 2 & A.tolshina == 2 & A.zona == 1) System.out.println("Необходимо " + Math.ceil(T*A.p3_t20_z1()) + "стержней");
        else if (A.seria == 2 & A.tolshina == 2 & A.zona == 2) System.out.println("Необходимо " + Math.ceil(T*A.p3_t20_z2()) + "стержней");
        else if (A.seria == 2 & A.tolshina == 2 & A.zona == 3) System.out.println("Необходимо " + Math.ceil(T*A.p3_t20_z3()) + "стержней");

    }
}
