import org.example.Pet;
import org.example.Rat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRat {
    @Test
    public void testSound(){
        Pet rat = new Rat("Монетка");
        Assertions.assertEquals("Squeak-Squeak", rat.makeSound());
    }
}
