package Lesson4;

public class Cat extends Animal {
    protected double runLimit = 200;
    protected double jumpLimit = 2;
    protected double swimLimit = 0;

    public Cat(){}
    public Cat(double runLimit, double jumpLimit){
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run(double distance){
        boolean runStatue = this.runLimit >= distance;
        System.out.println("run("+distance+"): "+runStatue);
    }

    @Override
    public void jump(double height){
        boolean runStatue = this.jumpLimit >= height;
        System.out.println("jump("+height+"): "+runStatue);
    }

    @Override
    public void swim(double distance){
        boolean runStatue = this.swimLimit >= distance;
        System.out.println("swim("+distance+"): "+runStatue);
    }
}
