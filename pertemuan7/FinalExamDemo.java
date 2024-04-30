public class FinalExamDemo {
    public static void main(String[] args) {
        FinalExam fe = new FinalExam(6, 3);
        fe.pointsPerQuestion = 10;
        System.out.println("Point : " + fe.getPointsPerQuestion());
        System.out.println("Missed : " + fe.getNumberMissed());
        fe.setScore(fe.getPointsPerQuestion());
        System.out.println("Gra");
    }

}
