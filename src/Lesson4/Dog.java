package Lesson4;

public class Dog extends Animal {
    protected double runLimit = 500;
    protected double jumpLimit = 0.5;
    protected double swimLimit = 10;

    public Dog(){ }
    public Dog(double runLimit, double jumpLimit, double swimLimit){
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
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
