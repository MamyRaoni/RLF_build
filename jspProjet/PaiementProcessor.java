/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Purchased
 */
package diagramme_des_classes;

import org.orm.PersistentException;
public class PaiementProcessor {
	private int ID_paiement;
	
	private Integer don;
	
	private String etat;
	
	private String recuEnvoyé;
	
	private String action="";
	
	public void setID_paiement(int value) {
		this.ID_paiement = value;
	}
	
	public int getID_paiement() {
		return ID_paiement;
	}
	
	public void setDon(int value) {
		setDon(Integer.valueOf(value));
	}
	
	public void setDon(Integer value) {
		this.don = value;
	}
	
	public Integer getDon() {
		return don;
	}
	
	public void setEtat(String value) {
		this.etat = value;
	}
	
	public String getEtat() {
		return etat == null ? "" : etat;
	}
	
	public void setRecuEnvoyé(String value) {
		this.recuEnvoyé = value;
	}
	
	public String getRecuEnvoyé() {
		return recuEnvoyé == null ? "" : recuEnvoyé;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int don_paiement_donID_don;
	
	public void setDon_paiement_donID_don(int value) {
		this.don_paiement_donID_don = value;
	}
	
	public int getDon_paiement_donID_don() {
		return don_paiement_donID_don;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				diagramme_des_classes.Paiement _paiement = diagramme_des_classes.Paiement.loadPaiementByORMID(getID_paiement());
				if (_paiement!= null) {
					copyFromBean(_paiement);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				diagramme_des_classes.Paiement _paiement = diagramme_des_classes.Paiement.createPaiement();
				copyToBean(_paiement);
				if (_paiement.save()) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				diagramme_des_classes.Paiement _paiement= diagramme_des_classes.Paiement.loadPaiementByORMID(getID_paiement());
				if (_paiement != null) {
					copyToBean(_paiement);
					if (_paiement.save()) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				diagramme_des_classes.Paiement _paiement = diagramme_des_classes.Paiement.loadPaiementByORMID(getID_paiement());
				if (_paiement != null && _paiement.deleteAndDissociate()) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(diagramme_des_classes.Paiement _paiement) {
		setDon(_paiement.getDon());
		setEtat(_paiement.getEtat());
		setRecuEnvoyé(_paiement.getRecuEnvoyé());
		setID_paiement(_paiement.getORMID());
		
		{
			diagramme_des_classes.Don _don = _paiement.getDon_paiement();
			if (_don != null) {
				setDon_paiement_donID_don(_don.getORMID());
			}
		}
		
	}
	
	private void copyToBean(diagramme_des_classes.Paiement _paiement) {
		_paiement.setDon(getDon());
		_paiement.setEtat(getEtat());
		_paiement.setRecuEnvoyé(getRecuEnvoyé());
		try  {
			diagramme_des_classes.Don _don_paiement = diagramme_des_classes.Don.loadDonByORMID(getDon_paiement_donID_don());
			_paiement.setDon_paiement(_don_paiement);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

