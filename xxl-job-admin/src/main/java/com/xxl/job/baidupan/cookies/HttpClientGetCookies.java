package com.xxl.job.baidupan.cookies;

import java.io.IOException;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class HttpClientGetCookies {

	private static String url = "https://pan.baidu.com/s/1eQrwbKY";// 资源地址
	
	public static void main(String[] args) {
		
		CookieStore cookieStore = new BasicCookieStore();
		CloseableHttpClient httpClient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
		
		HttpGet reqGet = new HttpGet(url);
		reqGet.setHeader("accept", "*/*");
		reqGet.setHeader("connection", "Keep-Alive");
		reqGet.setHeader("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

		try {
			
			
			CloseableHttpResponse response = httpClient.execute(reqGet);
			
			List<Cookie> cookies = cookieStore.getCookies();
			
			for (Cookie c : cookies) {
				System.out.println(c.getName() + "=" + c.getValue());
			}
			
			httpClient.close();
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
