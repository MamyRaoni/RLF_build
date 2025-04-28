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
public class UtilisateurProcessor {
	private int ID_user;
	
	private String nom;
	
	private String mdp;
	
	private String type;
	
	private String action="";
	
	public void setID_user(int value) {
		this.ID_user = value;
	}
	
	public int getID_user() {
		return ID_user;
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom == null ? "" : nom;
	}
	
	public void setMdp(String value) {
		this.mdp = value;
	}
	
	public String getMdp() {
		return mdp == null ? "" : mdp;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type == null ? "" : type;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int verification_Identite_verification_IdentiteID_verif;
	
	public void setVerification_Identite_verification_IdentiteID_verif(int value) {
		this.verification_Identite_verification_IdentiteID_verif = value;
	}
	
	public int getVerification_Identite_verification_IdentiteID_verif() {
		return verification_Identite_verification_IdentiteID_verif;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				diagramme_des_classes.Utilisateur _utilisateur = diagramme_des_classes.Utilisateur.loadUtilisateurByORMID(getID_user());
				if (_utilisateur!= null) {
					copyFromBean(_utilisateur);
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
				diagramme_des_classes.Utilisateur _utilisateur = diagramme_des_classes.Utilisateur.createUtilisateur();
				copyToBean(_utilisateur);
				if (_utilisateur.save()) {
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
				diagramme_des_classes.Utilisateur _utilisateur= diagramme_des_classes.Utilisateur.loadUtilisateurByORMID(getID_user());
				if (_utilisateur != null) {
					copyToBean(_utilisateur);
					if (_utilisateur.save()) {
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
				diagramme_des_classes.Utilisateur _utilisateur = diagramme_des_classes.Utilisateur.loadUtilisateurByORMID(getID_user());
				if (_utilisateur != null && _utilisateur.deleteAndDissociate()) {
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
	
	private void copyFromBean(diagramme_des_classes.Utilisateur _utilisateur) {
		setNom(_utilisateur.getNom());
		setMdp(_utilisateur.getMdp());
		setType(_utilisateur.getType());
		setID_user(_utilisateur.getORMID());
		
		{
			diagramme_des_classes.Verification_Identite _verification_Identite = _utilisateur.getVerification_Identite();
			if (_verification_Identite != null) {
				setVerification_Identite_verification_IdentiteID_verif(_verification_Identite.getORMID());
			}
		}
		
	}
	
	private void copyToBean(diagramme_des_classes.Utilisateur _utilisateur) {
		_utilisateur.setNom(getNom());
		_utilisateur.setMdp(getMdp());
		_utilisateur.setType(getType());
		try  {
			diagramme_des_classes.Verification_Identite _verification_Identite = diagramme_des_classes.Verification_Identite.loadVerification_IdentiteByORMID(getVerification_Identite_verification_IdentiteID_verif());
			_utilisateur.setVerification_Identite(_verification_Identite);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

