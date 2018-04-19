package net;

/**
 * Created by wang on 2018/1/27.
 */
public class GrabPageTest {
    public static void main(String[] args) {
        try {
            GrabPage.downloadPage("https://www.baidu.com");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
