package google;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		File file = new File("Keyword.txt");
		Scanner sc = new Scanner(file);
		KeywordList kLst = new KeywordList();
		
		while(sc.hasNext()){
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
		sc.close();
		try {
			SultWeb test=new SultWeb("{Disclosing the Misinformation in an Academic Journal Authored by ...=/url?q=https://www.researchgate.net/publication/331233721_Disclosing_the_Misinformation_in_an_Academic_Journal_Authored_by_Two_Taiwanese_MIS_Scholars_jieluerweitaiwanzixunguanlixuezhezaixueshuqikanfabiaodecuowuzixun&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAUQAg&usg=AOvVaw2dnN-aR1zIp6OqajHAEvMx, Alumni of MIS, NCCU 政大資管系系友 - Facebook=/url?q=https://www.facebook.com/groups/alumni.mis.nccu/permalink/10156327190342637/&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECBEQAg&usg=AOvVaw319H58V-K4BHXXh9fFNRnx, Nccu Mis 94th 謝師宴開場mp3 download (1.81 MB) - Looods ...=/url?q=http://syncengine.aspermont.com/nccu-mis-94th-%25E8%25AC%259D%25E5%25B8%25AB%25E5%25AE%25B4%25E9%2596%258B%25E5%25A0%25B4.xhtml&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAYQAg&usg=AOvVaw2PzDK0NK4yhLQqL1_aeifO, Masters of Information Science Degree Program Overview=/url?q=https://nccuslis.org/mis-curriculum/&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAwQAg&usg=AOvVaw04KsWiyNy3fmp9GH5T1urA, 中華民國緬甸歸僑協會-服務特區-台灣大專院校-=/url?q=http://mroca.ezsino.org/index.php%3Fmod%3Dservice%26app%3Dschool%26action%3Dshow%26id%3D7&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAoQAg&usg=AOvVaw2XlEQL8tDL88rnbaxyVvhn, 政治大學資訊管理學系Yu-Lun Hsieh 謝宇倫 - IOH 開放個人經驗平台=/url?q=https://ioh.tw/talks/%25E6%2594%25BF%25E6%25B2%25BB%25E5%25A4%25A7%25E5%25AD%25B8%25E8%25B3%2587%25E8%25A8%258A%25E7%25AE%25A1%25E7%2590%2586%25E5%25AD%25B8%25E7%25B3%25BB-%25E8%25AC%259D%25E5%25AE%2587%25E5%2580%25AB-yu-lun-hsieh-tw-study-nccu-bde&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECBQQAg&usg=AOvVaw3xmxBNGex3ucbONRLQT64C, Nccu Mis - Chandlerxalhec=/url?q=https://chandlerxalhec.blogspot.com/2021/12/nccu-mis.html&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAkQAg&usg=AOvVaw3vol5LwP4D5Lrv4GM5fD_a, Professor Lee, Siao-Huei (NCCU MIS)=/url?q=http://www.ie.nthu.edu.tw/p/406-1310-188652,r2715.php%3FLang%3Den&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAMQAg&usg=AOvVaw2CAYTKWG569_cT3hzL_O9v, 國立政治大學資訊管理學系暨研究所介紹=/url?q=https://university.1111.com.tw/company.asp%3Fsid%3D86%26pgtp%3D4%26codeNo%3D1000010512&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECBUQAg&usg=AOvVaw00cemw7KvWSg_-CGsuf4-X, 國立政治大學「資管評論MIS Review」徵稿 - 研究發展處=/url?q=http://www.rdo.fju.edu.tw/node/16135&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECA8QAg&usg=AOvVaw0dQPDP2PXwpUdBZ0MjeYvI, WJWang/nccu-mis-web - GitHub=/url?q=https://github.com/WJWang/nccu-mis-web&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAQQAg&usg=AOvVaw39M28Waqp-V0v3j6BTY7CY, Information Science, MIS | North Carolina Central University=/url?q=https://www.nccu.edu/academics/graduate-programs/information-science-mis&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECBMQAg&usg=AOvVaw2mXB0T44LpWbmI3cmPIVT2, 國立政治大學資訊管理學系111年個人申請 - University TW=/url?q=https://university-tw.ldkrsi.men/caac/006/006212&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAAQAg&usg=AOvVaw3L9cy6O6z7T2kG2QXdz5tj, 國立政治大學會計學系=/url?q=https://acct.nccu.edu.tw/&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECBYQAg&usg=AOvVaw2wKY9EsQrmXi-1gCsHRBgN, 政大資管「第八屆臺灣資訊管理夏季研討會(TSWIM 2020)」論文徵稿=/url?q=https://mis.pccu.edu.tw/files/16-1227-81768.php%3FLang%3Dzh-tw&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECA4QAg&usg=AOvVaw2DPTdZsciFdoYx9-sUy13N, 國立政治大學資訊管理學系- 首頁 - Facebook=/url?q=https://zh-tw.facebook.com/pages/category/College---University/%25E5%259C%258B%25E7%25AB%258B%25E6%2594%25BF%25E6%25B2%25BB%25E5%25A4%25A7%25E5%25AD%25B8%25E8%25B3%2587%25E8%25A8%258A%25E7%25AE%25A1%25E7%2590%2586%25E5%25AD%25B8%25E7%25B3%25BB-1053169871379031/&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECBIQAg&usg=AOvVaw2mpvsduwNSCyr8u_NNGEWZ, 轉寄 - 博碩士論文行動網=/url?q=https://ndltd.ncl.edu.tw/cgi-bin/gs32/gsweb.cgi/login%3Fo%3Ddnclcdr%26s%3Did%3D%2522091NCCU5396043%2522.%26searchmode%3Dbasic&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAgQAg&usg=AOvVaw12hkxdip0MELZpue3qhYxM, 曾志中- 國立政治大學- 台灣臺北市台北 - LinkedIn=/url?q=https://tw.linkedin.com/in/chih-chung-tseng&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECA0QAg&usg=AOvVaw3cD3nP3wWKmvHcMDk2Ab5V, 政大資管 - 政治大學=/url?q=https://mis2.nccu.edu.tw/&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAIQAg&usg=AOvVaw0PXAtlVjs_EKAhwKtEwKi9, 國立政治大學資訊管理學系 - ColleGo!=/url?q=https://collego.edu.tw/Highschool/DepartmentIntro%3Fdept_id%3D006026&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAcQAg&usg=AOvVaw3A2jwmRXR6iUdg551qvI4z, 政大資管系=/url?q=http://mueller-kfz-gutachten.de/121797.html&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECAEQAg&usg=AOvVaw3PapOL26z95OIUnDdfsRCA, 2021政大資管週 - Instagram=/url?q=https://www.instagram.com/nccu.mis.week/&sa=U&ved=2ahUKEwiFjqDQ0pz1AhUJlFYBHU2NCCkQFnoECBAQAg&usg=AOvVaw0iZZf6Y9RVqxtrLDRJOldE}");
			ArrayList<WebTree> webs=test.getTrees();
			Rank rank=new Rank(test.getTrees());
			webs=rank.getRank();
			for(int i=0;i<webs.size();i++) {
				webs.get(i).setPostOrderScore(kLst.getList());
				webs.get(i).eularPrintTree();
			}
			System.out.println("end");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
