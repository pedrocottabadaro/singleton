public class Database {

    private Database() {};

    private static Database database = new Database();

    private String ip;
    private String password;
    private String username;

    public static Database getDatabase() {
        return database;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }






}
