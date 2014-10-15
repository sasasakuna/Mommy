package mommy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hjli on 10/15/14.
 */
public class MommyTest {
    @Test
    public void testSingleCharacter() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals(" ", mommy.dojo(" "));
    }

    @Test
    public void shouldReturnMommyWhenInputA() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("mommy", mommy.dojo("a"));
    }

    @Test
    public void shouldReturnMommyWhenPassTwoWows() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("mommy", mommy.dojo("ae"));
    }

    @Test
    public void shouldReturnBWhenPassB() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("b", mommy.dojo("b"));
    }

    @Test
    public void shouldReturnBMommyWhenPassBa() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("bmommy", mommy.dojo("ba"));
    }

    @Test
    public void shouldReturnMommyBMommyWhenPassABE() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("mommybmommy", mommy.dojo("abe"));
    }

    @Test
    public void shouldReturnShyWhenPassShy() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("shy", mommy.dojo("shy"));

    }

    @Test
    public void shouldReturnCastWhenPassCast() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("cast", mommy.dojo("cast"));
    }

    @Test
    public void shouldReturnNmommyWhenPassNo() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("nmommy", mommy.dojo("no"));
    }

    @Test
    public void shouldReturnmommyWhenPassEaa() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("mommy", mommy.dojo("Eaa"));
    }

    @Test
    public void shouldReturnMOMMYWhenPassEa() throws Exception {
        Mommy mommy = new Mommy();
        assertEquals("MOMMY", mommy.dojo("Eam"));
    }
}
