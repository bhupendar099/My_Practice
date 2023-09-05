package Apna_college1;

public class OOps { 
	public static void main(String args[]) {
		Pen p=new Pen();
           p.setColour("blue");
           System.out.println(p.getColour());
           p.setTip(6);
          System.out.println(p.getTip());
	}

} 
    class Pen {
    	
	   private String colour;
	   private int tip;
	  
	  public String getColour() {
		  return this.colour;
	  }
	  public int getTip() {
		  return tip;
	  }
	  
	  public void setColour(String newcolour) {
		  colour= "blue";
	  }
	  public void setTip(int newTip) {
		  tip=newTip;
	  }
	 
	  
  }
