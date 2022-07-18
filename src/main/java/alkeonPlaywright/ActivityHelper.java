package alkeonPlaywright;

import java.util.Random;

public class ActivityHelper {

	public String getRandomActivity() {
		

	        String a[] = new String[11];
	        
	        a[0] = "Other";
	        a[1] = "CEO";
	        a[2] = "Fashion Designer";
	        a[3] = "Head Buyer";
	        a[4] = "Junior Buyer";
	        a[5] = "Assistant Buyer";
	        a[6] = "Account Manager";
	        a[7] = "Market Manager";
	        a[8] = "Buying Office Coordinator";
	        a[8] = "Retail project manager";
	    	a[9] = "Retail Director";
	    	a[10] = "Store Owner";
	    	
	        
	        int rnd = new Random().nextInt(a.length);
		    return a[rnd];
		    
			}

}
