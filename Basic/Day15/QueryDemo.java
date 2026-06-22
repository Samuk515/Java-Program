package Day15;

class QueryBuilder{
    private String table = "";
    private String condition = "";
    private String order = "";
    private int  limitVal  =-1;

    QueryBuilder from(String table){
        this.table = table;
        return this; //enable chaining
    }
    QueryBuilder where(String condition){
        this.condition = condition;
        return this; //enable chaining
    }

QueryBuilder orderBy(String column){
        this.order = column;
        return this;
}
QueryBuilder limit(int n){
        this.limitVal = n;
        return this;
}
String build(){
        String q = "SELECT * FROM " + table;
        if (!condition.isEmpty()) q += " WHERE " + condition;
        if (!order.isEmpty()) q += " ORDER BY " + order;
        if (limitVal != -1) q += " LIMIT " + limitVal;
        return q;
}

}

public class QueryDemo {
    public static void main(String[] args) {
        String query = new QueryBuilder()
                .from("Students")
                .where("age > 18")
                .orderBy("name")
                .limit(10)
                .build();

        System.out.println(query);
    }
}
