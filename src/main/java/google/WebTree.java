package google;



import java.io.IOException;
import java.util.ArrayList;


public class WebTree {
	public WebNode root;
	public double score;
	public ConstructTree conTree;
	public WebTree(WebPage rootPage) throws IOException{
		this.root = new WebNode(rootPage);
		conTree=new ConstructTree(rootPage.url,root);
		conTree.constructTree();
	}
	
	public void setPostOrderScore(ArrayList<Keyword> keywords) throws IOException{
		setPostOrderScore(root, keywords);
	}
	
	private void setPostOrderScore(WebNode startNode, ArrayList<Keyword> keywords) throws IOException{
		for(WebNode child : startNode.children){
			child.setNodeScore(keywords);
		}
		startNode.setNodeScore(keywords);
		this.score=startNode.nodeScore;
	}
	
	private String repeat(String str,int repeat){
		String retVal  = "";
		for(int i=0;i<repeat;i++){
			retVal+=str;
		}
		return retVal;
	}
	
	
	public void eularPrintTree(){
		eularPrintTree(root);
	}
	
	private void eularPrintTree(WebNode startNode){
		int nodeDepth = startNode.getDepth();
		
		if(nodeDepth > 1) System.out.print("\n" + repeat("\t", nodeDepth-1));
		//print "("
		System.out.print("(");
		//print "name","score"
		System.out.print(startNode.webPage.name+","+startNode.nodeScore);
		
		//2.print child preorder
		for(WebNode child : startNode.children){
			if(child.children!=null) {
				eularPrintTree(child);
			}
		}
		
		//print ")"
		System.out.print(")");
		
		/*for example
		(Soslab,459.0
				(Publication,286.2)
				(Projects,42.0
						(Stranger,0.0)
				)
				(MEMBER,12.0)
				(Course,5.3999999999999995)
		)*/
		if(startNode.isTheLastChild()) System.out.print("\n" + repeat("\t", nodeDepth-2));	
	}
}