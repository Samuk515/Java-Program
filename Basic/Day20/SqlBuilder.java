package Day20;

public class SqlBuilder {

    static String buildInsert(String table, String[] cols, String[] vals) {
        StringBuilder sb = new StringBuilder("INSERT INTO ");
        sb.append(table).append(" (");

        for (int i = 0; i < cols.length; i++) {
            sb.append(cols[i]);
            if (i < cols.length - 1) sb.append(",");
        }

        sb.append(") VALUES (");
        for (int i = 0; i < vals.length; i++) {
            // wrap non-numeric values in quotes
            try {
                Double.parseDouble(vals[i]);
                sb.append(vals[i]);
            } catch (NumberFormatException e) {
                sb.append("'").append(vals[i]).append("'");
            }
            if (i < vals.length - 1) sb.append(",");
        }
        sb.append(")");
        return sb.toString();
    }

    static String buildSelect(String table, String[] cols, String condition) {
        StringBuilder sb = new StringBuilder("SELECT ");

        for (int i = 0; i < cols.length; i++) {
            sb.append(cols[i]);
            if (i < cols.length - 1) sb.append(",");
        }

        sb.append(" FROM ").append(table);
        if (condition != null && !condition.isEmpty())
            sb.append(" WHERE ").append(condition);
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] cols = {"name", "age", "gpa"};
        String[] vals = {"Arjun", "22", "3.8"};

        System.out.println(buildInsert("students", cols, vals));
        System.out.println(buildSelect("students", cols, "gpa > 3.5"));
    }
}
