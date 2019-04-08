package stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CharacterCountTest {
    private  static  CharacterCount characterCount;

    @BeforeClass
    public static void setup(){
        characterCount = new CharacterCount();
    }
    @AfterClass
    public static  void Teardown(){
        characterCount=null;
    }
    @Test
    public void testCount(){
        assertEquals("check the regex pattern",15,characterCount.countCharacter("Java is java again java again count number of occurrence of a in the given Again Java","a"));
    }
    @Test
    public void testCountFailure(){
        assertNotEquals("check the function is not working",0,characterCount.countCharacter("bALbASKAR","b"));
    }
    @Test
    public void testCountNull(){
        assertEquals("The function should return 0 if string is empty",0,characterCount.countCharacter("","c"));
    }
    @Test
    public void testCountCase(){
        assertEquals("the regex does not ignore case",3,characterCount.countCharacter("JeevaJayjay","j"));
    }

}
