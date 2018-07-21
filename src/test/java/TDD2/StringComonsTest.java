package TDD2;

import TDD1.InvalidArgumentException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.fail;


public class StringComonsTest {
    @Test
    public void testChangePairs() {
        String test1 = "abcdef";
        assertThat(StringCommons.changePairs(test1)).isEqualTo("badcfe");

        String test2 = "";
        assertThat(StringCommons.changePairs(test2)).isEqualTo("");

        String test3 = "a";
        assertThat(StringCommons.changePairs(test3)).isEqualTo("a");

        String test4 = "abcde";
        assertThat(StringCommons.changePairs(test4)).isEqualTo("badce");
    }

    @Test
    public void testPalindrom() {
        String text1 = "kajak";
        assertThat(StringCommons.isPalidrom(text1)).isTrue();

        String text2 = "ww";
        assertThat(StringCommons.isPalidrom(text2)).isTrue();

        String text3 = "abcd";
        assertThat(StringCommons.isPalidrom(text3)).isFalse();
    }

    @Test
    public void testWordsCon() {
        String[] text1 = new String[] {"mama", "tata", "mama", "tata", "kot"};
        assertThat(StringCommons.wordsCon(text1)).isEqualTo("kot_mama_tata");

        String[] text2 = new String[]{};
        assertThat(StringCommons.wordsCon(text2)).isEqualTo("");
    }

    @Test
    public void testMinPositive() {
        List<Double> list1 = new ArrayList<>();
        assertThat(StringCommons.minPositive(list1)).isEqualTo(-1.0);

        list1.add(-100.0);
        assertThat(StringCommons.minPositive(list1)).isEqualTo(-1.0);

        list1.add(-99.99);
        assertThat(StringCommons.minPositive(list1)).isEqualTo(-1.0);

        list1.add(0.0);
        assertThat(StringCommons.minPositive(list1)).isEqualTo(-1.0);

        list1.add(99.99);
        assertThat(StringCommons.minPositive(list1)).isEqualTo(99.99);

        list1.add(22.2);
        assertThat(StringCommons.minPositive(list1)).isEqualTo(22.2);

        list1.add(2.0);
        assertThat(StringCommons.minPositive(list1)).isEqualTo(2.0);
    }

    //Double sum(List<Double> nums, int begin, int end) throws IncorrectArgumentException

    @Test
    public void testSum() throws InvalidArgumentException {
        List<Double> list1 = new ArrayList<>();
        try {
            assertThat(StringCommons.sum(list1, 0, 3)).isEqualTo(0.0);
            Assert.fail();
        }
        catch (Exception e) {
        }

        list1.add(1.1);
        assertThat(StringCommons.sum(list1, 0, 1)).isEqualTo(1.1);

        try {
            assertThat(StringCommons.sum(list1, 0, 3)).isEqualTo(1.1);
            Assert.fail();
        }
        catch (Exception e) {
        }

        list1.add(100.0);
        assertThat(StringCommons.sum(list1, 0, 2)).isEqualTo(101.1);

        try {
            assertThat(StringCommons.sum(list1, 10, 0)).isEqualTo(101.1);
            Assert.fail();
        }
        catch (Exception e) {
        }
    }
}
