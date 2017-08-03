package yk;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
/**
 * jsoup基本知识点，根据id、标签、类、属性，获取节点
 * 也可使用选择器，进行操作，更便捷
 *
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("https://www.cnblogs.com/");
		httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.78 Safari/537.36");
		
		CloseableHttpResponse response=httpClient.execute(httpGet); // 执行http get请求
		HttpEntity entity=response.getEntity(); // 获取返回实体
		String content = EntityUtils.toString(entity, "utf-8");
		response.close(); 
		httpClient.close();
		
		Document document = Jsoup.parse(content);
		
//		//获取标签title中的内容
//		//<title>博客园 - 开发者的网上家园</title>
//		Elements elements = document.getElementsByTag("title");
//		Element element = elements.get(0);
//		String title = element.text();
//		System.out.println(title);
		
//		//根据id获取文本内容
//		//<div id="site_nav_top">代码改变世界</div>
//		Element element2 = document.getElementById("site_nav_top");
//		String navTop = element2.text();
//		System.out.println(navTop);

//		//根据img标签获取属性src中的内容
//		Elements elements2 = document.getElementsByTag("img");
//		int size=elements2.size();
//		for(int i=0; i<size; i++){
//			Element element3 = elements2.get(i);
//			String attr = element3.attr("src");
//			System.out.println(attr);
//		}
//		System.out.println("=====================================");
//		for(Element element3 : elements2){
//			String attr = element3.attr("src");
//			String substring = attr.substring(0, 2);
//			if("//".equals(substring)){
//				System.out.println("https:"+attr);
//			}else {
//				System.out.println("https://www.cnblogs.com"+attr);
//			}
//		}
		
		//根据class样式获取内容
//		Elements elements = document.getElementsByClass("post_item");
//		for(Element element : elements){
//			System.out.println(element.toString());
//			//System.out.println(element.html());
//			System.out.println("----------------------");
//		}
		
		//使用选择器
//		Elements elements = document.select(".post_item .post_item_body h3 a");
//		for(Element element:elements){
//			System.out.println("标题："+element.text());
//			System.out.println(element.toString());
//			String href = element.attr("href");
//			System.out.println("链接："+href);
//			System.out.println("-----------------------");
//		}
		
//		//根据标签属性
//		Elements elements = document.select(".post_item .post_item_body h3 a[href]");
//		for(Element element:elements){
//			System.out.println("标题："+element.text());
//			System.out.println("链接："+element.attr("href"));
//			System.out.println("-----------------------");
//		}
		
		//$以什么结尾
//		Elements elements = document.select("img[src$=.png]");
//		for(Element element : elements){
//			System.out.println(element.toString());
//		}
		
		//获取第一个节点
//		Element element = document.getElementsByTag("title").first();
//		System.out.println(element.toString());
//		System.out.println(element.text());
		
		//获取最后一个节点
//		Element element = document.getElementsByTag("title").last();
//		System.out.println(element.toString());
//		System.out.println(element.text());
		
		//使用选择器，id获取
//		Element element = document.select("#site_nav_top").first();
//		System.out.println(element.toString());
//		System.out.println(element.text());
//		System.out.println(element.html());
		
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
		Thread.sleep(3000);
		long currentTimeMillis2 = System.currentTimeMillis();
		System.out.println(currentTimeMillis2);
	}
}
