import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstJavaProgramTest {

  @Test
  public void add() {
	int num=new FirstJavaProgram().add(4, 6);
	Assert.assertEquals(num, 6);
    
  }
}
