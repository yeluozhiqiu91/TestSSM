package decode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by wang on 2018/1/22.
 */
public class URLDecoderTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String keyWord= URLDecoder.decode("%E4%B8%AD%E6%96%87","utf-8");
        System.out.println(keyWord);
        String url= URLEncoder.encode("中文","utf-8");
        System.out.println(url);
    }
}
