package problem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Problem0502 {
    public static void main(String[] args) {
        HashMap<String, Student> hashMap = new HashMap<>();

        hashMap.put("장성호",new Student("장성호","java",1,4.25));
        hashMap.put("장동건",new Student("장동건","html",2,3.25));
        hashMap.put("정형돈",new Student("정형돈","css",3,2.25));
        hashMap.put("유재석",new Student("유재석","javascript",4,1.25));
        //map 출력 하기  map 순서 없음
        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.println(hashMap.get(iterator.next()));
        }
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String name = scanner.nextLine();
            if(name.equals("그만")) break;
            Student student = hashMap.get(name);
            System.out.println(student);
        }
    }
}
