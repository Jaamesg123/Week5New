

public class SpacedLogger implements Logger {

	
	
	@Override
	public void log(String log) {
		
		String input = log.toString();
		StringBuilder sb = new StringBuilder();
		
		for (char c : input.toCharArray()) {
			sb.append(c).append(" ");
		}
			
			
		System.out.println(sb.toString());
		
		
	}

	@Override
	public void error(String error) {
		
		String input = error.toString();
		StringBuilder sb = new StringBuilder();
		
		for (char c : input.toCharArray()) {
			sb.append(c).append(" ");
		
	}
	
		System.out.println("ERROR: " + sb.toString());
	}

}
