package br.com.ecodetech.integracao.model.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fis_nfe_sefaz_item")
public class NFEItem {

	@EmbeddedId
	private NFEItemId id;
	// Código do produto ou serviço
	@Column(name = "fni_cod_prod", length = 60)
	private String codProduto;
	// GTIN (Global Trade Item Number) do produto, antigo código EAN ou código
	// de barras
	@Column(name = "fni_ean", length = 14)
	private String ean;
	// Descrição do produto ou serviço
	@Column(name = "fni_desc_prod", length = 14)
	private String descricao;
	// Código NCM com 8 dígitos ou 2 dígitos (gênero)
	@Column(name = "fni_ncm", length = 8)
	private Long ncm;

	// FNI_NVE vem de que campo do XML ????
	// FNI_EXTIPI

	// Código Fiscal de Operações e Prestações
	@Column(name = "fni_cfop", length = 4)
	private Integer cfop;
	// Unidade Comercial
	@Column(name = "fni_und_com", length = 6)
	private String uCom;
	// Quantidade Comercial
	@Column(name = "fni_qtd_com", length = 11, precision = 4)
	private double qCom;
	// Valor Unitário de Comercialização
	@Column(name = "fni_vl_unit_com")
	private BigDecimal vUnCom;
	// Valor Total Bruto dos Produtos ou Serviços
	@Column(name = "fni_vl_tot_prod")
	private BigDecimal vProd;

	// GTIN (Global Trade Item Number) da unidade tributável, antigo código EAN
	// ou código de barras
	@Column(name = "fni_ean_trib", length = 14)
	private String eanTrib;
	// Unidade Tributável
	@Column(name = "fni_unid_trib", length = 14)
	private String uTrib;
	// Quantidade Tributável
	@Column(name = "fni_qtd_trib", length = 11, precision = 4)
	private double qTrib;
	// Valor Unitário de tributação
	@Column(name = "fni_vl_unit_trib")
	private BigDecimal vUnTrib;

	// FNI_VL_FRETE vem de que campo do XML ????
	// FNI_VL_SEGURO vem de que campo do XML ????
	// FNI_VL_DESCONTO vem de que campo do XML ????
	// FNI_VL_OUTRO vem de que campo do XML ????

	// Indica se valor do Item (vProd) entra no valor total da NF-e: 0=Valor do
	// item (vProd) não compõe o valor total da NF-e; 1=Valor do item (vProd)
	// compõe o valor total da NF-e;
	@Column(name = "fni_ind_tot")
	private Integer indTot;
	
	public NFEItem() {
		id = new NFEItemId();
	}

	public NFEItemId getId() {
		return id;
	}

	public void setId(NFEItemId id) {
		this.id = id;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public String getEan() {
		return ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getNcm() {
		return ncm;
	}

	public void setNcm(Long ncm) {
		this.ncm = ncm;
	}

	public Integer getCfop() {
		return cfop;
	}

	public void setCfop(Integer cfop) {
		this.cfop = cfop;
	}

	public String getuCom() {
		return uCom;
	}

	public void setuCom(String uCom) {
		this.uCom = uCom;
	}

	public double getqCom() {
		return qCom;
	}

	public void setqCom(double qCom) {
		this.qCom = qCom;
	}

	public BigDecimal getvUnCom() {
		return vUnCom;
	}

	public void setvUnCom(BigDecimal vUnCom) {
		this.vUnCom = vUnCom;
	}

	public BigDecimal getvProd() {
		return vProd;
	}

	public void setvProd(BigDecimal vProd) {
		this.vProd = vProd;
	}

	public String getEanTrib() {
		return eanTrib;
	}

	public void setEanTrib(String eanTrib) {
		this.eanTrib = eanTrib;
	}

	public String getuTrib() {
		return uTrib;
	}

	public void setuTrib(String uTrib) {
		this.uTrib = uTrib;
	}

	public double getqTrib() {
		return qTrib;
	}

	public void setqTrib(double qTrib) {
		this.qTrib = qTrib;
	}

	public BigDecimal getvUnTrib() {
		return vUnTrib;
	}

	public void setvUnTrib(BigDecimal vUnTrib) {
		this.vUnTrib = vUnTrib;
	}

	public Integer getIndTot() {
		return indTot;
	}

	public void setIndTot(Integer indTot) {
		this.indTot = indTot;
	}

}
