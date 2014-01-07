package br.com.ecodetech.integracao.model.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "fis_nfe_sefaz")
public class NFE implements Serializable{
	@Id
	@Column(name = "nfe_id", length = 47)
	private String id;
	@Column(name = "nfe_versao", length = 4)
	private String versao;
	@Column(name = "nfe_cod_uf")
	private Integer cUF;
	// Código Numérico-Número aleatório gerado pelo emitente para cada NF-e
	@Column(name = "nfe_cod_num")
	private Long cNF;
	// Natureza da Operação
	@Column(name = "nfe_nat_oper")
	private String natOp;
	// Indicador de Pagamento: 0= Pgmt à Vista, 1=Pgmt à Prazo e 2=Outros
	@Column(name = "nfe_ind_pagmt")
	private Long indPag;
	// Cód. Mod.: 55=NF-e e 65=NFC-e
	@Column(name = "nfe_cod_mod", length = 2)
	private String mod;
	// Série do Documento Fiscal
	@Column(name = "nfe_serie")
	private Integer serie;
	// Número do Documento Fiscal
	@Column(name = "nfe_num_doc_fiscal")
	private Integer nNF;
	// Data e Hora de Emissão do Documento
	@Column(name = "nfe_dthr_emi")
	private Calendar dEmi;
	// Tipo de Operação: 0=Entrada e 1=Saída

	// NFE_DTHR_SAI- vem de que campo do XML ????

	@Column(name = "nfe_tp_oper")
	private Integer tpNF;

	// NFE_ID_DEST - vem de que campo do XML ????

	// Código do Município de Ocorrência do Fato Gerador
	@Column(name = "nfe_cod_mun_fg")
	private Long cMunFG;
	// Formato de Impressão do DANFE: 0=Sem geração de DANFE; 1=DANFE normal,
	// Retrato; 2=DANFE normal, Paisagem; 3=DANFE Simplificado; 4=DANFE NFC-e;
	// 5=DANFE NFC-e em mensagem eletrônica;
	@Column(name = "nfe_tp_imp")
	private Integer tpImp;
	// Tipo de Emissão da NF-e: 1=Emissão normal; 2=Contingência FS-IA;
	// 3=Contingência SCAN; 4=Contingência DPEC; 5=Contingência FS-DA;
	// 6=Contingência SVC-AN; 7=Contingência SVC-RS; 9=Contingência off-line;
	@Column(name = "nfe_tp_emissao")
	private Integer tpEmis;
	// Dígito Verificador da Chave de Acesso da NF-e
	@Column(name = "nfe_dv")
	private Integer cDV;
	// Identificação do Ambiente
	@Column(name = "nfe_tp_amb")
	private Integer tpAmb;
	// Finalidade de emissão da NF-e: 1=NF-e normal; 2=NF-e complementar; 3=NF-e
	// de ajuste; 4=Devolução/Retorno.
	@Column(name = "nfe_finalidade")
	private Integer finNFe;

	// NFE_IND_FINAL - vem de que campo do XML ????
	// NFE_IND_PRES - vem de que campo do XML ????

	// Processo de emissão da NF-e: 0=Aplicativo do contribuinte; 1=Avulsa pelo
	// Fisco; 2=Com seu certificado digital, através do site do Fisco;
	// 3=Aplicativo fornecido pelo Fisco.
	@Column(name = "nfe_proc_emi")
	private Integer procEmi;

	// Versão do Processo de emissão da NFe;
	@Column(name = "nfe_ver_proc", length = 20)
	private String verProc;

	// ============================ DADOS DO EMITENTE
	// ============================

	// CNPJ do órgão emitente
	@Column(name = "nfe_cnpj_emi", length = 14)
	private String emiCNPJ;

	// NFE_CPF_REM - vem de que campo do XML ????
	// NFE_FANT_EMI- vem de que campo do XML ???? nome fantasia

	// CNPJ do órgão emitente
	@Column(name = "nfe_nome_emi", length = 60)
	private String emiNome;
	// Logradouro do Emitiente
	@Column(name = "nfe_end_emi_logr", length = 60)
	private String emiEndLgr;
	// Numero do endereco do emitente
	@Column(name = "nfe_end_emi_num", length = 60)
	private String emiEndNum;

