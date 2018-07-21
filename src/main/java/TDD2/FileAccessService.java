package TDD2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
w tescie bedziey robic atrape danej klasy
 */

public class FileAccessService {
    private String path;

    public FileAccessService(String path) {
        this.path = path;
    }

    //zwraca wszystkie linie z pliku tekstowego w postaci listy
    public List<String> loadAllLines() throws IOException {
        Path p = Paths.get(path);

        return Files.readAllLines(p);
    }
}
