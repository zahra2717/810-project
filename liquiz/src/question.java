
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class question {
  private String text;
  private  String answer1;
  private  String answer2;
  private  String answer3;
  private  String answer4;
 private ArrayList<Integer> correctAnswers;
 private ArrayList<Integer> userAnswers;
 private int type;
 private String corrextCode;
 private String userCode;

    public question(String text, String answer1, String answer2, String answer3, String answer4, ArrayList<Integer> correctAnswers, ArrayList<Integer> userAnswers, int type) {
        this.text = text;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswers = correctAnswers;
        this.userAnswers = userAnswers;
        this.type = type;
    }

    public question(String text, int type, String corrextCode, String userCode) {
        this.text = text;
        this.type = type;
        this.corrextCode = corrextCode;
        this.userCode = userCode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public ArrayList<Integer> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList<Integer> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public ArrayList<Integer> getUserAnswers() {
        return userAnswers;
    }

    public void setUserAnswers(ArrayList<Integer> userAnswers) {
        this.userAnswers = userAnswers;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCorrextCode() {
        return corrextCode;
    }

    public void setCorrextCode(String corrextCode) {
        this.corrextCode = corrextCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
 

}
