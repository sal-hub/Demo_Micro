package com.nexttechitc.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestrunnerTestNG {

//@RunWith (Cumber
	@CucumberOptions (

			features = {"Features"},
			glue = {"com.nexttechitc.Stepdef"})
			//tags= {"@sc2","@sc1"}
			
		public class TestRunner extends AbstractTestNGCucumberTests{}

}
