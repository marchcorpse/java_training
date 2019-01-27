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
        employees[3] = new Employee("Васильева Петра", "Жена тестировщик-инженера",
                "qa-wife2@work.ru", 249333224, 0, 22);
        employees[4] = new Employee("Директор Директоров", "Главный директор",
                "handsome@work.ru", 249333225, 2311321, 99);

        for(Employee employee : employees ){
            if(employee.age > 40){
                employee.employeeInfo();
            }
        }
    }
}
