package L2;

import L1Exe3.ArrayException;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.assertThat;


public class Level2Test {
    @Test
    public void integerEqual() {
        Integer a = 42;
        Integer b = 42;
        assertThat(a).isEqualTo(b);
    }

    @Test
    public void integerNotEqual() {
        Integer a = 42;
        Integer b = 99;
        assertThat(a).isNotEqualTo(b);
    }

    @Test
    public void sameOrNotSameMemoryReference() {
        String firstObject = new String("Test");
        String secondObject = firstObject;
        String thirdObject = new String("Test");

        assertThat(firstObject).isSameAs(secondObject);
        assertThat(firstObject).isNotSameAs(thirdObject);
    }

    @Test
    public void identicalArrays() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        assertThat(array1).containsExactly(array2);
    }

    @Test
    public void testArrayListOrder() {//TODO nombres de test mas específicos
        Amphibian axolot = new Amphibian("Axolot");
        Fish shark = new Fish("shark");
        Mammals elephant = new Mammals("Elephant");
        Reptiles snake = new Reptiles("Snake");
        Reptiles notKomodo = new Reptiles("Komodo");

        List<Object> list = new ArrayList<>();
        list.add(axolot);
        list.add(shark);
        list.add(elephant);
        list.add(snake);

        assertThat(list).containsExactly(axolot, shark, elephant, snake);
        assertThat(list).containsExactlyInAnyOrder(shark, snake,axolot, elephant);
        assertThat(list).containsOnlyOnce(axolot);
        assertThat(list).doesNotContain(notKomodo);
    }

    @Test
    public void mapContainsKey() {
        Map<String, Integer> examGrade = new HashMap<>();
        examGrade.put("Marc", 89);
        examGrade.put("Jordi", 74);
        assertThat(examGrade).containsKey("Jordi");
    }

    @Test
    public void invalidIndex() {
        ArrayException exceptionInt = new ArrayException ();
        AssertionsForClassTypes.assertThatThrownBy(() -> {
                    exceptionInt.throwException(3);
                })
                .isInstanceOf(ArrayIndexOutOfBoundsException.class)
                .hasMessageContaining("Invalid index");
    }

    @Test
    public void emptyOptional() {
        Optional<String> empty = Optional.empty();
        assertThat(empty).isEmpty();
    }
}
