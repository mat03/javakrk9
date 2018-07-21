package TDD2;

public class DBServis {
    private DBConnector dbConnector;

    public DBServis(DBConnector dbConnector) {
        this.dbConnector = dbConnector;
    }

    public int countWord(String tableName, int rowId, String columnName, String word) {
        String fromDB;
        int lastIndex = 0;
        int count = 0;

        fromDB = dbConnector.getContent(tableName, rowId, columnName);

        while (lastIndex != -1) {
            lastIndex = fromDB.indexOf(word, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += word.length();
            }
        }
        return count;
    }
}
