#Author: fabioavilamacedo@gmail.com


Feature: preencher formul�rio Tricentis
  Eu como usuario quero preencher os formularios e validar mensagem Sending e-mail success

  @preencherFormulario
  Scenario: preencher formulario
    Given que eu esteja no "http://sampleapp.tricentis.com/101/app.php"
    
    When quando preencho os formularios das abas e pressiono next	    
    
    
    Then valido a mensagem "Sending e-mail success!"
    

 
  
