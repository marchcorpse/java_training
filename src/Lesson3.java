import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    private static char[][] map;
    private static int SIZE = 3;

    private static final char DOT_EMPTY = '.';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    private static final boolean SILLY_MODE = false;
    private static final int aiLevel = 2;

    public static void main(String[] args) {
        initMap();
        printMap();

        while(true){
            humanTurn();
            if(isEndGame(DOT_X)){
                break;
            }

            aiShot();
            if(isEndGame(DOT_O)){
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    private static void initMap() {
        map = new char[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    private static void printMap(){
        for(int i = 0; i <= SIZE; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++){
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void humanTurn() {
        int x, y;

        do {
            System.out.println("Введите координаты ячейки через пробел");
            y = scanner.nextInt() - 1;
            x = scanner.nextInt() - 1;
        } while(!isCellValid(x, y));

        map[y][x] = DOT_X;
    }
    private static void computerTurn() {
        int x = -1;
        int y = -1;
        boolean computerWin = false;

        if (SILLY_MODE) {
            do {
                y = random.nextInt(SIZE);
                x = random.nextInt(SIZE);
            }
            while (!isCellValid(x, y));
            map[y][x] = DOT_O;
            System.out.println("Компьютер выбрал ячейку с координатами: " + (y + 1) + " " + (x + 1));
        }
        else{
            for (int i = 0; i < SIZE; i++){
                    for(int j = 0; j < SIZE; j++){
                        if(isCellValid(i, j)){
                    }
                }
            }
        }
    }
    public static void aiShot()
    {
        int x = -1;
        int y = -1;
        boolean ai_win = false;
        boolean user_win = false;
        // aiLevel = 2
        // Находим выигрышный ход
        if (aiLevel == 2)
        {
            for (int i = 0; i < SIZE; i++)
            {
                for (int j = 0; j < SIZE; j++)
                {
                    if (isCellValid(i, j))
                    {
                        map[i][j] = DOT_O;
                        if (checkWin(DOT_O))
                        {
                            x = i;
                            y = j;
                            ai_win = true;
                        }
                        else {
                            map[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }
        }
        // aiLevel = 1
        // Блокировка хода пользователя, если он побеждает на следующем ходу
        else if (aiLevel > 0)
        {
            if (!ai_win)
            {
                for (int i = 0; i < SIZE; i++)
                {
                    for (int j = 0; j < SIZE; j++)
                    {
                        if (isCellValid(i, j))
                        {
                            map[i][j] = DOT_X;
                            if (checkWin(DOT_X))
                            {
                                x = i;
                                y = j;
                                user_win = true;
                            }
                            map[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }
        }
        // aiLevel = 0
        if (!ai_win && !user_win)
        {
            do
            {
                Random rnd = new Random();
                x = rnd.nextInt(SIZE);
                y = rnd.nextInt(SIZE);
            }
            while (!isCellValid(x, y));
        }
        map[x][y] = DOT_O;
    }
    private static boolean isCellValid(int x, int y) {
        boolean result = true;

        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            result = false;
        }

        else if (map[y][x] != DOT_EMPTY) {
            result = false;
        }

        return result;
    }
    private static boolean isEndGame(char playerSymbol){
        boolean result = false;

        printMap();

        if(checkWin(playerSymbol)){
            System.out.println("Победили: " + playerSymbol);
            result = true;
        }

        if(isMapFull()){
            System.out.println("Ничья.");
            result = true;
        }
        return result;
    }
    private static boolean checkWin(char playerSymbol) {
        boolean result = false;

        if(
            (map[0][0] == playerSymbol && map[0][1] == playerSymbol && map[0][2] == playerSymbol) ||
            (map[1][0] == playerSymbol && map[1][1] == playerSymbol && map[1][2] == playerSymbol) ||
            (map[2][0] == playerSymbol && map[2][1] == playerSymbol && map[2][2] == playerSymbol) ||
            (map[0][0] == playerSymbol && map[1][0] == playerSymbol && map[2][0] == playerSymbol) ||
            (map[0][1] == playerSymbol && map[1][1] == playerSymbol && map[2][1] == playerSymbol) ||
            (map[0][2] == playerSymbol && map[1][2] == playerSymbol && map[2][2] == playerSymbol) ||
            (map[0][0] == playerSymbol && map[1][1] == playerSymbol && map[2][2] == playerSymbol) ||
            (map[2][0] == playerSymbol && map[1][1] == playerSymbol && map[0][2] == playerSymbol)){
                result = true;
        }

        return result;
    }
    private static boolean isMapFull() {
        boolean result = true;

        for(int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_EMPTY)
                    result = false;
            }
        }
        return result;
    }
}

//(map[i - 1][j] == DOT_O) || (map[i - 1][j] == DOT_O) ||
//        (map[i - 1][j] == DOT_O) || (map[i - 1][j] == DOT_O) ||
//        (map[i - 1][j] == DOT_O) || (map[i - 1][j] == DOT_O) ||
//        (map[i - 1][j] == DOT_O) || (map[i - 1][j] == DOT_O))) {
//        map[i][j] = DOT_O;
//        System.out.println("Компьютер выбрал ячейку с координатами: " + (i + 1) + " " + (j + 1));
//        break;