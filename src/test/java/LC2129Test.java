import static org.junit.Assert.*;

public class LC2129Test {

    @org.junit.Test
    public void capTitle() {
        String actual1 = LC2129.capTitle("capiTalIze tHe titLe");
        String actual2 = LC2129.capTitle("First leTTeR of EACH Word");
        String actual3 = LC2129.capTitle("i lOve leetcode");

        assertEquals(actual1, "Capitalize The Title" );
        assertEquals(actual2, "First Letter of Each Word");
        assertEquals(actual3, "i Love Leetcode");
    }
}