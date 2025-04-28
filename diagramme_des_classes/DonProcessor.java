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
public class DonProcessor {
	private int ID_don;
	
	private Integer montant;
	
	private String date;
	
	private Integer contributeur;
	
	private Integer projet;
	
	private String action="";
	
	public void setID_don(int value) {
		this.ID_don = value;
	}
	
	public int getID_don() {
		return ID_don;
	}
	
	public void setMontant(int value) {
		setMontant(Integer.valueOf(value));
	}
	
	public void setMontant(Integer value) {
		this.montant = value;
	}
	
	public Integer getMontant() {
		return montant;
	}
	
	public void setDate(String value) {
		this.date = value;
	}
	
	public String getDate() {
		return date == null ? "" : date;
	}
	
	public void setContributeur(int value) {
		setContributeur(Integer.valueOf(value));
	}
	
	public void setContributeur(Integer value) {
		this.contributeur = value;
	}
	
	public Integer getContributeur() {
		return contributeur;
	}
	
	public void setProjet(int value) {
		setProjet(Integer.valueOf(value));
	}
	
	public void setProjet(Integer value) {
		this.projet = value;
	}
	
	public Integer getProjet() {
		return projet;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int utilisateur_utilisateurID_user;
	
	public void setUtilisateur_utilisateurID_user(int value) {
		this.utilisateur_utilisateurID_user = value;
	}
	
	public int getUtilisateur_utilisateurID_user() {
		return utilisateur_utilisateurID_user;
	}
	
	private int projet_don_projetID_projet;
	
	public void setProjet_don_projetID_projet(int value) {
		this.projet_don_projetID_projet = value;
	}
	
	public int getProjet_don_projetID_projet() {
		return projet_don_projetID_projet;
	}
	
	private int paiement_paiementID_paiement;
	
	public void setPaiement_paiementID_paiement(int value) {
		this.paiement_paiementID_paiement = value;
	}
	
	public int getPaiement_paiementID_paiement() {
		return paiement_paiementID_paiement;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				diagramme_des_classes.Don _don = diagramme_des_classes.Don.loadDonByORMID(getID_don());
				if (_don!= null) {
					copyFromBean(_don);
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
				diagramme_des_classes.Don _don = diagramme_des_classes.Don.createDon();
				copyToBean(_don);
				if (_don.save()) {
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
				diagramme_des_classes.Don _don= diagramme_des_classes.Don.loadDonByORMID(getID_don());
				if (_don != null) {
					copyToBean(_don);
					if (_don.save()) {
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
				diagramme_des_classes.Don _don = diagramme_des_classes.Don.loadDonByORMID(getID_don());
				if (_don != null && _don.deleteAndDissociate()) {
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
	
	private void copyFromBean(diagramme_des_classes.Don _don) {
		setMontant(_don.getMontant());
		setDate(_don.getDate());
		setContributeur(_don.getContributeur());
		setProjet(_don.getProjet());
		setID_don(_don.getORMID());
		
		{
			diagramme_des_classes.Utilisateur _utilisateur = _don.getUtilisateur();
			if (_utilisateur != null) {
				setUtilisateur_utilisateurID_user(_utilisateur.getORMID());
			}
		}
		
		
		{
			diagramme_des_classes.Projet _projet = _don.getProjet_don();
			if (_projet != null) {
				setProjet_don_projetID_projet(_projet.getORMID());
			}
		}
		
		
		{
			diagramme_des_classes.Paiement _paiement = _don.getPaiement();
			if (_paiement != null) {
				setPaiement_paiementID_paiement(_paiement.getORMID());
			}
		}
		
	}
	
	private void copyToBean(diagramme_des_classes.Don _don) {
		_don.setMontant(getMontant());
		_don.setDate(getDate());
		_don.setContributeur(getContributeur());
		_don.setProjet(getProjet());
		try  {
			diagramme_des_classes.Utilisateur _utilisateur = diagramme_des_classes.Utilisateur.loadUtilisateurByORMID(getUtilisateur_utilisateurID_user());
			_don.setUtilisateur(_utilisateur);
		}
		catch (PersistentException e) {
		}
		
		try  {
			diagramme_des_classes.Projet _projet_don = diagramme_des_classes.Projet.loadProjetByORMID(getProjet_don_projetID_projet());
			_don.setProjet_don(_projet_don);
		}
		catch (PersistentException e) {
		}
		
		try  {
			diagramme_des_classes.Paiement _paiement = diagramme_des_classes.Paiement.loadPaiementByORMID(getPaiement_paiementID_paiement());
			_don.setPaiement(_paiement);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

