package br.com.ecodetech.integracao.xml;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.com.ecodetech.integracao.model.bean.NFE;
import br.com.ecodetech.integracao.model.bean.NFEItem;

public class XMLUtil {

	/**
	 * Metodo que recebe caminho e nome de um arquivo XML e devolve um String
	 * com seu conteudo
	 * 
	 * @param nomeArquivo
	 * @return String com o conteudo do arquivo
	 */
	public static String fileToString(String nomeArquivo) {
		InputStream input;
		InputStreamReader reader;
		BufferedReader buffer;
		String texto = "", linha;
		try {
			input = new FileInputStream(nomeArquivo);
			reader = new InputStreamReader(input);
			buffer = new BufferedReader(reader);
			linha = buffer.readLine();
			while (linha != null) {
				// linha = linha.replace("<", "\n<");
				texto += linha;
				linha = buffer.readLine();
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return texto;
	}

	public static NFE fileToNFE(String nomeArquivo) {
		NFE nota = new NFE();
		String texto = fileToString(nomeArquivo);
		String valor;
		int inicio, fim;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		// Id da notafiscal
		inicio = texto.indexOf("Id=") + 4;
		fim = texto.indexOf(" versao=", inicio) - 1;
		valor = texto.substring(inicio, fim);
		nota.setId(valor);

		// Versao da notafiscal
		inicio = texto.indexOf("=", fim) + 2;
		fim = texto.indexOf("\"", inicio);
		valor = texto.substring(inicio, fim);
		nota.setVersao(valor);

		// Unidade da federacao
		inicio = texto.indexOf("cUF") + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setcUF(Integer.parseInt(valor));

		// Codigo da NFE, gerado pelo emissor
		inicio = texto.indexOf("cNF", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setcNF(Long.parseLong(valor));

		// Natureza da operacao
		inicio = texto.indexOf("Op", fim) + 3;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setNatOp(valor);

		// Indicador de pagamento
		inicio = texto.indexOf("Pag", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setIndPag(Long.parseLong(valor));

		// Modalidade
		inicio = texto.indexOf("mod", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setMod(valor);

		// Serie
		inicio = texto.indexOf("serie", fim) + 6;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setSerie(Integer.parseInt(valor));

		// Numero documento fiscal
		inicio = texto.indexOf("nNF", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setnNF(Integer.parseInt(valor));

		// Data de emissao
		inicio = texto.indexOf("dEmi", fim) + 5;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setdEmi(Calendar.getInstance());
		try {
			nota.getdEmi().setTime(sdf.parse(valor));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		inicio = texto.indexOf("tpNF", fim) + 5;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setTpNF(Integer.parseInt(valor));

		inicio = texto.indexOf("cMunFG", fim) + 7;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setcMunFG(Long.parseLong(valor));

		inicio = texto.indexOf("tpImp", fim) + 6;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setTpImp(Integer.parseInt(valor));

		inicio = texto.indexOf("tpEmis", fim) + 7;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setTpEmis(Integer.parseInt(valor));

		inicio = texto.indexOf("cDV", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setcDV(Integer.parseInt(valor));

		inicio = texto.indexOf("tpAmb", fim) + 6;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setTpAmb(Integer.parseInt(valor));

		inicio = texto.indexOf("finNFe", fim) + 7;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setFinNFe(Integer.parseInt(valor));

		inicio = texto.indexOf("procEmi", fim) + 8;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setProcEmi(Integer.parseInt(valor));
		
		inicio = texto.indexOf("verProc", fim) + 8;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setVerProc(valor);

		//*********** EMITENTE **************//
		inicio = texto.indexOf("CNPJ", fim) + 5;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiCNPJ(valor);
		
		inicio = texto.indexOf("xNome", fim) + 6;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiNome(valor);
		
		inicio = texto.indexOf("xLgr", fim) + 5;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiEndLgr(valor);
		
		inicio = texto.indexOf("nro", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiEndNum(valor);
		
		inicio = texto.indexOf("xBairro", fim) + 8;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiEndBairro(valor);
		
		inicio = texto.indexOf("cMun", fim) + 5;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiEndCodMun(Integer.parseInt(valor));
		
		inicio = texto.indexOf("xMun", fim) + 5;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiEndMunicipio(valor);
		
		inicio = texto.indexOf("UF", fim) + 3;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiEndUF(valor);
		
		inicio = texto.indexOf("CEP", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiEndCEP(Long.parseLong(valor));
		
		inicio = texto.indexOf("cPais", fim) + 6;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiEndCodPais(Integer.parseInt(valor));
		
		inicio = texto.indexOf("xPais", fim) + 6;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiEndPais(valor);
		
		inicio = texto.indexOf("IE", fim) + 3;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiIE(valor);
		
		inicio = texto.indexOf("IM", fim) + 3;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiIM(valor);
		
		inicio = texto.indexOf("CNAE", fim) + 5;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiCNAE(Long.parseLong(valor));
		
		inicio = texto.indexOf("CRT", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setEmiCRT(Long.parseLong(valor));
		
		
		
		//*********** DESTINATÁRIO **************//
		
		inicio = texto.indexOf("CPF", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestCPF(valor);
		
		inicio = texto.indexOf("xNome", fim) + 6;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestNome(valor);
		
		inicio = texto.indexOf("xLgr", fim) + 5;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestEndLgr(valor);
		
		inicio = texto.indexOf("nro", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestEndNum(valor);
		
		inicio = texto.indexOf("xBairro", fim) + 8;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestEndBairro(valor);
		
		inicio = texto.indexOf("cMun", fim) + 5;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestEndCodMun(Long.parseLong(valor));
		
		inicio = texto.indexOf("xMun", fim) + 5;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestEndMunicipio(valor);
		
		inicio = texto.indexOf("UF", fim) + 3;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestEndUF(valor);
		
		inicio = texto.indexOf("CEP", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestEndCEP(valor);
		
		inicio = texto.indexOf("cPais", fim) + 6;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestEndCodPais(Integer.parseInt(valor));
		
		inicio = texto.indexOf("xPais", fim) + 6;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setDestEndPais(valor);
		
		while (texto.indexOf("<det nItem=", fim)!=-1){
			NFEItem item = new NFEItem();
			item.getId().setIdNotaFiscal(nota.getId());
			
			inicio = texto.indexOf("nItem=", fim) + 7;
			fim = texto.indexOf("\"", inicio);
			valor = texto.substring(inicio, fim);
			item.getId().setIdItem(Long.parseLong(valor));
			
			inicio = texto.indexOf("cProd", fim) + 6;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setCodProduto(valor);
			
			inicio = texto.indexOf("xProd", fim) + 6;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setDescricao(valor);
			
			inicio = texto.indexOf("NCM", fim) + 4;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setNcm(Long.valueOf(valor));
			
			inicio = texto.indexOf("CFOP", fim) + 5;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setCfop(Integer.valueOf(valor));
			
			inicio = texto.indexOf("uCom", fim) + 5;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setuCom(valor);
			
			inicio = texto.indexOf("qCom", fim) + 5;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setqCom(Double.valueOf(valor));
			
			inicio = texto.indexOf("vUnCom", fim) + 7;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setvUnCom(new BigDecimal(valor));
			
			inicio = texto.indexOf("vProd", fim) + 6;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setvProd(new BigDecimal(valor));
			
			inicio = texto.indexOf("uTrib", fim) + 6;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setuTrib(valor);
			
			inicio = texto.indexOf("qTrib", fim) + 6;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setqTrib(Double.valueOf(valor));
			
			inicio = texto.indexOf("vUnTrib", fim) + 8;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setvUnTrib(new BigDecimal(valor));
			
			inicio = texto.indexOf("indTot", fim) + 7;
			fim = texto.indexOf("<", inicio);
			valor = texto.substring(inicio, fim);
			item.setIndTot(Integer.valueOf(valor));
			
			nota.getListaItens().add(item);
		}
		
		inicio = texto.indexOf("vServ", fim) + 6;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setIssqnServ(new BigDecimal(valor));
		
		inicio = texto.indexOf("vBC", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setIssqnBC(new BigDecimal(valor));
		
		inicio = texto.indexOf("vISS", fim) + 4;
		fim = texto.indexOf("<", inicio);
		valor = texto.substring(inicio, fim);
		nota.setIssqnISS(new BigDecimal(valor));
		
		return nota;
	}
}
