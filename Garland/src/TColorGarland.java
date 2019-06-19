public class TColorGarland extends Garland {
    TList Z = new TList();

    void PrintStateOfLights(){
        for(int i = 0; i < Z.q.length; i++) {
            System.out.print(Z.Q[i].GetState() + " " + Z.Q[i].GetColor() + " | ");
        }

    }
}
