import java.util.HashMap;

public class IdAndPasswords {
    private HashMap<String,String> loginData;

    public IdAndPasswords() {
        this.loginData = new HashMap<>();
        loginData.put("Hristo","Pizza");
        loginData.put("Petar","Biscuit");
        loginData.put("Georgi","Tomato");
        loginData.put("Victor","Football");
        loginData.put("Nikolas","Boxer");
    }

    protected HashMap<String, String> getLoginData() {
        return loginData;
    }
}
