package challenges.C2_School;

public class Tutor {
  private Student student;

  public void setStudent(Student student) {
    this.student = student;
  }

  public synchronized void studyTime() {
    System.out.println("Tutor has arrived");
    try {
      // wait for student to arrive and hand in assignment
      Thread.sleep(300);
    } catch (InterruptedException e) {

    }

    student.startStudy();
    System.out.println("Tutor is studying with student");
  }

  public synchronized void getProgressReport() {
    // get progress report
    System.out.println("Tutor gave progress report");
  }
}
