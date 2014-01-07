package br.com.ecodetech.integracao.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "fis_nfe_sefaz_xml")
public class NFEXML extends AbstractEntityBean{
	@Id
	@Column(name = "nsx_id_nfe", length=47)
	private String id;
	
	
	//TODO: verificar como mapear campos CLOB do Oracle
	
	@Lob
	@Column(name = "nsx_xml")
	private byte[] bytes;
}
