public class Student

{
    String studentname;
    double studentscore;
    double averagescore;
    int numberofquiz;
    double totalquizscore;
    double totalstudentscore;
    
    public Student(String name)
    {
        studentname = name;
    }    
    
    public void addQuiz(double score, double totalscore)
   {
       studentscore = score/totalscore;
       numberofquiz = numberofquiz + 1;
       totalquizscore = totalquizscore + totalscore;
       totalstudentscore = totalstudentscore + score;
   }
   public double getNumberofTests()
   {
        double num = numberofquiz;
        return num;
   }    
   public String getName()
   {
       String Studentname = studentname;
       return studentname;
   }
   //currentquiz
   public double getScore()
   {
       double sscore = studentscore;
       return sscore;
   }    
   
   //averages
   public double getTotalScore()
   {
       double tscore = totalquizscore;
       return tscore;
   }  
   public double getStudentTotalScore()
   {
       double tsscore = totalstudentscore;
       return tsscore;   
   }
   public double getStudentPercentage()
   {
       double spercentage = totalstudentscore/totalquizscore;
       return spercentage;
   }        
}