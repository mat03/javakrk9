package TDD2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DBServisTest {

    @Mock
    private DBConnector dbConnector;

    @InjectMocks
    private DBServis dbServis;

    @Test
    public void testCountWord() {
        when(dbConnector.getContent("dane",1,"a")).
                thenReturn("ala ma kota a kot ma ala kot ");

        int numberOfWord = dbServis.countWord("dane",1,"a","ala");

        assertThat(numberOfWord).isEqualTo(2);
        numberOfWord = dbServis.countWord("dane",1,"a","kot");
        assertThat(numberOfWord).isEqualTo(3);
    }


}
