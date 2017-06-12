import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TotalAndAverageScore {

    private int koreanScore;
    private int englishScore;
    private int mathematicsScore;


    public TotalAndAverageScore(int koreanScore, int englishScore, int mathematicsScore){
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathematicsScore = mathematicsScore;
    }


    public int getTotalScore(){
        return this.koreanScore + this.englishScore + this.englishScore;
    }

    public float getAverageScore(){
        return getTotalScore() / 3;
    }


    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);

        try {

            System.out.print("국어: ");
            int koreanScore = Integer.parseInt(in.readLine());
            System.out.print("영어: ");
            int englishScore = Integer.parseInt(in.readLine());
            System.out.print("수학: ");
            int mathematicsScore = Integer.parseInt(in.readLine());

            int totalScore = koreanScore + englishScore + mathematicsScore;
            float averageScore = totalScore / 3;

            System.out.println("총 점수 : " + totalScore);
            System.out.println("평균 점수 : " + averageScore);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
