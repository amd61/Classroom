import java.util.ArrayList;

public class Classroom{
  private String name;
  private ArrayList<Person> student;


  public Classroom(String name){
    this.name = name;
    this.student = new ArrayList<Person>();
  }
  public String getName(){
    return this.name;
  }

  public int classCount(){
    return student.size();
  }

  public void enrolNewStudent(Person person){
    student.add(person);
  }

  

}
