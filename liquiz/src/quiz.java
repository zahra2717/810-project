
public class quiz {
   private question[] questions;
   private int numQuestions;
   private int score = 0;
  private int index=0;

    public int getNumQuestions() {
        return numQuestions;
    }

    public quiz(int numQuestions) {
        this.numQuestions = numQuestions;
        questions = new question[numQuestions];
    }
  public void add(question q){
     questions[index++]=q; 
  } 
  public question getQuestion(int i){
  return questions[i];}
  
  public int getScore(){
        for(question q : questions)
            if(q.getType()==0)
            {for(int y : q.getUserAnswers())
          if(q.getCorrectAnswers().contains(y))score++;
          }else   if(q.getType()==1)
            {boolean yes = true;
                for(int y : q.getUserAnswers())
          if(!q.getCorrectAnswers().contains(y))yes=false;
                if(yes)score++;
          }
            else{
                if(q.getCorrextCode().equals(q.getUserCode()))score++;
            }
      return score;
  }
  

  
}
