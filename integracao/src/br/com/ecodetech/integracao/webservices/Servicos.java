package br.com.ecodetech.integracao.webservices;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.log4j.Logger;

import br.com.ecodetech.integracao.model.bean.Cliente;
import br.com.ecodetech.integracao.model.bean.Produto;
import br.com.ecodetech.integracao.model.facade.ModelFacade;
import br.com.ecodetech.integracao.xml.XMLWriter;

/**
 * Para gerar as classes do modulo cliente:
 * 
 * 1. Rode o projeto integracao no glasfish 4
 * 
 * 2. Acesse a raiz do projeto cliente: cd /home/...caminho completo
 * aqui.../workspace/integracao-client
 * 
 * 2.1 Exemplo: cd /home/marciopalheta/git/integracao-webservices/integracao-client
 * 
 * 3. DIGITE: wsimport -s src -d bin -p br.com.ecodetech.integracao.client
 * http://localhost:8080/integracao/ServicosService?wsdl
 * 
 * @author marciopalheta
 * 
 */
@WebService
public class Servicos implements IServicos {
	@Inject
	private transient Logger logger;
	@Inject
	private ModelFacade facade;
	@Inject
	private XMLWriter xmlWriter;

	@WebMethod
	public String getMensagem(@WebParam(name = "nomeUsuario") String nome) {
		logger.info("Metodo executado: getMensagem()");
		return "Olá " + nome;
	}

	@WebMethod
	public Cliente getCliente(@WebParam(name = "idCliente") Long id) {
		logger.info("Metodo executado: getCliente(Long id)");

		return facade.consultarCliente(id);
	}

	@Override
	public List<Cliente> getListaCliente() {
		logger.info("Metodo executado: getListaCliente()");
		return facade.listarCliente();
	}

	@Override
	public List<Produto> getListaProduto() {
		logger.info("Metodo executado: getListaProduto()");
		return facade.listarProduto();
	}

	@Override
	public String getListaClienteXML() {
		logger.info("Metodo executado: getListaClienteXML()");
		return xmlWriter.convertListaClientesToXML(facade.listarCliente());
	}

	@Override
	public String getListaProdutoXML() {
		logger.info("Metodo executado: getListaProdutoXML()");
		return xmlWriter.convertListaProdutosToXML(facade.listarProduto());
	}

}
