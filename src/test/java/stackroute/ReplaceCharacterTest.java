package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ReplaceCharacterTest {
     private  static  ReplaceCharacter replace;
    @BeforeClass
    public static void  setup(){
        replace =new ReplaceCharacter();
    }
    @AfterClass
    public static void Teardown(){
        replace = null;
    }
    @Test
    public void replaceString(){
        assertEquals("The String characters is not replaced","faity fry",replace.characcterReplace("daily dry"));
    }
    @Test
    public void replaceStringFailure(){
        assertNotNull("The function is not working",replace.characcterReplace("jeeevada"));
    }
    @Test
    public void replaceStringCase(){
        assertEquals("The case is not correct","faniet",replace.characcterReplace("Daniel"));
    }
}
