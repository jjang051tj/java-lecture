package problem;

public class Circle {
    // 속성을 함부로 노출하면 안됨
    // 클래스도 변수 함수
    // 생성자 함수  overload
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }


    public void show() {
        System.out.printf("(%f,%f) %d",x,y,radius);
    }
}
