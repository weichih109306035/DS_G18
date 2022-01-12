package google;

import java.util.ArrayList;

public class Rank {
	private ArrayList<WebTree> webs;
	public Rank(ArrayList<WebTree> webs) {
		this.webs=webs;
	}
	public void quickSort(int leftbound,int rightbound) {
		if(rightbound<=leftbound) return;
		for(int i=leftbound;i<rightbound;i++) {
			if(webs.get(rightbound).score>webs.get(i).score) {
				WebTree t=webs.get(rightbound);
				webs.set(rightbound, webs.get(i));
				webs.set(i, t);
			}
		}
		quickSort(leftbound,rightbound-1);
	}
	public  ArrayList<WebTree> getRank(){
		this.quickSort(0,webs.size()-1);
		return webs;
	}
}