package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\OnlinePrjJuly\\Ebanking\\src\\feature\\Login.feature",
                   glue="stepdefination",monochrome=true)
public class Loginrunner 
{
	
}
