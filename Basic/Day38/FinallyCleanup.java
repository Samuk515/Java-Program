package Day38;

class DBConnection {
    private boolean isOpen = false;

    void open() {
        isOpen = true;
        System.out.println("[DB ] Connection opened");
    }

    String query(String sql) throws Exception {
        if (!isOpen) throw new IllegalStateException("[DB ] Connection is closed");
        if(sql == null || sql.trim().isEmpty()) throw new IllegalArgumentException("[DB ] SQL string is empty");
        if (sql.toLowerCase().contains("drop")) throw new Exception("Dangerous SQL blocked: " + sql);
        System.out.println("[DB ] Executing query: " + sql);
        return "ResultSet"; // Simulated result
    }
    void close() {
        if (isOpen) isOpen = false;
        System.out.println("[DB ] Connection closed");
    }
}

public class FinallyCleanup {

    static void runQuery(String sql) {
        DBConnection conn = null;
        try {
            conn  = new DBConnection();
            conn.open();
            String result = conn.query(sql);
            System.out.println("[DB] Result: " + result);
        } catch (IllegalStateException e) {
            System.out.println("[App] Bad SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[App] Query failed: " + e.getMessage());
        } finally {
            if (conn != null) conn.close(); // Always closes!
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Valid query ===");
        runQuery("SELECT * FROM users");

        System.out.println("\n=== Empty SQL ===");
        runQuery("");

        System.out.println("\n=== Empty SQL ===");
        runQuery("   ");

        System.out.println("\n=== Dangerous SQL ===");
        runQuery("DROP TABLE users");
    }
}
