package model.teste.arquivo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import model.arquivos.Arquivo;
import model.entities.Carteira;
import model.entities.RendaFixa;

public class TestArquivo 
{
	private Carteira carteira;
	private RendaFixa rendaFixa;
	private File jsonFile;
	private File csvFile;
	
	@Before
	public void beforeTeste()
	{
		carteira = new Carteira("Rico Investimentos");
		rendaFixa = new RendaFixa("Tesouro 25", new Date(), 78.0, 15, "22/05/20", 5.8);
		jsonFile = new File("investimentos.json");
		csvFile = new File("investimentos.csv");
	}
	
	@Test
	public void testeExisteArquivoJson()
	{
		boolean existe = jsonFile.exists();
		
		assertTrue(existe);
	}
	
	@Test
	public void testeExisteArquivoCSV()
	{
		boolean existe = csvFile.exists();
		
		assertTrue(existe);
	}
	
	@Test
	public void testeGerouArquivoJson()
	{

		carteira.getInvestimentos().add(rendaFixa);
		Arquivo.gerarJson(carteira.getInvestimentos());
		
		assertNotNull(Arquivo.getFileWriter());
				
	}
	
	@Test
	public void testeGerouArquivoCSV()
	{

		carteira.getInvestimentos().add(rendaFixa);
		Arquivo.gerarCsv(carteira.getInvestimentos());
		
		assertNotNull(Arquivo.getFile());
		
		
	}
}
