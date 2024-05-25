import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
     void everyBranchTest()
    {
        RuntimeException ex;

        List<Item> list1 = null;
        int payment1 = 100;
        ex = assertThrows(RuntimeException.class, ()->SILab2.checkCart(list1,payment1) );
        assertEquals("allItems list can't be null!", ex.getMessage());

        List<Item> list2 = List.of(new Item("item1", null, 100, 0));
        int payment2 = 100;
        ex = assertThrows(RuntimeException.class, ()->SILab2.checkCart(list2,payment2));
        assertEquals("No barcode!", ex.getMessage());

        List<Item> list3 = List.of(new Item("item1", "12a45", 100, 0));
        int payment3 = 100;
        ex = assertThrows(RuntimeException.class, ()->SILab2.checkCart(list3,payment3));
        assertEquals("Invalid character in item barcode!", ex.getMessage());

        List<Item> list4 = List.of(new Item("item1", "12345", 100, 0));
        int payment4 = 50;
        assertFalse(SILab2.checkCart(list4, payment4));

        List<Item> list5 = List.of(new Item("item1", "12345", 100, 0.1f));
        int payment5 = 100;
        assertTrue(SILab2.checkCart(list5, payment5));

    }

    @Test
    void multipleConditionTest()
    {
        List<Item> list1 = Arrays.asList(new Item("item1", "0000", 500, 0.2f));
        assertTrue(SILab2.checkCart(list1, 380));

        List<Item> list2 = Arrays.asList(new Item("item1", "0000", 500, 0.2f));
        assertFalse(SILab2.checkCart(list2, 50));

        List<Item> list3 = Arrays.asList(new Item("item1", "1000", 500, 0.2f));
        assertFalse(SILab2.checkCart(list3, 80));

        List<Item> list4 = Arrays.asList(new Item("item1", "1000", 500, 0));
        assertTrue(SILab2.checkCart(list4, 600));


    }



}
