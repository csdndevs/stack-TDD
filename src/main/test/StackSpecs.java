import org.junit.Test;

import static junit.framework.TestCase.*;

public class StackSpecs {
    @Test
    public void startsWithAnEmptyStack() {
        // Given
        Stack stack = new Stack();;
        // When
        int actualSize = stack.size();
        // Then
        assertEquals(0, actualSize);
    }
    @Test
    public void pushesAnItem() {
        // Given
        Stack stack = new Stack();;
        // When
        stack.push(5);
        // Then
        assertEquals(1, stack.size());
    }
}
