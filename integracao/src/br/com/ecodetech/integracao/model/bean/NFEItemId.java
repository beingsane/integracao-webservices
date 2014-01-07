package br.com.ecodetech.integracao.model.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class NFEItemId implements Serializable {

	@Column(name = "fni_id_nfe", length = 47)
	private String idNotaFiscal;
	@Column(name = "fni_item")
	private Long idItem;

	public String getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(String idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}

	public Long getIdItem() {
		return idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}
}
