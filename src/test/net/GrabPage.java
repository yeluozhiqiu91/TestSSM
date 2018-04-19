package net;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.*;

/**
 * Created by wang on 2018/1/27.
 */
public class GrabPage {
    public static HttpClient httpClient=new HttpClient();
    public static boolean downloadPage(String path) throws IOException {
        PostMethod postMethod=new PostMethod(path);
        NameValuePair[] nameValuePairs=new NameValuePair[2];
        nameValuePairs[0]=new NameValuePair("name","haha");
        nameValuePairs[1]=new NameValuePair("password","2342");
        postMethod.addParameters(nameValuePairs);
        int statusCode=httpClient.executeMethod(postMethod);
        if(statusCode== HttpStatus.SC_OK){
            File file=new File("d:/test/test1.html");
            InputStream inputStream= postMethod.getResponseBodyAsStream();
            postMethod.releaseConnection();
            OutputStream outputStream=new FileOutputStream(file);
            byte[] bytes=new byte[512];
            while (inputStream.read(bytes)!=-1){
                outputStream.write(bytes);
            }
            if(inputStream!=null){
                inputStream.close();
            }
            if(outputStream!=null){
                outputStream.close();
            }
            return true;
        }else if(statusCode==HttpStatus.SC_MOVED_TEMPORARILY||statusCode==HttpStatus.SC_MOVED_PERMANENTLY){
            Header header=postMethod.getResponseHeader("location");
            if(header!=null){
                String newUrl=header.getValue();
                if(newUrl==null||newUrl.equals("")){
                    newUrl="/";
                    PostMethod postMethod1=new PostMethod(newUrl);
                }
            }
            return true;
        }else{
            postMethod.releaseConnection();
            return false;
        }
    }
}
