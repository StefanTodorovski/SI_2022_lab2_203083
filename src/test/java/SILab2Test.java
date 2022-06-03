import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> createList(String...elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyBranchandStatementTest () {
        RuntimeException ex;


        // EMPTY INPUT List length should be greater than 0
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));
        // List length should be a perfect square ( ne e kvadrat )


        ex = assertThrows(RuntimeException.class, () -> SILab2.function(createList("#","0","0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        // INPUT #0##
        List<String> lista= new ArrayList<String>();
        lista.add("#");
        lista.add("2");
        lista.add("#");
        lista.add("#");
        assertEquals(lista, SILab2.function(createList("#","0","#","#")));

        // INPUT 0#00
        List<String> lista2=new ArrayList<>();
        lista2.add("1");
        lista2.add("#");
        lista2.add("0");
        lista2.add("1");
        assertEquals(lista2,SILab2.function(createList("0","#","0","0")));

        //INPUT e # 0 # 0 # 0 0 0 0
        List<String> lista3 = new ArrayList<>();
        lista3.add("#");
        lista3.add("3");
        lista3.add("#");
        lista3.add("2");
        lista3.add("#");
        lista3.add("2");
        lista3.add("0");
        lista3.add("1");
        lista3.add("0");


        assertEquals(lista3,SILab2.function(createList("#","0","#","0","#","0","0","0","0")));






    }


}