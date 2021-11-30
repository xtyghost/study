package jwt;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;

import java.util.HashMap;

/**
 * @author xutong
 */
public class JwtToken {
    public static String Secret = "xutong";

    public static String generateToken() throws Exception {
        HashMap<String, Object> header = new HashMap<>();
        header.put("alg","HS256");
        header.put("typ","JWT");

        return "";
    }
}