	// NFE_END_EMI_COMPL - vem de que campo do XML ????

	// Bairro do Emitente
	@Column(name = "nfe_end_emi_bairro", length = 60)
	private String emiEndBairro;
	// Código do município
	@Column(name = "nfe_end_emi_cod_mun")
	private Integer emiEndCodMun;
	// Nome do municipio
	@Column(name = "nfe_end_emi_mun", length = 60)
	private String emiEndMunicipio;
	// Sigla da UF
	@Column(name = "nfe_end_emi_uf", length = 2)
	private String emiEndUF;
	// Código do CEP
	@Column(name = "nfe_end_emi_cep")
	private Long emiEndCEP;
	// Código do País: 1058=Brasil
	@Column(name = "nfe_end_emi_cod_pais")
	private Integer emiEndCodPais;
	// Nome do País
	@Column(name = "nfe_end_emi_pais")
	private String emiEndPais;

	// NFE_FONE_EMI - vem de que campo do XML ????

	// Inscrição Estadual do Emitente
	@Column(name = "nfe_ie_emi", length = 14)
	private String emiIE;

	// NFE_IE_SUB_EMI - vem de que campo do XML ????

	// Inscrição Municipal do Prestador de Serviço
	@Column(name = "nfe_im_emi", length = 15)
	private String emiIM;
	// CNAE fiscal
	@Column(name = "nfe_cnae_emi")
	private Long emiCNAE;

	// Código de Regime Tributário: 1=Simples Nacional; 2=Simples Nacional,
	// excesso sublimite de receita bruta; 3=Regime Normal.
	@Column(name = "nfe_crt_emi")
	private Long emiCRT;

	// ============================ DADOS DO DESTINATARIO
	// ============================

	// NFE_CNPJ_DEST - vem de que campo do XML ????

	// cpf do Destinatário
	@Column(name = "nfe_cpf_dest", length = 11)
	private String destCPF;

	// NFE_ID_EST_DEST - vem de que campo do XML ????

	// cpf do Destinatário
	@Column(name = "nfe_nome_dest", length = 20)
	private String destNome;
	// Logradouro do Destinatário
	@Column(name = "nfe_end_dest_logr", length = 60)
	private String destEndLgr;
	// Numero do endereco do destinatario
	@Column(name = "nfe_end_dest_num", length = 60)
	private String destEndNum;
	// Bairro do Destinatário
	@Column(name = "nfe_end_dest_bairro", length = 60)
	private String destEndBairro;
	// Código do municipio
	@Column(name = "nfe_end_dest_cod_mun")
	private Long destEndCodMun;
	// Nome do municipio do Destinatario
	@Column(name = "nfe_end_dest_mun", length = 60)
	private String destEndMunicipio;
	// Sigla da UF do Destinatário
	@Column(name = "nfe_end_dest_uf", length = 2)
	private String destEndUF;
	// Código do CEP do Destinatário
	@Column(name = "nfe_end_dest_cep", length = 8)
	private String destEndCEP;
	// Código do País do Destinatário
	@Column(name = "nfe_end_dest_cod_pais")
	private Integer destEndCodPais;
	// Nome do País do Destinatário
	@Column(name = "nfe_end_dest_pais")
	private String destEndPais;

	// NFE_FONE_DEST - vem de que campo do XML ????
	// NFE_IND_IE_DEST
	// NFE_IE_DEST
	// NFE_ISUF_DEST
	// NFE_IM_DEST
	// NFE_EMAIL_DEST

	// ============================ TOTAIS DA NOTA
	// ============================

	// Valor total dos Serviços sob não-incidência ou não tributados pelo ICMS
	@Column(name = "nfe_issqn_serv")
	private BigDecimal issqnServ;
	// Valor total Base de Cálculo do ISS
	@Column(name = "nfe_issqn_bc")
	private BigDecimal issqnBC;
	// Valor total Base de Cálculo do ISS
	@Column(name = "nfe_issqn_iss")
	private BigDecimal issqnISS;

	// NFE_ISSQN_PIS vem de que campo do XML ????
	// NFE_ISSQN_COFINS
	// NFE_ISSQN_COMPET
	// NFE_ISSQN_DEDUCAO
	// NFE_ISSQN_OUTRO
	// NFE_ISSQN_INCOND
	// NFE_ISSQN_COND
	// NFE_ISSQN_ISSRET
	// NFE_ISSQN_REGTRIB

