import org.junit.*;

public class ReverseStrigTest {
  
  
  
  @Test
  public void testReverseStr1() {
    
    RverseString rs = new RverseString();
    Assert.assertEquals("AIDNI", rs.reverseStr("INDIA"))
    
  }
  
  @Test
  public void testReverseStr2() {
    
    RverseString rs = new RverseString();
    Assert.assertEquals("ADANAC", rs.reverseStr("CANADA"))
    
  }
  
  @Test
  public void testReverseStr3() {
    
    RverseString rs = new RverseString();
    Assert.assertNotNull(rs.reverseStr("REVERSE"))
    
  }
  
}
