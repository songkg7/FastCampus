package ioc;

import java.util.Base64;

public class Base64Encoder implements Encoder {

    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