	// Código do Usuario (De onde???)
	@Column(name = "nfe_codusuario")
	private Long codUsuario;
	// Data e hora do cadastro
	@Column(name = "nfe_dthr")
	private Calendar dataCadastro;
	// Status do Processamento: 0=Não Processado; 1=Processado;
	@Column(name = "nfe_proc_status", length = 1)
	// (Quando atualiza? qdo ocorre o processamento?)
	private String statusProcessamento;
	
	private List<NFEItem> listaItens = new ArrayList<NFEItem>();
	
	public List<NFEItem> getListaItens() {
		return listaItens;
	}

	public void setListaItens(List<NFEItem> listaItens) {
		this.listaItens = listaItens;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public Integer getcUF() {
		return cUF;
	}

	public void setcUF(Integer cUF) {
		this.cUF = cUF;
	}

	public Long getcNF() {
		return cNF;
	}

	public void setcNF(Long cNF) {
		this.cNF = cNF;
	}

	public String getNatOp() {
		return natOp;
	}

	public void setNatOp(String natOp) {
		this.natOp = natOp;
	}

	public Long getIndPag() {
		return indPag;
	}

	public void setIndPag(Long indPag) {
		this.indPag = indPag;
	}

	public String getMod() {
		return mod;
	}

	public void setMod(String mod) {
		this.mod = mod;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	public Integer getnNF() {
		return nNF;
	}

	public void setnNF(Integer nNF) {
		this.nNF = nNF;
	}

	public Calendar getdEmi() {
		return dEmi;
	}

	public void setdEmi(Calendar dEmi) {
		this.dEmi = dEmi;
	}

	public Integer getTpNF() {
		return tpNF;
	}

	public void setTpNF(Integer tpNF) {
		this.tpNF = tpNF;
	}

	public Long getcMunFG() {
		return cMunFG;
	}

	public void setcMunFG(Long cMunFG) {
		this.cMunFG = cMunFG;
	}

	public Integer getTpImp() {
		return tpImp;
	}

	public void setTpImp(Integer tpImp) {
		this.tpImp = tpImp;
	}

	public Integer getTpEmis() {
		return tpEmis;
	}

	public void setTpEmis(Integer tpEmis) {
		this.tpEmis = tpEmis;
	}

	public Integer getcDV() {
		return cDV;
	}

	public void setcDV(Integer cDV) {
		this.cDV = cDV;
	}

	public Integer getTpAmb() {
		return tpAmb;
	}

	public void setTpAmb(Integer tpAmb) {
		this.tpAmb = tpAmb;
	}

	public Integer getFinNFe() {
		return finNFe;
	}

	public void setFinNFe(Integer finNFe) {
		this.finNFe = finNFe;
	}

	public Integer getProcEmi() {
		return procEmi;
	}

	public void setProcEmi(Integer procEmi) {
		this.procEmi = procEmi;
	}

	public String getVerProc() {
		return verProc;
	}

	public void setVerProc(String verProc) {
		this.verProc = verProc;
	}

	public String getEmiCNPJ() {
		return emiCNPJ;
	}

	public void setEmiCNPJ(String emiCNPJ) {
		this.emiCNPJ = emiCNPJ;
	}

	public String getEmiNome() {
		return emiNome;
	}

	public void setEmiNome(String emiNome) {
		this.emiNome = emiNome;
	}

	public String getEmiEndLgr() {
		return emiEndLgr;
	}

	public void setEmiEndLgr(String emiEndLgr) {
		this.emiEndLgr = emiEndLgr;
	}

	public String getEmiEndNum() {
		return emiEndNum;
	}

	public void setEmiEndNum(String emiEndNum) {
		this.emiEndNum = emiEndNum;
	}

	public String getEmiEndBairro() {
		return emiEndBairro;
	}

	public void setEmiEndBairro(String emiEndBairro) {
		this.emiEndBairro = emiEndBairro;
	}

	public Integer getEmiEndCodMun() {
		return emiEndCodMun;
	}

	public void setEmiEndCodMun(Integer emiEndCodMun) {
		this.emiEndCodMun = emiEndCodMun;
	}

	public String getEmiEndMunicipio() {
		return emiEndMunicipio;
	}

	public void setEmiEndMunicipio(String emiEndMunicipio) {
		this.emiEndMunicipio = emiEndMunicipio;
	}

	public String getEmiEndUF() {
		return emiEndUF;
	}

	public void setEmiEndUF(String emiEndUF) {
		this.emiEndUF = emiEndUF;
	}

	public Long getEmiEndCEP() {
		return emiEndCEP;
	}

	public void setEmiEndCEP(Long emiEndCEP) {
		this.emiEndCEP = emiEndCEP;
	}

	public Integer getEmiEndCodPais() {
		return emiEndCodPais;
	}

	public void setEmiEndCodPais(Integer emiEndCodPais) {
		this.emiEndCodPais = emiEndCodPais;
	}

	public String getEmiEndPais() {
		return emiEndPais;
	}

	public void setEmiEndPais(String emiEndPais) {
		this.emiEndPais = emiEndPais;
	}

	public String getEmiIE() {
		return emiIE;
	}

	public void setEmiIE(String emiIE) {
		this.emiIE = emiIE;
	}

	public String getEmiIM() {
		return emiIM;
	}

	public void setEmiIM(String emiIM) {
		this.emiIM = emiIM;
	}

	public Long getEmiCNAE() {
		return emiCNAE;
	}

	public void setEmiCNAE(Long emiCNAE) {
		this.emiCNAE = emiCNAE;
	}

	public Long getEmiCRT() {
		return emiCRT;
	}

	public void setEmiCRT(Long emiCRT) {
		this.emiCRT = emiCRT;
	}

	public String getDestCPF() {
		return destCPF;
	}

	public void setDestCPF(String destCPF) {
		this.destCPF = destCPF;
	}

	public String getDestNome() {
		return destNome;
	}

	public void setDestNome(String destNome) {
		this.destNome = destNome;
	}

	public String getDestEndLgr() {
		return destEndLgr;
	}

	public void setDestEndLgr(String destEndLgr) {
		this.destEndLgr = destEndLgr;
	}

	public String getDestEndNum() {
		return destEndNum;
	}

	public void setDestEndNum(String destEndNum) {
		this.destEndNum = destEndNum;
	}

	public String getDestEndBairro() {
		return destEndBairro;
	}

	public void setDestEndBairro(String destEndBairro) {
		this.destEndBairro = destEndBairro;
	}

	public Long getDestEndCodMun() {
		return destEndCodMun;
	}

	public void setDestEndCodMun(Long destEndCodMun) {
		this.destEndCodMun = destEndCodMun;
	}

	public String getDestEndMunicipio() {
		return destEndMunicipio;
	}

	public void setDestEndMunicipio(String destEndMunicipio) {
		this.destEndMunicipio = destEndMunicipio;
	}

	public String getDestEndUF() {
		return destEndUF;
	}

	public void setDestEndUF(String destEndUF) {
		this.destEndUF = destEndUF;
	}

	public String getDestEndCEP() {
		return destEndCEP;
	}

	public void setDestEndCEP(String destEndCEP) {
		this.destEndCEP = destEndCEP;
	}

	public Integer getDestEndCodPais() {
		return destEndCodPais;
	}

	public void setDestEndCodPais(Integer destEndCodPais) {
		this.destEndCodPais = destEndCodPais;
	}

	public String getDestEndPais() {
		return destEndPais;
	}

	public void setDestEndPais(String destEndPais) {
		this.destEndPais = destEndPais;
	}

	public BigDecimal getIssqnServ() {
		return issqnServ;
	}

	public void setIssqnServ(BigDecimal issqnServ) {
		this.issqnServ = issqnServ;
	}

	public BigDecimal getIssqnBC() {
		return issqnBC;
	}

	public void setIssqnBC(BigDecimal issqnBC) {
		this.issqnBC = issqnBC;
	}

	public BigDecimal getIssqnISS() {
		return issqnISS;
	}

	public void setIssqnISS(BigDecimal issqnISS) {
		this.issqnISS = issqnISS;
	}

	public Long getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(Long codUsuario) {
		this.codUsuario = codUsuario;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getStatusProcessamento() {
		return statusProcessamento;
	}

	public void setStatusProcessamento(String statusProcessamento) {
		this.statusProcessamento = statusProcessamento;
	}

}
