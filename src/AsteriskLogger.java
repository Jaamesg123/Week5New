public class AsteriskLogger implements Logger {

	
	
	@Override
	public void log(String log) {
		 System.out.println("*** " + log.toString() + " ***");
		
		
	}
	
	@Override
	public void error(String error) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 15 + error.length(); i++) {
			sb.append("*");
		}
		 	System.out.println(sb.toString() +
		 						"\n" + "*** Error: " + error.toString() + " ***" +
		 						"\n" + sb.toString());
		}
		
	}

