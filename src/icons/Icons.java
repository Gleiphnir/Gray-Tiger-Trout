package icons;

public class Icons {

	private final int actionValue;
	private final String name;
	
	Icons(String name, int aV){
		this.actionValue = aV;
		this.name = name;
	}
	
	public int getActionValue(){
		return this.actionValue;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		return name+" "+actionValue;
		
	}
	
}
