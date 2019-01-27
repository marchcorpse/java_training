package Lesson4;

public class Employee {
    protected String fullName, post, email;
    protected int phone, salary, age;

    public Employee(String fullName, String post, String email, int phone, int salary, int age){
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInfo(){
        System.out.println("ФИО: "+this.fullName+"\nДолжность: "+ this.post +"\nEmail: "+this.email
                +"\nТелефон: "+ this.phone +"\nРазмер заработной платы: "+ this.salary+"\nВозраст: "+ this.age +"\n");
    }
}
