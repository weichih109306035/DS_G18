
package google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ConstructTree {
	private String urlStr;
    private String content;
    private WebNode root;
    public ConstructTree(String urlStr,WebNode root){
    	this.urlStr = urlStr;
    	this.root=root;
    }
    private String fetchContent() throws IOException{
		URL url = new URL(this.urlStr);
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
	
		String retVal = "";
	
		String line = null;
		while ((line = br.readLine()) != null)
		{
		    retVal = retVal + line + "\n";
		}
	
		return retVal;
    }
    
    public void constructTree(){	
		try {
	    	if(content==null){
			    content = fetchContent();
			}
			while(content.indexOf("<a href=\"http")!=-1) {
				content=content.substring(content.indexOf("<a href=\"http"));
				String tag=content.substring(content.indexOf("<a href=\"http"));
				tag=tag.substring(0,tag.indexOf(">")+1);
				tag=tag.substring(tag.indexOf("\"")+1);
				String link=tag.substring(0,tag.indexOf("\""));
				System.out.println(link);
				String name=" ";
				root.addChild(new WebNode(new WebPage(link,name)));
				content=content.substring(content.indexOf(">")+1);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
    }
}