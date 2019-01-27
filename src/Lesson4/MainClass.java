package Lesson4;

public class MainClass {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Петров Василий", "Инженер-тестировщик",
                "qa@work.ru", 249333222, 45, 40);
        employees[1] = new Employee("Васильев Петр", "Тестировщик-инженер",
                "qa2@work.ru", 249333221, 54, 41);
        employees[2] = new Employee("Петрова Василиса", "Жена инженера-тестировщик",
                "qa-wife@work.ru", 249333223, 0, 39);
        employees[3] = new Employee("Васильева Петра", "Жена тестировщика-инженера",
                "qa-wife2@work.ru", 249333224, 0, 22);
        employees[4] = new Employee("Директор Директоров", "Главный директор",
                "handsome@work.ru", 249333225, 2311321, 99);

        for(Employee employee : employees ){
            if(employee.age > 40){
                employee.employeeInfo();
            }
        }

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(400, 20, 15);

        System.out.println("dog1(runLimit/jumpLimit/swimLimit): "+dog1.runLimit+" "+dog1.jumpLimit+" "+dog1.swimLimit);
        dog1.run(500);
        dog1.run(501);
        dog1.jump(0.5);
        dog1.jump(1);
        dog1.swim(5);
        dog1.swim(11);

        System.out.println("\ndog2(runLimit/jumpLimit/swimLimit): "+dog2.runLimit+" "+dog2.jumpLimit+" "+dog2.swimLimit);
        dog2.run(400);
        dog2.run(501);
        dog2.jump(10);
        dog2.jump(21);
        dog2.swim(10);
        dog2.swim(16);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat(400, 5);

        System.out.println("\ncat1(runLimit/jumpLimit/swimLimit): "+cat1.runLimit+" "+cat1.jumpLimit+" "+cat1.swimLimit);
        cat1.run(200);
        cat1.run(201);
        cat1.jump(2);
        cat1.jump(3);
        cat1.swim(10);
        cat1.swim(16);

        System.out.println("\ncat2(runLimit/jumpLimit/swimLimit): "+cat2.runLimit+" "+cat2.jumpLimit+" "+cat2.swimLimit);
        cat2.run(400);
        cat2.run(401);
        cat2.jump(5);
        cat2.jump(6);
        cat2.swim(5);
        cat2.swim(11);
    }
}
