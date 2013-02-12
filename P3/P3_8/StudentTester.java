
/**
 * Write a description of class StudentTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentTester
{
    public static void main(String [] args)
    {
        Student bob = new Student("Billy Bob");
        bob.addQuiz(99,100);
        bob.addQuiz(88,100);
        bob.addQuiz(79,100);
        System.out.println(bob.getName() + "has taken " + bob.getNumberofTests() + " tests. Of these tests he's had an average of " + bob.getStudentPercentage() + "%. The total points possible of these " + bob.getNumberofTests() + " tests has been " + bob.getTotalScore() + "% and the student has had a total score of " + bob.getStudentTotalScore() + "%");
    }    
}