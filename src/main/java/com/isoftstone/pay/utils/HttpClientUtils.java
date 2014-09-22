/**
 * 
 */
package com.isoftstone.pay.utils;

import java.net.URI;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author lllianga
 * 2014年9月17日下午6:27:26
 */
public class HttpClientUtils {

    /**
     * 发送Get请求
     * 
     * @param url
     * @param params
     * @return
     */
    public static String get(String url, List<NameValuePair> params) throws Exception{
        String body="";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpGet httpGet = new HttpGet(url);
            //设置请求和传输超时时间
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();
            httpGet.setConfig(requestConfig);
            // 设置参数
            String str = EntityUtils.toString(new UrlEncodedFormEntity(params));
            httpGet.setURI(new URI(httpGet.getURI().toString() + "?" + str));
            CloseableHttpResponse response = httpclient.execute(httpGet);
            try {
                System.out.println(response.getStatusLine());
                HttpEntity entity = response.getEntity();
                body = EntityUtils.toString(entity);
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity);
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
        return body;
    }
    /**  
     * 发送 Post请求  
     * @param url  
     * @param reqXml  
     * @return  
     */  
    @SuppressWarnings("deprecation")
    public static String post(String url, List<NameValuePair> params) throws Exception{  
        String body="";
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httpPost = new HttpPost(url);
            //设置请求和传输超时时间
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000).build();
            httpPost.setConfig(requestConfig);
            httpPost.setEntity(new UrlEncodedFormEntity(params));
            CloseableHttpResponse response = httpclient.execute(httpPost);

            try {
                System.out.println(response.getStatusLine());
                HttpEntity entity = response.getEntity();
                body = EntityUtils.toString(entity);
                // do something useful with the response body
                // and ensure it is fully consumed
                EntityUtils.consume(entity);
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
        return body;
    }  
}
