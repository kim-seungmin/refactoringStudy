public class ex2 {
	public void processUserRequest() throws InvalidInputException {
		boolean flag;
	  
		// hostname 얻기
	 	String hostname=null;
	  	flag = true;
	  	for(int i=0; flag && i < 3; i++){
	    	showPrompt("Host");
	    	hostname = getString();
	    	if (hostname != null) {
		        flag = false;
	    	}
	    }
		if(flag){
	    	throw new InvalidInputException();
	    }
	  
		postRequest(hostname, username);
	}
}
