/*
https://habr.com/ru/post/440436/#20
 */
package randomNumberFromArray;

public class RandomNumber {
    int[] array1;
    int[] array2;
    RandomNumber(int[] a, int[] b){
        array1 = a;
        array2 = b;
    }

    public int getNumber(){

        if(array1.length == array2.length){

            int count = 0;

            for(int i = 0; i < array2.length; i++){
                count += array2[i];
            }

            int[] arrayForReturn = new int[count];
            int h = 0;
            int k = 0;

            for (int j = 0; j < array2.length; j++) {
                h += array2[j];
                for (int i = k; i < h; i++) {
//                    System.out.println(k);
                    arrayForReturn[i] = array1[j];
                        k++;
                }
//                System.out.println(h);
            }

            for (int x: arrayForReturn)
                System.out.print(x + " ");

            System.out.println();
            return arrayForReturn[(int)(Math.random()*count)];
        }

        else return -1;
    }


}
