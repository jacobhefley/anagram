import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.junit.*;
import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;


public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

// @Test
//   public void checkWinner_catEqualsAct_true() {
//     assertEquals(true, App.checkWinner("act", "cat"));
//   }
//
// @Test
//   public void checkWinner_hatEqualsAt_false() {
//     assertEquals(false, App.checkWinner("at", "hat"));
//   }
//
// @Test
//   public void checkWinner_catEqualsCAT_false() {
//     assertEquals(false, App.checkWinner("CAT", "cat"));
//   }
//
// @Test
//   public void rootTest() {
//     goTo("http://localhost:4567/");
//     fill("#wordOne").with("cat");
//     fill("#wordTwo").with("act");
//     submit(".btn");
//     assertThat(pageSource()).contains("true");
// }
  //
  // @Test
  // public void checkWinner_rock_true() {
  // App testGame = new App();
  // assertThat(testGame.checkWinner("r","r2"));
	// }
 //  @Test
 //  public void checkWinner_paper_true() {
 //  App testGame = new App();
 //  assertEquals(true, testGame.checkWinner("p"));
	// }
 //  @Test
 //  public void checkWinner_scissors_true() {
 //  App testGame = new App();
 //  assertEquals(true, testGame.checkWinner("s"));
	//
}
