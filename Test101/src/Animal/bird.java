package Animal;

public class bird extends Animal{
    public bird(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(this.name + "正在飞");
    }
}
