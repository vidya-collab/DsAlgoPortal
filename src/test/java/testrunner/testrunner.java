package testrunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


		@CucumberOptions(
				plugin = {"pretty", "html:target/dsAlgoReport.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, //reporting purpose
				monochrome=false, 
				tags ="@Login1", 
				features = {"src/test/resources/features"}, 
				glue= {"stepdefinitions","hooks"})
		

		public class testrunner extends AbstractTestNGCucumberTests {
			
//			@Override
		    @DataProvider(parallel =true)
		    public Object[][]  scenarios() {
						
				return super.scenarios();
				
		    }
		}


	