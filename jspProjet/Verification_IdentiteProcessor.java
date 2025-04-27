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
public class Verification_IdentiteProcessor {
	private int ID_verif;
	
	private Integer utilisateur;
	
	private Integer etat;
	
	private String action="";
	
	public void setID_verif(int value) {
		this.ID_verif = value;
	}
	
	public int getID_verif() {
		return ID_verif;
	}
	
	public void setUtilisateur(int value) {
		setUtilisateur(Integer.valueOf(value));
	}
	
	public void setUtilisateur(Integer value) {
		this.utilisateur = value;
	}
	
	public Integer getUtilisateur() {
		return utilisateur;
	}
	
	public void setEtat(int value) {
		setEtat(Integer.valueOf(value));
	}
	
	public void setEtat(Integer value) {
		this.etat = value;
	}
	
	public Integer getEtat() {
		return etat;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int utilisateur_val_utilisateurID_user;
	
	public void setUtilisateur_val_utilisateurID_user(int value) {
		this.utilisateur_val_utilisateurID_user = value;
	}
	
	public int getUtilisateur_val_utilisateurID_user() {
		return utilisateur_val_utilisateurID_user;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				diagramme_des_classes.Verification_Identite _verification_Identite = diagramme_des_classes.Verification_Identite.loadVerification_IdentiteByORMID(getID_verif());
				if (_verification_Identite!= null) {
					copyFromBean(_verification_Identite);
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
				diagramme_des_classes.Verification_Identite _verification_Identite = diagramme_des_classes.Verification_Identite.createVerification_Identite();
				copyToBean(_verification_Identite);
				if (_verification_Identite.save()) {
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
				diagramme_des_classes.Verification_Identite _verification_Identite= diagramme_des_classes.Verification_Identite.loadVerification_IdentiteByORMID(getID_verif());
				if (_verification_Identite != null) {
					copyToBean(_verification_Identite);
					if (_verification_Identite.save()) {
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
				diagramme_des_classes.Verification_Identite _verification_Identite = diagramme_des_classes.Verification_Identite.loadVerification_IdentiteByORMID(getID_verif());
				if (_verification_Identite != null && _verification_Identite.deleteAndDissociate()) {
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
	
	private void copyFromBean(diagramme_des_classes.Verification_Identite _verification_Identite) {
		setUtilisateur(_verification_Identite.getUtilisateur());
		setEtat(_verification_Identite.getEtat());
		setID_verif(_verification_Identite.getORMID());
		
		{
			diagramme_des_classes.Utilisateur _utilisateur = _verification_Identite.getUtilisateur_val();
			if (_utilisateur != null) {
				setUtilisateur_val_utilisateurID_user(_utilisateur.getORMID());
			}
		}
		
	}
	
	private void copyToBean(diagramme_des_classes.Verification_Identite _verification_Identite) {
		_verification_Identite.setUtilisateur(getUtilisateur());
		_verification_Identite.setEtat(getEtat());
		try  {
			diagramme_des_classes.Utilisateur _utilisateur_val = diagramme_des_classes.Utilisateur.loadUtilisateurByORMID(getUtilisateur_val_utilisateurID_user());
			_verification_Identite.setUtilisateur_val(_utilisateur_val);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

