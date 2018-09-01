package pl.kodu.akademia.repository;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    public static Map<String, String> userData = new HashMap<String, String>();

    public static void generateData() {
        String user = "Janusz";
        String password = "grazyna";

        String hashedPassword = DigestUtils.md5Hex(password).toUpperCase();

        userData.put(user, hashedPassword);
    }
}
