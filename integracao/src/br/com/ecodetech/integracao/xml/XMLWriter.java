package br.com.ecodetech.integracao.xml;

import java.util.List;

import br.com.ecodetech.integracao.model.bean.Cliente;
import br.com.ecodetech.integracao.model.bean.Produto;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class XMLWriter {

	private final XStream stream = new XStream(new DomDriver());

	public String convertListaClientesToXML(List<Cliente> lista) {
		stream.alias("cliente", Cliente.class);
		return stream.toXML(lista);
	}

	public String convertListaProdutosToXML(List<Produto> lista) {
		stream.alias("produto", Produto.class);
		return stream.toXML(lista);
	}
}
