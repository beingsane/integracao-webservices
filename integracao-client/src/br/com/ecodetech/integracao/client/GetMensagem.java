
package br.com.ecodetech.integracao.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMensagem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMensagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMensagem", propOrder = {
    "nomeUsuario"
})
public class GetMensagem {

    protected String nomeUsuario;

    /**
     * Gets the value of the nomeUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * Sets the value of the nomeUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUsuario(String value) {
        this.nomeUsuario = value;
    }

}
