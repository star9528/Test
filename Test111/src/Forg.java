public class Forg extends Animal implements ISwimming,IRunning{
    public Forg(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在蹬腿跳");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "正在游");
    }
}
