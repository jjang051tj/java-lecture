public class ArrayTest02 {
    public static void main(String[] args) {
        //대학교 4학년 평균

        //double[][] score02 = {{3.8,3.7},{3.2,4.1},{2.9,3.6},{3.5,4.2}};
        double[][] score02 = new double[4][2];
        score02[0][0] = 3.8;
        score02[0][1] = 3.7;

        score02[1][0] = 3.2;
        score02[1][1] = 4.1;

        score02[2][0] = 2.9;
        score02[2][1] = 3.6;

        score02[3][0] = 3.5;
        score02[3][1] = 4.2;

        System.out.println(score02[0][1]);
        for(int i=0;i<score02.length;i++) {
            for(int j=0;j<score02[i].length;j++) {
                System.out.print(score02[i][j]);
            }
            System.out.println();
        }
        for(double row[]:score02) {
            for(double score:row) {
                System.out.print(score+" ");
            }
            System.out.println();
        }
    }
}
