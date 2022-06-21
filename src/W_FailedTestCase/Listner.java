package W_FailedTestCase;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner extends Base implements ITestListener 
{
	
	public void onTestFailure(ITestResult result){
		
		failedscreenshot();
		
	}

}
