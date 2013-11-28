
package br.com.ecodetech.integracao.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ecodetech.integracao.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetListaProdutoXMLResponse_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getListaProdutoXMLResponse");
    private final static QName _GetMensagemResponse_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getMensagemResponse");
    private final static QName _GetListaCliente_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getListaCliente");
    private final static QName _GetListaProdutoXML_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getListaProdutoXML");
    private final static QName _GetListaProduto_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getListaProduto");
    private final static QName _GetListaClienteResponse_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getListaClienteResponse");
    private final static QName _GetListaClienteXMLResponse_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getListaClienteXMLResponse");
    private final static QName _GetCliente_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getCliente");
    private final static QName _GetClienteResponse_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getClienteResponse");
    private final static QName _GetMensagem_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getMensagem");
    private final static QName _GetListaClienteXML_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getListaClienteXML");
    private final static QName _GetListaProdutoResponse_QNAME = new QName("http://webservices.integracao.ecodetech.com.br/", "getListaProdutoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ecodetech.integracao.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListaProdutoResponse }
     * 
     */
    public GetListaProdutoResponse createGetListaProdutoResponse() {
        return new GetListaProdutoResponse();
    }

    /**
     * Create an instance of {@link GetListaClienteXML }
     * 
     */
    public GetListaClienteXML createGetListaClienteXML() {
        return new GetListaClienteXML();
    }

    /**
     * Create an instance of {@link GetMensagem }
     * 
     */
    public GetMensagem createGetMensagem() {
        return new GetMensagem();
    }

    /**
     * Create an instance of {@link GetClienteResponse }
     * 
     */
    public GetClienteResponse createGetClienteResponse() {
        return new GetClienteResponse();
    }

    /**
     * Create an instance of {@link GetCliente }
     * 
     */
    public GetCliente createGetCliente() {
        return new GetCliente();
    }

    /**
     * Create an instance of {@link GetListaClienteXMLResponse }
     * 
     */
    public GetListaClienteXMLResponse createGetListaClienteXMLResponse() {
        return new GetListaClienteXMLResponse();
    }

    /**
     * Create an instance of {@link GetListaClienteResponse }
     * 
     */
    public GetListaClienteResponse createGetListaClienteResponse() {
        return new GetListaClienteResponse();
    }

    /**
     * Create an instance of {@link GetListaProdutoXMLResponse }
     * 
     */
    public GetListaProdutoXMLResponse createGetListaProdutoXMLResponse() {
        return new GetListaProdutoXMLResponse();
    }

    /**
     * Create an instance of {@link GetListaProduto }
     * 
     */
    public GetListaProduto createGetListaProduto() {
        return new GetListaProduto();
    }

    /**
     * Create an instance of {@link GetListaProdutoXML }
     * 
     */
    public GetListaProdutoXML createGetListaProdutoXML() {
        return new GetListaProdutoXML();
    }

    /**
     * Create an instance of {@link GetListaCliente }
     * 
     */
    public GetListaCliente createGetListaCliente() {
        return new GetListaCliente();
    }

    /**
     * Create an instance of {@link GetMensagemResponse }
     * 
     */
    public GetMensagemResponse createGetMensagemResponse() {
        return new GetMensagemResponse();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link Categoria }
     * 
     */
    public Categoria createCategoria() {
        return new Categoria();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaProdutoXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getListaProdutoXMLResponse")
    public JAXBElement<GetListaProdutoXMLResponse> createGetListaProdutoXMLResponse(GetListaProdutoXMLResponse value) {
        return new JAXBElement<GetListaProdutoXMLResponse>(_GetListaProdutoXMLResponse_QNAME, GetListaProdutoXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMensagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getMensagemResponse")
    public JAXBElement<GetMensagemResponse> createGetMensagemResponse(GetMensagemResponse value) {
        return new JAXBElement<GetMensagemResponse>(_GetMensagemResponse_QNAME, GetMensagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getListaCliente")
    public JAXBElement<GetListaCliente> createGetListaCliente(GetListaCliente value) {
        return new JAXBElement<GetListaCliente>(_GetListaCliente_QNAME, GetListaCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaProdutoXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getListaProdutoXML")
    public JAXBElement<GetListaProdutoXML> createGetListaProdutoXML(GetListaProdutoXML value) {
        return new JAXBElement<GetListaProdutoXML>(_GetListaProdutoXML_QNAME, GetListaProdutoXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaProduto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getListaProduto")
    public JAXBElement<GetListaProduto> createGetListaProduto(GetListaProduto value) {
        return new JAXBElement<GetListaProduto>(_GetListaProduto_QNAME, GetListaProduto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getListaClienteResponse")
    public JAXBElement<GetListaClienteResponse> createGetListaClienteResponse(GetListaClienteResponse value) {
        return new JAXBElement<GetListaClienteResponse>(_GetListaClienteResponse_QNAME, GetListaClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaClienteXMLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getListaClienteXMLResponse")
    public JAXBElement<GetListaClienteXMLResponse> createGetListaClienteXMLResponse(GetListaClienteXMLResponse value) {
        return new JAXBElement<GetListaClienteXMLResponse>(_GetListaClienteXMLResponse_QNAME, GetListaClienteXMLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getCliente")
    public JAXBElement<GetCliente> createGetCliente(GetCliente value) {
        return new JAXBElement<GetCliente>(_GetCliente_QNAME, GetCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getClienteResponse")
    public JAXBElement<GetClienteResponse> createGetClienteResponse(GetClienteResponse value) {
        return new JAXBElement<GetClienteResponse>(_GetClienteResponse_QNAME, GetClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMensagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getMensagem")
    public JAXBElement<GetMensagem> createGetMensagem(GetMensagem value) {
        return new JAXBElement<GetMensagem>(_GetMensagem_QNAME, GetMensagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaClienteXML }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getListaClienteXML")
    public JAXBElement<GetListaClienteXML> createGetListaClienteXML(GetListaClienteXML value) {
        return new JAXBElement<GetListaClienteXML>(_GetListaClienteXML_QNAME, GetListaClienteXML.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaProdutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.integracao.ecodetech.com.br/", name = "getListaProdutoResponse")
    public JAXBElement<GetListaProdutoResponse> createGetListaProdutoResponse(GetListaProdutoResponse value) {
        return new JAXBElement<GetListaProdutoResponse>(_GetListaProdutoResponse_QNAME, GetListaProdutoResponse.class, null, value);
    }

}
