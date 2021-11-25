
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * This method is testing out the word occurrences app.
 *
 *
 *
 */

public class test {
    /**
     * Testing method reads the method called read and checks for correct or incorrect results.
     *
     * @throws IOException
     */
    @Test
    public void somethingLook () throws IOException {

        main search = new main();
        search.read();
        HashMap<String, Integer> map = search.listAmount();
        assertEquals(56, (int)map.get("the"));
    }


}
