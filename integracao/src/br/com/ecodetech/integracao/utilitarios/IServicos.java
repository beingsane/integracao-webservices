package br.com.ecodetech.integracao.utilitarios;

import java.util.List;

import javax.jws.WebService;

import br.com.ecodetech.integracao.model.bean.Cliente;
import br.com.ecodetech.integracao.model.bean.Produto;

@WebService
public interface IServicos {
	public String getMensagem(String nome);
	public Cliente getCliente(Long id);
	public List<Cliente> getListaCliente();
	public List<Produto> getListaProduto();
}
