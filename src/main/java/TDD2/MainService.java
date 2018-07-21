package TDD2;

import java.io.IOException;

public class MainService {
    private FileAccessService fileAccessService;

    public MainService(FileAccessService fileAccessService) {
        this.fileAccessService = fileAccessService;
    }

    public int numOfLines() throws IOException {
        return fileAccessService.loadAllLines().size();
    }
}
