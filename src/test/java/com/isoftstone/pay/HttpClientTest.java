/**
 * 
 */
package com.isoftstone.pay;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.isoftstone.pay.utils.HttpClientUtils;

/**
 * @author lllianga 2014年9月17日下午5:54:02
 */
public class HttpClientTest {

   

    public static void main(String[] arg) throws Exception {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("service", "xxx@gmail.com"));
        params.add(new BasicNameValuePair("channel_id", "xxx"));
        params.add(new BasicNameValuePair("sign", "1"));
        params.add(new BasicNameValuePair("_input_charset", "1"));
        params.add(new BasicNameValuePair("notify_url", "1"));
        params.add(new BasicNameValuePair("return_url", "1"));
        params.add(new BasicNameValuePair("error_notify_url ", "1"));
        params.add(new BasicNameValuePair("total_fee ", "1"));
        params.add(new BasicNameValuePair("out_trade_no ", "1"));
        params.add(new BasicNameValuePair("subject ", "1"));
        System.out.println(HttpClientUtils.get("http://localhost:8080/pay-platform/test.do", params));
    }

}
