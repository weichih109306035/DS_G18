package google;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;
public class Result {
	public String url;
	public String result;
	public Result(){
		this.url=url;
		this.result=result;
	}
	public String getSearchurl() {
		return this.url;
	}
	public void setSearchUrl(String url) {
		this.url = url;
	}
	public String showResult() throws FileNotFoundException, UnsupportedEncodingException{
		//KeywordList kLst = new KeywordList();
		//File file = new File("Keyword.txt");
		//Scanner sc = new Scanner(file);
		KeywordList klst = new KeywordList();
		
		/*while(sc.hasNext()){
		    String cmd = sc.next();
		    switch(cmd){
	        	case "add":{
	        		String name = sc.next();
	        		float weight = sc.nextFloat();
	        		Keyword k = new Keyword(name, weight);
	        		kLst.add(k);
	        	}
        	    default:
        	    	System.out.println("InvalidOperation0");       	    	      
		    }
		}
		sc.close();*/
		Keyword k = new Keyword("NCCU", 10.2);
		klst.add(k);
		Keyword k1=new Keyword("錄取分數",4.8);
		klst.add(k1);
		Keyword k2=new Keyword("個人申請",4.0);
		klst.add(k2);
		Keyword k3=new Keyword("指考",4.0);
		klst.add(k3);
		Keyword k4=new Keyword("面試",4.0);
		klst.add(k4);
		Keyword k5=new Keyword("繁星",4.0);
		klst.add(k5);
		Keyword k6=new Keyword("自然組",3.0);
		klst.add(k6);
		Keyword k7=new Keyword("社會組",3.0);
		klst.add(k7);
		Keyword k8=new Keyword("心得",3.9);
		klst.add(k8);
		Keyword k9=new Keyword("經驗",3.9);
		klst.add(k9);
		Keyword k10=new Keyword("薪水",3.0);
		klst.add(k10);
		Keyword k11=new Keyword("定位",2.0);
		klst.add(k11);
		Keyword k12=new Keyword("必修",2.5);
		klst.add(k12);
		Keyword k13=new Keyword("選修",2.5);
		klst.add(k13);
		Keyword k14=new Keyword("Java",1.5);
		klst.add(k14);
		Keyword k15=new Keyword("程式語言",1.5);
		klst.add(k15);
		Keyword k16=new Keyword("程式設計",1.5);
		klst.add(k16);
		Keyword k17=new Keyword("計算機概論",1.5);
		klst.add(k17);
		Keyword k18=new Keyword("會計",1.5);
		klst.add(k18);
		Keyword k19=new Keyword("學士班",5.0);
		klst.add(k19);
		Keyword k20=new Keyword("商學院",3.5);
		klst.add(k20);
		Keyword k21=new Keyword("政大",3.5);
		klst.add(k21);
		Keyword k22=new Keyword("大學生活",1.5);
		klst.add(k22);
		try {
			SultWeb test=new SultWeb(url);
			ArrayList<WebTree> webs=test.getTrees();
			for(int i=0;i<webs.size();i++) {
				webs.get(i).setPostOrderScore(klst.getList());
				webs.get(i).eularPrintTree();
			}
			Rank rank=new Rank(test.getTrees());
			webs=rank.getRank();
			/*for(int i=0;i<webs.size();i++) {
				webs.get(i).setPostOrderScore(kLst.getList());
				webs.get(i).eularPrintTree();
			}*/
			//String result="";
			result="";
			for(int i=0;i<webs.size();i++) {
				result+=webs.get(i).root.webPage.name;
				result+=" 的url是 :\n";
				result+=webs.get(i).root.webPage.url;
				result+="\nScore=";
				result+=webs.get(i).score;
				result+="\n";
			}
			//System.out.println(result);
			return result;
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return " ";
	}
	
}