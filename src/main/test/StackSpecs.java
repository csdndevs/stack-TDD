import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class StackSpecs {

    private Stack stack;

    @Before
    public void setup(){
         stack = new Stack();

    }
    @Test
    public void startsWithAnEmptyStack() {
        // Given

        // When
        int actualSize = stack.size();
        // Then
        assertEquals(0, actualSize);
    }
    @Test
    public void pushesAnItem() {
        // Given

        // When
        stack.push(5);
        // Then
        assertEquals(1, stack.size());
    }



    @Test
    public void popsAnItem(){
        //Given

        stack.push(5);
        //When
        stack.pop();

        //Then
        assertEquals(5,stack.pop());
    }

    @Test
    public void reducedSizeAfterPop(){
        //Given

        stack.push(5);

        //When
        stack.pop();

        assertEquals(0,stack.size());
    }
}
