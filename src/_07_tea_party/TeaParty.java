package _07_tea_party;


	
	
	
public class TeaParty {
       public String welcome(String name, boolean isWoman, boolean isKnighted) {
    	if(isWoman==true && isKnighted==false) {
    		return "Hello Ms. " + name;
    		
    	}
    	if(isWoman==true && isKnighted==true) {
    		return "Hello Lady " + name;
    		
    	}   
    	if(isWoman==false && isKnighted==true) {
    		return "Hello Sir " + name;
    		
    	}     
    	if(isWoman==false && isKnighted==false) {
    		return "Hello Mr. " + name;
    		
    	}     
    	   
    	   
    	   
    	   
    	   return "hi";
        }
       public static void main(String[] args) {
			
			
			
			
			
			
			
		}
	
}
	
