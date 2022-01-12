package google;

import java.io.IOException;
import java.util.ArrayList;

public class SultWeb {
	private ArrayList<WebTree> webs;
	private String result;
	public SultWeb(String searchResult) throws IOException {
		this.webs=new ArrayList<WebTree>();
		this.result=searchResult;
		this.sult();
	}
	public void sult() throws IOException {
		String name=result.substring(1, result.indexOf("="));
		result=result.substring(result.indexOf("=")+8);
		String url=result.substring(0,result.indexOf(","));
		result=result.substring(result.indexOf(",")+2);
		WebPage web=new WebPage(url,name);
		WebTree tree=new WebTree(web);
		webs.add(tree);
		while(result.contains("url?q=")) {
			name=result.substring(0, result.indexOf("="));
			result=result.substring(result.indexOf("=")+8);
			if(result.contains(",")) {
				url=result.substring(0,result.indexOf(","));
				result=result.substring(result.indexOf(",")+2);
			}else {
				url=result.substring(0,result.indexOf("}"));
			}
			WebPage web2=new WebPage(url,name);
			tree=new WebTree(web2);
			webs.add(tree);
		}
	}
	public ArrayList<WebTree> getTrees(){
		return this.webs;
	}
}