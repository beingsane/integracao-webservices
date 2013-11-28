package br.com.ecodetech.integracao.xml.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.ecodetech.integracao.model.bean.Categoria;
import br.com.ecodetech.integracao.model.bean.Cliente;
import br.com.ecodetech.integracao.model.bean.Produto;
import br.com.ecodetech.integracao.xml.XMLWriter;

public class XMLWriterTest {

	private XMLWriter writer = new XMLWriter();

	@Test
	public void testConvertListaClientesToXML() {
		System.out.println("=================== CLIENTES ===================");
		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(new Cliente("maria", "maria@gmail.com"));
		lista.add(new Cliente("joana", "joana@gmail.com"));
		String xml = writer.convertListaClientesToXML(lista);
		assertTrue(xml.contains("maria"));
		assertTrue(xml.contains("joana"));
		assertFalse(xml.contains("paulo"));
		System.out.println(xml);
	}

	@Test
	public void testConvertListaProdutosToXML() {
		System.out.println("=================== PRODUTOS ===================");
		List<Produto> lista = new ArrayList<Produto>();
		lista.add(new Produto("bola", "futebol de campo", 50.43, 10.0,
				new Categoria("Esportes")));
		lista.add(new Produto("camisa", "manga loga", 65.78, 30.0,
				new Categoria("Moda masculina")));
		String xml = writer.convertListaProdutosToXML(lista);
		assertTrue(xml.contains("bola"));
		assertTrue(xml.contains("camisa"));
		assertFalse(xml.contains("calca"));
		
		System.out.println(xml);
	}

}
