package problem;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c[] = new Circle[3]; // 3개의 Circle 배열 선언
        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >> ");
            int x = sc.nextInt(); // x값 읽기.
            int y = sc.nextInt(); // y값 읽기.
            int radius = sc.nextInt(); // radius값 읽기.
            c[i] = new Circle(x, y, radius); // Circle 객체 생성
        }
        for (int i = 0; i < c.length; i++) {
            c[i].show(); // 모든 Circle 객체 출력
        }
        sc.close();
    }
}
