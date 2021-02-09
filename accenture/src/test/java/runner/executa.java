package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)   //excutar classe pelo junit
@CucumberOptions(
		
		
		//caminho das features
		
		features = "src/test/resources",
		
		//caminho dos steps
		
		glue = "tests",
		
		//tags de execu��o do projeto
		tags = "@alltest",
		
		// pretty deixar a execu��o no console igual cucumber | htm gerar report
		
		plugin = {"pretty", "html:target/report.html"},
		
		//para n�o executar o teste, padr�o deve ser false
		
		dryRun = false,
		
		// para n�o aparecer caracteres especiais no console apos execu��o
		monochrome = true
				
		)

public class executa {

}
