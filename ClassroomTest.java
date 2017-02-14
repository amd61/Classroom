import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class ClassroomTest{
  Classroom classroom;
  Person robert;
  Person mark;
  Person peter;
  Person john;

  @Before 
  public void before() {

    classroom = new Classroom("DayCare");
    robert = new Person("Robert");
    mark = new Person("Mark");
    peter = new Person("Peter");
    john = new Person("John");
    
  }

  @Test
  public void hasName(){
    assertEquals("DayCare", classroom.getName()); 
  }

  @Test
  public void checkEmptyClassroom(){
    assertEquals(0, classroom.classCount());
  }

  @Test
  public void testAddPerson(){
    classroom.enrolNewStudent(robert);
    assertEquals(1, classroom.classCount());
  }


  
}
