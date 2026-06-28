package L2;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class Level2Test {
    @Test
    public void testIntegerEquality() {
        Integer a = 42;
        Integer b = 42;
        Integer c = 99;

        assertThat(a).isEqualTo(b);
        assertThat(a).isNotEqualTo(c);
    }

    @Test
    public void testObjectReference() {
        String original = new String("hello");
        String mismaReferencia = original;       // apunta al MISMO objeto
        String otroObjeto = new String("hello"); // valor igual, objeto DISTINTO

        assertThat(original).isSameAs(mismaReferencia);
        assertThat(original).isNotSameAs(otroObjeto);
    }

    @Test
    public void testArraysAreIdentical() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        assertThat(array1).containsExactly(array2);
    }

    @Test
    public void testArrayListOrder() {
        L2.Amphibian axolot = new Amphibian("Axolot");
        Fish shark = new Fish("shark");
        Mammals elephant = new Mammals("Elephant");
        Reptiles snake = new Reptiles("Snake");
        Reptiles notAdded = new Reptiles("Komodo");

        List<Object> list = new ArrayList<>();
        list.add(axolot);
        list.add(shark);
        list.add(elephant);
        list.add(snake);


        assertThat(list).containsExactly();
        assertThat(list).containsExactlyInAnyOrder();
        assertThat(list).containsOnlyOnce();
        assertThat(list).doesNotContain(notAdded);
    }

    @Test
    public void MapContainsKey() {
        Map<String, Integer> examGrade = new HashMap<>();
        examGrade.put("Marc", 89);
        examGrade.put("Jordi", 74);

        assertThat(examGrade).containsKey("Jordi");
    }

    @Test
    public void testEmptyOptional() {
        Optional<String> emptyOptional = Optional.empty();

        assertThat(emptyOptional).isEmpty();

        // Bonus — un Optional con valor NO está vacío
        Optional<String> presentOptional = Optional.of("hello");
        assertThat(presentOptional).isPresent();
    }

}
