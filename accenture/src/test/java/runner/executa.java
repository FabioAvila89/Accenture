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
		
		//tags de execução do projeto
		tags = "@alltest",
		
		// pretty deixar a execução no console igual cucumber | htm gerar report
		
		plugin = {"pretty", "html:target/report.html"},
		
		//para não executar o teste, padrão deve ser false
		
		dryRun = false,
		
		// para não aparecer caracteres especiais no console apos execução
		monochrome = true
				
		)

public class executa {

}
