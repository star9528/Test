public class Fish extends Animal implements ISwimming{
    public Fish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "鱼正在用尾巴游");
    }
}
