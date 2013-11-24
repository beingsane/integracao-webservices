package br.com.ecodetech.integracao.model.facade;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.apache.log4j.Logger;

import br.com.ecodetech.integracao.model.bean.Cliente;
import br.com.ecodetech.integracao.model.bean.Produto;
import br.com.ecodetech.integracao.model.dao.ClienteDAO;
import br.com.ecodetech.integracao.model.dao.ProdutoDAO;

@RequestScoped
public class ModelFacade {

	@Inject
	private ClienteDAO clienteDAO;
	@Inject
	private ProdutoDAO produtoDAO;
	@Inject
	private transient Logger logger;

	public List<Cliente> listarCliente() {
		logger.info("Metodo executado: listarCliente()");
		return clienteDAO.listar();
	}

	public Cliente consultarCliente(Long id) {
		logger.info("Metodo executado: consultarCliente()");
		return clienteDAO.consultar(id);
	}

	public List<Produto> listarProduto() {
		logger.info("Metodo executado: listarProduto()");
		return produtoDAO.listar();
	}

}
