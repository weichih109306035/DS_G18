package google;

import java.io.UnsupportedEncodingException;

public class Keyword {
	public String name;
	public double weight;
	
	public Keyword(String name,double weight) throws UnsupportedEncodingException{
		this.name =new String (name.getBytes("utf-8"),"utf-8");
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		return "["+name+","+weight+"]";
	}
	public String getName(){
	    return name;
	}
	public double getWeight(){
	    return weight;
	}
}