package TDD2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

/**
 * Mocowanie - robienie "oszukanie" obiektu / atrapy obiektu
 * pominiecie pewnej logiki
 */

@RunWith(MockitoJUnitRunner.class)
public class MainServiceTest {
    /*deklarujemy ze Mockito ma automatyczniezrobic obiekt klasy FileAccessService

     */
    @Mock
    private FileAccessService fileAccessService;

    /* deklarujemy ze Mockito maautomatycznie zrobic obiekt klasy MainService i
    wstrzykiwac temu obiektowi, obiektfileAccessService
     */
    @InjectMocks
    private MainService mainService;

    @Test
    public void testCount() {
        /* deklarujey zejeslizostanie wywolany metode loadAllList, to
        zamiastlaczyc sie z plikiem baza i  wysylac zniego wartosci
        ma zwrucicliste stringow na szybko
         */

        //mockowanie
        try {
            when(fileAccessService.loadAllLines()).thenReturn(Arrays.asList("one", "two"));
        } catch (IOException e) {
            fail();
        }

        //test zasadniczy
        try {
            int numOfLines = mainService.numOfLines();
            assertThat(numOfLines).isEqualTo(2);
        } catch (IOException e) {
            fail();
        }
    }

}

