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
 * jsoup����֪ʶ�㣬����id����ǩ���ࡢ���ԣ���ȡ�ڵ�
 * Ҳ��ʹ��ѡ���������в����������
 *
 */
public class Demo1 {
	public static void main(String[] args) throws Exception{
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("https://www.cnblogs.com/");
		httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.78 Safari/537.36");
		
		CloseableHttpResponse response=httpClient.execute(httpGet); // ִ��http get����
		HttpEntity entity=response.getEntity(); // ��ȡ����ʵ��
		String content = EntityUtils.toString(entity, "utf-8");
		response.close(); 
		httpClient.close();
		
		Document document = Jsoup.parse(content);
		
//		//��ȡ��ǩtitle�е�����
//		//<title>����԰ - �����ߵ����ϼ�԰</title>
//		Elements elements = document.getElementsByTag("title");
//		Element element = elements.get(0);
//		String title = element.text();
//		System.out.println(title);
		
//		//����id��ȡ�ı�����
//		//<div id="site_nav_top">����ı�����</div>
//		Element element2 = document.getElementById("site_nav_top");
//		String navTop = element2.text();
//		System.out.println(navTop);

//		//����img��ǩ��ȡ����src�е�����
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
		
		//����class��ʽ��ȡ����
//		Elements elements = document.getElementsByClass("post_item");
//		for(Element element : elements){
//			System.out.println(element.toString());
//			//System.out.println(element.html());
//			System.out.println("----------------------");
//		}
		
		//ʹ��ѡ����
//		Elements elements = document.select(".post_item .post_item_body h3 a");
//		for(Element element:elements){
//			System.out.println("���⣺"+element.text());
//			System.out.println(element.toString());
//			String href = element.attr("href");
//			System.out.println("���ӣ�"+href);
//			System.out.println("-----------------------");
//		}
		
//		//���ݱ�ǩ����
//		Elements elements = document.select(".post_item .post_item_body h3 a[href]");
//		for(Element element:elements){
//			System.out.println("���⣺"+element.text());
//			System.out.println("���ӣ�"+element.attr("href"));
//			System.out.println("-----------------------");
//		}
		
		//$��ʲô��β
//		Elements elements = document.select("img[src$=.png]");
//		for(Element element : elements){
//			System.out.println(element.toString());
//		}
		
		//��ȡ��һ���ڵ�
//		Element element = document.getElementsByTag("title").first();
//		System.out.println(element.toString());
//		System.out.println(element.text());
		
		//��ȡ���һ���ڵ�
//		Element element = document.getElementsByTag("title").last();
//		System.out.println(element.toString());
//		System.out.println(element.text());
		
		//ʹ��ѡ������id��ȡ
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
