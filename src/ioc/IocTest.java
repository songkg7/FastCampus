package ioc;

public class IocTest {
    public static void main(String[] args) {


        String url = "www.naver.com/api?userId=user100&page=10&size=10";

        Encoder base64Encoder = new Base64Encoder();
        String base64Url = base64Encoder.encode(url);
        System.out.println("base64Url = " + base64Url);

        Encoder urlEncoder = new UrlEncoder();
        String urlEncode = urlEncoder.encode(url);
        System.out.println("urlEncode = " + urlEncode);
    }
}
