package reRun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedCases implements IRetryAnalyzer{
	
	private int retrycount = 0;
	private final int maxRetry = 3;
	@Override
	public boolean retry(ITestResult result) {
		if(retrycount < maxRetry) {
			retrycount++;
			return true;
		}
		return false;
	}

}
