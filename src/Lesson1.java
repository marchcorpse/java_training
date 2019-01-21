public class Lesson1 {
        // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main()
    public static void main(String[] args) {
        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения.
        byte byteExample = 120;
        short shortExample = 32000;
        char charExample = 'Y';
        int intExample = 2222222;
        long longExample = 222222222222L;
        float floatExample = 32.2f;
        double doubleExample = 33.3;
        boolean booleanExample = true;
        String stringExample = "String _Example 1";

        // 3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – входные параметры этого метода;

        System.out.println(Task3(2.0, 2.0,3.0, 2.0));

        //4. Написать метод, принимающий на вход два числа, и проверяющий, что их сумма лежит
        // в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false

        System.out.println(Task4(5, 4));

        //5. Написать метод, которому в качестве параметра передается целое число, метод должен
        // напечатать в консоль положительное число передали или отрицательное
        // (Замечание: ноль считаем положительным числом.);

        Task5(-1);

        //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
        // если число отрицательное;

        System.out.println(Task6(1));

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен
        // вывести в консоль сообщение «Привет, указанное_имя!»;
        Task7("Кекс");

        //8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

        Task8(800);

        //9. *Не набирая код в IDE, ответьте на следующий вопрос. Есть два метода:

        //void myMethod(int a, String b) {}
        //void myMethod(String b, int a) {}

        //Это две разных сигнатуры одного метода или один и тот же метод?

        Task9();
    }

    static double Task3(double a, double b, double c, double d){
        return a*(b+(c/d));
    }
    static boolean Task4(int a, int b){
    return (10 <= a + b) && (a + b <= 20);
    }
    static void Task5(int number){
        System.out.println((number >= 0)? "Передано положительное число" : "Передано отрицательное число");
    }
    static boolean Task6(int number){
        return number < 0;
    }
    static void Task7(String name){
        System.out.println("Привет, "+name+"!");
    }
    static void Task8(int year){
        System.out.println(((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))
                ? "Год високосный" : "Год не високосный");
    }
    static void Task9(){
        System.out.println("Изменен порядок принимаемых аргументов. Метод перегружен. Таким образом это две разные" +
                " сигнатуры одного метода");
    }
}
