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
public class ProjetProcessor {
	private int ID_projet;
	
	private String titre;
	
	private String description;
	
	private Integer objectifMontant;
	
	private Integer montantActuel;
	
	private String dateDebut;
	
	private String dateFin;
	
	private String statut;
	
	private String action="";
	
	public void setID_projet(int value) {
		this.ID_projet = value;
	}
	
	public int getID_projet() {
		return ID_projet;
	}
	
	public void setTitre(String value) {
		this.titre = value;
	}
	
	public String getTitre() {
		return titre == null ? "" : titre;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description == null ? "" : description;
	}
	
	public void setObjectifMontant(int value) {
		setObjectifMontant(Integer.valueOf(value));
	}
	
	public void setObjectifMontant(Integer value) {
		this.objectifMontant = value;
	}
	
	public Integer getObjectifMontant() {
		return objectifMontant;
	}
	
	public void setMontantActuel(int value) {
		setMontantActuel(Integer.valueOf(value));
	}
	
	public void setMontantActuel(Integer value) {
		this.montantActuel = value;
	}
	
	public Integer getMontantActuel() {
		return montantActuel;
	}
	
	public void setDateDebut(String value) {
		this.dateDebut = value;
	}
	
	public String getDateDebut() {
		return dateDebut == null ? "" : dateDebut;
	}
	
	public void setDateFin(String value) {
		this.dateFin = value;
	}
	
	public String getDateFin() {
		return dateFin == null ? "" : dateFin;
	}
	
	public void setStatut(String value) {
		this.statut = value;
	}
	
	public String getStatut() {
		return statut == null ? "" : statut;
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
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				diagramme_des_classes.Projet _projet = diagramme_des_classes.Projet.loadProjetByORMID(getID_projet());
				if (_projet!= null) {
					copyFromBean(_projet);
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
				diagramme_des_classes.Projet _projet = diagramme_des_classes.Projet.createProjet();
				copyToBean(_projet);
				if (_projet.save()) {
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
				diagramme_des_classes.Projet _projet= diagramme_des_classes.Projet.loadProjetByORMID(getID_projet());
				if (_projet != null) {
					copyToBean(_projet);
					if (_projet.save()) {
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
				diagramme_des_classes.Projet _projet = diagramme_des_classes.Projet.loadProjetByORMID(getID_projet());
				if (_projet != null && _projet.deleteAndDissociate()) {
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
	
	private void copyFromBean(diagramme_des_classes.Projet _projet) {
		setTitre(_projet.getTitre());
		setDescription(_projet.getDescription());
		setObjectifMontant(_projet.getObjectifMontant());
		setMontantActuel(_projet.getMontantActuel());
		setDateDebut(_projet.getDateDebut());
		setDateFin(_projet.getDateFin());
		setStatut(_projet.getStatut());
		setID_projet(_projet.getORMID());
		
		{
			diagramme_des_classes.Utilisateur _utilisateur = _projet.getUtilisateur();
			if (_utilisateur != null) {
				setUtilisateur_utilisateurID_user(_utilisateur.getORMID());
			}
		}
		
	}
	
	private void copyToBean(diagramme_des_classes.Projet _projet) {
		_projet.setTitre(getTitre());
		_projet.setDescription(getDescription());
		_projet.setObjectifMontant(getObjectifMontant());
		_projet.setMontantActuel(getMontantActuel());
		_projet.setDateDebut(getDateDebut());
		_projet.setDateFin(getDateFin());
		_projet.setStatut(getStatut());
		try  {
			diagramme_des_classes.Utilisateur _utilisateur = diagramme_des_classes.Utilisateur.loadUtilisateurByORMID(getUtilisateur_utilisateurID_user());
			_projet.setUtilisateur(_utilisateur);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

