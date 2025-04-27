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
public class MessageProcessor {
	private int ID_message;
	
	private String contenu;
	
	private String deteEnvoi;
	
	private Integer expediteur;
	
	private Integer projet;
	
	private String action="";
	
	public void setID_message(int value) {
		this.ID_message = value;
	}
	
	public int getID_message() {
		return ID_message;
	}
	
	public void setContenu(String value) {
		this.contenu = value;
	}
	
	public String getContenu() {
		return contenu == null ? "" : contenu;
	}
	
	public void setDeteEnvoi(String value) {
		this.deteEnvoi = value;
	}
	
	public String getDeteEnvoi() {
		return deteEnvoi == null ? "" : deteEnvoi;
	}
	
	public void setExpediteur(int value) {
		setExpediteur(Integer.valueOf(value));
	}
	
	public void setExpediteur(Integer value) {
		this.expediteur = value;
	}
	
	public Integer getExpediteur() {
		return expediteur;
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
	
	private int projet_message_projetID_projet;
	
	public void setProjet_message_projetID_projet(int value) {
		this.projet_message_projetID_projet = value;
	}
	
	public int getProjet_message_projetID_projet() {
		return projet_message_projetID_projet;
	}
	
	private int utilisateur_utilisateurID_user;
	
	public void setUtilisateur_utilisateurID_user(int value) {
		this.utilisateur_utilisateurID_user = value;
	}
	
	public int getUtilisateur_utilisateurID_user() {
		return utilisateur_utilisateurID_user;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				diagramme_des_classes.Message _message = diagramme_des_classes.Message.loadMessageByORMID(getID_message());
				if (_message!= null) {
					copyFromBean(_message);
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
				diagramme_des_classes.Message _message = diagramme_des_classes.Message.createMessage();
				copyToBean(_message);
				if (_message.save()) {
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
				diagramme_des_classes.Message _message= diagramme_des_classes.Message.loadMessageByORMID(getID_message());
				if (_message != null) {
					copyToBean(_message);
					if (_message.save()) {
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
				diagramme_des_classes.Message _message = diagramme_des_classes.Message.loadMessageByORMID(getID_message());
				if (_message != null && _message.deleteAndDissociate()) {
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
	
	private void copyFromBean(diagramme_des_classes.Message _message) {
		setContenu(_message.getContenu());
		setDeteEnvoi(_message.getDeteEnvoi());
		setExpediteur(_message.getExpediteur());
		setProjet(_message.getProjet());
		setID_message(_message.getORMID());
		
		{
			diagramme_des_classes.Projet _projet = _message.getProjet_message();
			if (_projet != null) {
				setProjet_message_projetID_projet(_projet.getORMID());
			}
		}
		
		
		{
			diagramme_des_classes.Utilisateur _utilisateur = _message.getUtilisateur();
			if (_utilisateur != null) {
				setUtilisateur_utilisateurID_user(_utilisateur.getORMID());
			}
		}
		
	}
	
	private void copyToBean(diagramme_des_classes.Message _message) {
		_message.setContenu(getContenu());
		_message.setDeteEnvoi(getDeteEnvoi());
		_message.setExpediteur(getExpediteur());
		_message.setProjet(getProjet());
		try  {
			diagramme_des_classes.Projet _projet_message = diagramme_des_classes.Projet.loadProjetByORMID(getProjet_message_projetID_projet());
			_message.setProjet_message(_projet_message);
		}
		catch (PersistentException e) {
		}
		
		try  {
			diagramme_des_classes.Utilisateur _utilisateur = diagramme_des_classes.Utilisateur.loadUtilisateurByORMID(getUtilisateur_utilisateurID_user());
			_message.setUtilisateur(_utilisateur);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

