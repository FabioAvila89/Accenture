package tests;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.elemento;
import pages.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	elemento elemento = new elemento();
	
	@Given("^que eu esteja no \"([^\"]*)\"$")
	public void que_eu_esteja_no(String url) throws Throwable {
		
		metodos.abrirBrowser(url, "CHROME");
	    
	}

	@When("^quando preencho os formularios das abas e pressiono next$")
	public void quando_preencho_os_formularios_das_abas_e_pressiono_next() throws Throwable {
		
		// ABA Enter Vehicle Data
		metodos.selecionarCombo(elemento.getMake(), "Audi");
		metodos.selecionarCombo(elemento.getModel(), "Scooter");
		metodos.escrever(elemento.getCylinderCapacity(), "1200");
		metodos.escrever(elemento.getEnginePerformance(), "12");
		metodos.escrever(elemento.getDateofManufacture(), "01/01/2021");
		metodos.selecionarCombo(elemento.getNumberOfSeats(), "2");
		metodos.selecionarCombo(elemento.getFuelType(), "Electric Power");
		metodos.clicar(elemento.getRightHandDrive());
		metodos.selecionarCombo(elemento.getNumberOfSeats2(), "2");
		metodos.escrever(elemento.getPayload(), "345");
		metodos.escrever(elemento.getTotalWeight(), "567");
		metodos.escrever(elemento.getListPrice(), "3234");
		metodos.escrever(elemento.getLicensePlateNumber(), "4567");
		metodos.escrever(elemento.getAnnualMileage(), "2341");
		metodos.clicar(elemento.getNext());
		
		// Enter Insurant Data
		
		metodos.escrever(elemento.getFirstName(), "Jose");
		metodos.escrever(elemento.getLastName(), "silva");
		metodos.escrever(elemento.getDateOfBirth(), "12/02/1999");
		metodos.clicar(elemento.getGender());
		metodos.escrever(elemento.getStreetAddress(), "Avenida Paulista");
		metodos.selecionarCombo(elemento.getCountry(), "Brazil");
		metodos.escrever(elemento.getZipCode(), "06411000");
		metodos.escrever(elemento.getCity(), "São Paulo");
		metodos.selecionarCombo(elemento.getOccupation(), "Employee");
		metodos.pausa(2000);
		metodos.clicar(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]"));
		metodos.escrever(elemento.getWebsite(), "www.teste.com");
		metodos.escrever(elemento.getPicture(), "teste");
		metodos.clicar(elemento.getNextEnterProductData());
		
		//ABA Enter Product Data
		
		metodos.escrever(elemento.getStartDate(), "08/02/2021");
		metodos.selecionarCombo(elemento.getInsuranceSum(), "3000000");
		metodos.selecionarCombo(elemento.getMeritRating(), "Bonus 1");
		metodos.selecionarCombo(elemento.getDamageInsurance(), "No Coverage");
		metodos.clicar(elemento.getOptionalProducts());
		metodos.selecionarCombo(elemento.getCourtesyCar(), "No");
		metodos.clicar(elemento.getNextSelectPriceoption());
		
		//ABA Select Price Option
		
		metodos.clicar(elemento.getSilver());
		metodos.pausa(5000);
	    metodos.clicar(elemento.getNextaba4());
		
		
		//ABA Send Quote
		metodos.escrever(elemento.getEmail(), "teste@teste.com");
		metodos.escrever(elemento.getPhone(), "11999999999");
		metodos.escrever(elemento.getUsername(),"Jose");
		metodos.escrever(elemento.getPassword(), "Jose123");
		metodos.escrever(elemento.getConfirmPassword(), "Jose123");
	    metodos.escrever(elemento.getComments(), "teste teste teste");
	    metodos.clicar(elemento.getSend());
	    metodos.pausa(10000);
	    
	}

	@Then("^valido a mensagem \"([^\"]*)\"$")
	public void valido_a_mensagem(String textoEsperado) throws Throwable {
		
		metodos.validarTexto("Sending e-mail success!", elemento.getValidacao());
	    metodos.fechar();
	}
	
}
