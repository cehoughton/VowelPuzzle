import org.junit.*;
import static org.junit.Assert.*;


public class AppTest {

  @Test
  public void vowelsToDashes_returnDashForA_BDashT() {
    App app = new App();
    assertEquals("B-T", app.vowelsToDashes("BAT"));
  }

  @Test
  public void vowelsToDashes_returnDashForE_BDashTDash() {
    App app = new App();
    assertEquals("B-T-", app.vowelsToDashes("BATE"));
  }

  @Test
  public void vowelsToDashes_willIgnoreCase_BDashTDash() {
    App app = new App();
    assertEquals("B-T-", app.vowelsToDashes("BaTe"));
  }

  @Test
  public void vowelsToDashes_willLeaveConsonants_BDashTDash() {
    App app = new App();
    assertEquals("B-T-", app.vowelsToDashes("BaTe"));
  }

  @Test
  public void vowelsToDashes_replaceAllVowelsWithDash_BDashTDashDashDashDash() {
    App app = new App();
    assertEquals("B-T----", app.vowelsToDashes("BaTeIOu"));



  }
}
