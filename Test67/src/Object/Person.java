package Object;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void show() {
        System.out.println("name:" + name + " " + "age:" + age);
    }
}