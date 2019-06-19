public class TSimpleGarland extends Garland {

    TList z = new TList();

     void PrintStateOfLights(){
         for(int i = 0; i < z.q.length; i++) {
             System.out.print(z.q[i].GetState() + " ");
         }
         System.out.println();
     }
}
