import org.example.Pet;
import org.example.Pig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPig {
    @Test
    public void testSound() {
        Pet pig = new Pig("Банка");
        Assertions.assertEquals("Sniff-Sniff", pig.makeSound());
    }
}
