package TDD1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(Parameterized.class)
public class DateHelperTest {
    private int date;
    private boolean respons;

    public DateHelperTest(int date, boolean respons) {
        this.date = date;
        this.respons = respons;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParam() {
        Object[][] param = new Object[][] {
                {20001022,true},
                {20003350,false},
                {0,false},
                {200011300,false},
                {-20001022,false}
        };
        return Arrays.asList(param);
    }

    @Test
    public void testCorrectDateCheck() {
        assertThat(DateHelper.correctDateCheck(date)).isEqualTo(respons);
    }
}
