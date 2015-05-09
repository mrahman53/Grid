import org.testng.annotations.Test;

/**
 * Created by mrahman on 5/8/15.
 */

public class App extends Base{


   @Test
    public void home(){
       System.out.println(driver.getCurrentUrl());
   }


}
