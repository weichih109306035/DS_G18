package google;
import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStream;

import java.io.InputStreamReader;

import java.net.URL;

import java.net.URLConnection;

import java.util.HashMap;



import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;

import org.jsoup.select.Elements;



public class GoogleQuery2 

{

	public String searchKeyword;

	public String url;

	public String content;
	public int i;
	String s1;
	public GoogleQuery2() {
		//getSearchKeyword();
		//setSearchKeyword("nccu");
		this.searchKeyword=searchKeyword;

		//this.url = "http://www.google.com/search?q="+searchKeyword+"&oe=utf8&num=25";
		this.url=url;
		this.i=1;
	}

	/*public GoogleQuery2(String searchKeyword)

	{

		this.searchKeyword = searchKeyword;

		this.url = "http://www.google.com/search?q="+searchKeyword+"&oe=utf8&num=15";
		this.i=1;
		this.s1=s1;

	}*/
	public String getSearchKeyword() {
		return this.searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}

	

	private String fetchContent() throws IOException

	{
		String retVal = "";
		url="http://www.google.com/search?q="+searchKeyword+"&oe=utf8&num=10";

		URL u = new URL(url);

		URLConnection conn = u.openConnection();

		conn.setRequestProperty("User-agent", "Chrome/7.0.517.44");

		InputStream in = conn.getInputStream();

		InputStreamReader inReader = new InputStreamReader(in,"utf-8");

		BufferedReader bufReader = new BufferedReader(inReader);
		String line = null;

		while((line=bufReader.readLine())!=null)
		{
			retVal += line;

		}
		
		return retVal;
	}
	public HashMap<String, String> query() throws IOException

	{

		//if(content==null)

		//{
			//System.out.println("nnnnnnnnnull");

			content= fetchContent();

		//}

		HashMap<String, String> retVal = new HashMap<String, String>();
		
		Document doc = Jsoup.parse(content);
//		System.out.println(doc.text());
		Elements lis = doc.select("div");
//		 System.out.println(lis);
		lis = lis.select(".kCrYT");
//		 System.out.println(lis.size());
		
		
		for(Element li : lis)
		{
			try 

			{
				String citeUrl = li.select("a").get(0).attr("href");
				String title = li.select("a").get(0).select(".vvjwJb").text();
				if(title.equals("")) {
					continue;
				}
				System.out.println("第"+i+"筆: "+title + ","+citeUrl);
				retVal.put(title, citeUrl);
				i++;

			} catch (IndexOutOfBoundsException e) {

//				e.printStackTrace();

			}

			

		}

		

		return retVal;

	}
}