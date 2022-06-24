package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"html:target\\default-cucumber_reports.html",
				"json:target/cucumber.json",
				"junit:target\\xml-report/cucumber.xml"},
		features= {"src\\test\\resources\\features\\login.feature"},
		glue = {"steps"}
		//dryRun = false
		//tags = "@fin"
		)

public class TestRunner {

}
