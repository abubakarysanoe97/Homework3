package chapter9.shapes;

public class Square extends Rectangle {

    @Override
    public double calculatePerimeter() {
        return sides * lenght;
    }
    public void print(String what){
        System.out.println("I am a " + what);
    }
}
