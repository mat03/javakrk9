package TDD2;


import wyruwnawcze.Information;

import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnector {
    private final static Logger logger = Logger.getLogger(Information.class.getName());

    public String getContent(String tableName, int RowId,  String columnName) {
        logger.log(Level.INFO, "Reading data from table " + tableName);
        return "this is the content aaa bbb test wwww 123 hhh";
    }
}
