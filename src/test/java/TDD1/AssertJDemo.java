package TDD1;


import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AssertJDemo {
    @Test
    public void test() {
        String res = StringHelper.reverse("test");
        assertTrue(res.equals("tset"));
        String rev = "tset";
        assertEquals(rev, res);

        assertThat(res).isEqualTo("tset");

        List<String> list = Arrays.asList("abc" , "www", "hhh");

        assertThat(list).contains("www", "abc", "hhh");

        String str = "123gfsgsgfwww";

        assertThat(str).startsWith("123").endsWith("www").containsIgnoringCase("fsg");

    }
}
