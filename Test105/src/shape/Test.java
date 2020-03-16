package shape;

public class Test {
    public static void main(String[] args) {
    drawShapes2();
    }

    public static void drawShapes(){
        String[] shapes = {"circle","rect","circle","rect","flower"};

        //for each
        //不使用多态
        for (String shape : shapes) {
            if(shape.equals("circle")){
                Circle circle = new Circle();
                circle.draw();
            }else if(shape.equals("rect")){
                Rect rect = new Rect();
                rect.draw();
            }else if(shape.equals("flower")){
                Flower flower = new Flower();
                flower.draw();
            }
        }
    }

    //使用多态,降低圈复杂度
    public static void drawShapes2(){
        Shape[] shapes = {new Circle(),new Rect(),new Circle(),new Rect(),new Flower()};
        for(Shape shape : shapes){
            shape.draw();
        }
    }
}
