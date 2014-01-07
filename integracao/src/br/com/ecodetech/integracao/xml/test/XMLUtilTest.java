package br.com.ecodetech.integracao.xml.test;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.ecodetech.integracao.model.bean.NFE;
import br.com.ecodetech.integracao.xml.XMLUtil;

public class XMLUtilTest {
	
	private static final String PATH = "/home/marciopalheta/notasfiscais/";

	@Test
	public void testFileToString() {
		String texto = XMLUtil.fileToString(PATH+"13131099171171101338550500000000031910730003-procNfe.xml");
		//System.out.println(texto);
		Assert.assertNotEquals(texto.length(), 0);
	}
	@Test
	public void testFileToNFE(){
		NFE nota = XMLUtil.fileToNFE(PATH+"13131099171171101338550500000000041910730000-procNfe.xml");
		Assert.assertEquals("NFe13131099171171101338550500000000041910730000", nota.getId());
		Assert.assertEquals("13", nota.getcUF().toString()); 
		Assert.assertEquals("91073000", nota.getcNF().toString()); 
		Assert.assertEquals("VENDA", nota.getNatOp()); 
		Assert.assertEquals("0", nota.getIndPag().toString()); 
		Assert.assertEquals("55", nota.getMod()); 
		Assert.assertEquals(50, nota.getSerie().intValue()); 
		Assert.assertEquals(4, nota.getnNF().intValue()); 
		Assert.assertEquals(2013, nota.getdEmi().get(Calendar.YEAR));
		Assert.assertEquals(9, nota.getdEmi().get(Calendar.MONTH));
		Assert.assertEquals(31, nota.getdEmi().get(Calendar.DAY_OF_MONTH));
		
		Assert.assertEquals(1, nota.getTpNF().intValue());
		Assert.assertEquals(1302603, nota.getcMunFG().longValue());
		Assert.assertEquals(1, nota.getTpEmis().intValue());
		Assert.assertEquals(0, nota.getcDV().intValue());
		Assert.assertEquals(2, nota.getTpAmb().intValue());
		Assert.assertEquals(1, nota.getFinNFe().intValue());
		Assert.assertEquals(3, nota.getProcEmi().intValue());
		Assert.assertEquals("2.2.19", nota.getVerProc());
		
		// ============= EMITENTE =============
		Assert.assertEquals("99171171101338", nota.getEmiCNPJ());
		Assert.assertEquals("Empresa Teste", nota.getEmiNome());
		Assert.assertEquals("Rua Andre Araujo", nota.getEmiEndLgr());
		Assert.assertEquals("150", nota.getEmiEndNum());
		Assert.assertEquals("Aleixo", nota.getEmiEndBairro());
		Assert.assertEquals("1302603", nota.getEmiEndCodMun().toString());
		Assert.assertEquals("Manaus", nota.getEmiEndMunicipio());
		Assert.assertEquals("AM", nota.getEmiEndUF());
		Assert.assertEquals("69060000", nota.getEmiEndCEP().toString());
		Assert.assertEquals("1058", nota.getEmiEndCodPais().toString());
		Assert.assertEquals("BRASIL", nota.getEmiEndPais());
		Assert.assertEquals("997777770", nota.getEmiIE());
		Assert.assertEquals("8459806", nota.getEmiIM());
		Assert.assertEquals(4321500, nota.getEmiCNAE().longValue());
		Assert.assertEquals(3, nota.getEmiCRT().longValue());
		
		// ============= DESTINATARIO =============
		Assert.assertEquals("19327307615", nota.getDestCPF());
		Assert.assertEquals("NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL", nota.getDestNome());
		Assert.assertEquals("RUA ANDRE ARAUJO", nota.getDestEndLgr());
		Assert.assertEquals("140", nota.getDestEndNum());
		Assert.assertEquals("ALEIXO", nota.getDestEndBairro());
		Assert.assertEquals(1302603, nota.getDestEndCodMun().longValue());
		Assert.assertEquals("Manaus", nota.getDestEndMunicipio());
		Assert.assertEquals("AM", nota.getDestEndUF());
		Assert.assertEquals("69060000", nota.getDestEndCEP());
		Assert.assertEquals(1058, nota.getDestEndCodPais().intValue());
		Assert.assertEquals("BRASIL", nota.getDestEndPais());
		
		// ============= ITENS =============
		Assert.assertEquals(2, nota.getListaItens().size());
		
		
		// ============= TOTAIS =============
		Assert.assertEquals(500d, nota.getIssqnServ().doubleValue(),0000000.5);
		Assert.assertEquals(500d, nota.getIssqnBC().doubleValue(),0000000.5);
		Assert.assertEquals(25d, nota.getIssqnISS().doubleValue(),0000000.5);
	}

}
