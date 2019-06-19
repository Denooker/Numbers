//Управление игроком осуществляется путем ввода определенных инструкций в консоль
//(Up - вперед, down - назад, left - влево, right - вправо. Можешь сократить их до первых букв)
//Когда начинается игра, создается комната 10х10 клеток с ловушками. Игрок появляется в клетке 5х5
//ему необходимо найти выход из комнаты. Ловушки и выход создаются случайно (не более 20 ловуше).
// Когда игрок наступаем на ловушку - он умирает и игра создается заново.
//(Нужно показать ему, что он проиграл). При каждом шаге выводить в
//консоль текущую клетку и вопрос: "что вы хотите сделать дальше?"
import java.util.Random;
import java.util.Scanner;
public class GameDemo {
    public static void main(String[] args) {

        System.out.println("Выберетесь из комнаты.");
        System.out.println("Управление:");
        System.out.println("1. Вверх - w");
        System.out.println("2. Вниз - s");
        System.out.println("3. Влево - a");
        System.out.println("4. Вправо - d");

        int pole[][] = new int [10][10];
        int x = 4; int y = 4;

        //Заполнение комнаты.
        for (int i = 0; i < pole.length; i++){
            for (int j = 0; j < pole.length; j++){
                pole[i][j] = 1;
            }
        }

        //Расстановка ловушек.
        for (int g = 0; g < 20; g++){
            Random I = new Random();
            int i = I.nextInt(10);
            Random J = new Random();
            int j = J.nextInt(10);
            pole[i][j] = 0;
        }

        //Расстановка выхода.
        first:
        {
            Random ExitX = new Random();
            int exX = ExitX.nextInt(10);
            Random ExitY = new Random();
            int exY = ExitY.nextInt(10);
            if (exY == 4 & exX == 4) {
                System.out.println("Перерасстановка выхода");
                break first;
            }
            pole[exY][exX] = 2;
        }

        //Расстановка старта.
        pole[4][4] = 3;

//        //Проверка расстановок
//        for (int i = 0; i < pole.length; i++){
//            for (int j = 0; j < pole.length; j++){
//                System.out.print(pole[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //Управление.
        while (x < 10 & y < 10) {
            Scanner Move = new Scanner(System.in);
            String ULDR = Move.nextLine();
            if (ULDR.equals("")) break;
            switch (ULDR){

                case ("w"):
                    x -= 1;
                    System.out.println("Вы на клетке " + "[" + (x+1) + "][" + (y+1) + "]\nКуда дальше?");
                    break;

                case ("a"):
                    y -= 1;
                    System.out.println("Вы на клетке " + "[" + (x+1) + "][" + (y+1) + "]\nКуда дальше?");
                    break;

                case ("s"):
                    x += 1;
                    System.out.println("Вы на клетке " + "[" + (x+1) + "][" + (y+1) + "]\nКуда дальше?");
                    break;

                case ("d"):
                    y += 1;
                    System.out.println("Вы на клетке " + "[" + (x+1) + "][" + (y+1) + "]\nКуда дальше?");
                    break;

                default: System.out.println("Некорректная команда");
            }

            //Конец игры.
            if (pole[x][y] == 0) {
                System.out.println("Вы попали в ловушку");
                break;
            }
            else if (pole[x][y] == 2){
                System.out.println("Вы вышли из комнаты");
                break;
            }

        }
    }
}
