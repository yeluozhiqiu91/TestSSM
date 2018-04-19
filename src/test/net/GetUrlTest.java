package net;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;


/**
 * Created by wang on 2018/1/27.
 */
public class GetUrlTest {
    public static void main(String[] args) throws IOException {
        org.apache.commons.httpclient.HttpClient httpClient1=new org.apache.commons.httpclient.HttpClient();
        PostMethod postMethod=new PostMethod("https://www.baidu.com");
        NameValuePair[] postData=new NameValuePair[2];
        postData[0]=new NameValuePair("武器","枪");
        postData[1]=new NameValuePair("什么枪","神枪");
        postMethod.addParameters(postData);
        int statusCode=httpClient1.executeMethod(postMethod);
        System.out.println("response="+postMethod.getResponseBodyAsString());
        postMethod.releaseConnection();
    }
}
