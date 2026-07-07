package Day28;

class User{
    private static int nextId = 1;
    private int id;
    private String username;
    private String email;
    private String passwordHash;
    private String role;

    public User(String username, String password, String role, String email){
        this.id = nextId++;
        this.username = username;
        this.passwordHash = password;
        this.role = role;
        this.email = email;
    }

    private String hashPassword(String password){
        return "HASH [" + password.length() + ":" + password.charAt(0) +"]";

    }
    public boolean checkPassword(String password){
        return this.passwordHash.equals(hashPassword(password));
    }
    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }

    protected String getRole() { return role; }
    public String toString()  {
        return "[" + id + ", " + username + "| " + email + ", " + passwordHash + " | " + role + "]";
    }
}
 class AdminUser extends User{
    AdminUser(String username, String password, String role, String email){
        super(username, password, role, email);
    }
    void resetPassword(User target, String newPassword){
        System.out.println("Password reset for: " + target.getUsername());
    }
    void showRole() {
        System.out.println(getUsername() + " has role: " + getRole());
    }
 }
 class UserManager {
    private User[] users = new User[10];
    private int count = 0;

    public void  addUser(User user){
        users[count++] = user;
        System.out.println("User added: " + user.getUsername());
    }
    public User findByUsername(String username){
        for ( int i= 0; i < count; i++)
            if (users[i].getUsername().equals(username))
                return users[i];
        return null;
    }
    public  void printAll(){
        System.out.println("=== User List ===");
        for (int i = 0; i < count; i++)
            System.out.println(users[i]);
    }
 }
public class UserSystem {
    public static void main(String[] args) {
        UserManager mgr = new UserManager();

        AdminUser admin = new AdminUser("arjun", "secret123", "","arjun@gmail.com");
        User member = new User ("priya", "pass456", "member", "Prya@mail.com");

        mgr.addUser(member);
        mgr.addUser(admin);
        mgr.printAll();

        System.out.println("Password check for arjun: " + admin.checkPassword("secret123"));
        System.out.println("Password check wrong  :" + admin.checkPassword("wrong") );
        admin.showRole();
    }
}
