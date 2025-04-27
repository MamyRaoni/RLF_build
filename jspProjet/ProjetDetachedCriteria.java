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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProjetDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID_projet;
	public final IntegerExpression utilisateurId;
	public final AssociationExpression utilisateur;
	public final StringExpression titre;
	public final StringExpression description;
	public final IntegerExpression objectifMontant;
	public final IntegerExpression montantActuel;
	public final StringExpression dateDebut;
	public final StringExpression dateFin;
	public final StringExpression statut;
	public final CollectionExpression messages;
	public final CollectionExpression dons;
	
	public ProjetDetachedCriteria() {
		super(diagramme_des_classes.Projet.class, diagramme_des_classes.ProjetCriteria.class);
		ID_projet = new IntegerExpression("ID_projet", this.getDetachedCriteria());
		utilisateurId = new IntegerExpression("utilisateur.ID_user", this.getDetachedCriteria());
		utilisateur = new AssociationExpression("utilisateur", this.getDetachedCriteria());
		titre = new StringExpression("titre", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		objectifMontant = new IntegerExpression("objectifMontant", this.getDetachedCriteria());
		montantActuel = new IntegerExpression("montantActuel", this.getDetachedCriteria());
		dateDebut = new StringExpression("dateDebut", this.getDetachedCriteria());
		dateFin = new StringExpression("dateFin", this.getDetachedCriteria());
		statut = new StringExpression("statut", this.getDetachedCriteria());
		messages = new CollectionExpression("ORM_messages", this.getDetachedCriteria());
		dons = new CollectionExpression("ORM_dons", this.getDetachedCriteria());
	}
	
	public ProjetDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagramme_des_classes.ProjetCriteria.class);
		ID_projet = new IntegerExpression("ID_projet", this.getDetachedCriteria());
		utilisateurId = new IntegerExpression("utilisateur.ID_user", this.getDetachedCriteria());
		utilisateur = new AssociationExpression("utilisateur", this.getDetachedCriteria());
		titre = new StringExpression("titre", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		objectifMontant = new IntegerExpression("objectifMontant", this.getDetachedCriteria());
		montantActuel = new IntegerExpression("montantActuel", this.getDetachedCriteria());
		dateDebut = new StringExpression("dateDebut", this.getDetachedCriteria());
		dateFin = new StringExpression("dateFin", this.getDetachedCriteria());
		statut = new StringExpression("statut", this.getDetachedCriteria());
		messages = new CollectionExpression("ORM_messages", this.getDetachedCriteria());
		dons = new CollectionExpression("ORM_dons", this.getDetachedCriteria());
	}
	
	public UtilisateurDetachedCriteria createUtilisateurCriteria() {
		return new UtilisateurDetachedCriteria(createCriteria("utilisateur"));
	}
	
	public MessageDetachedCriteria createMessagesCriteria() {
		return new MessageDetachedCriteria(createCriteria("ORM_messages"));
	}
	
	public DonDetachedCriteria createDonsCriteria() {
		return new DonDetachedCriteria(createCriteria("ORM_dons"));
	}
	
	public Projet uniqueProjet(PersistentSession session) {
		return (Projet) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Projet[] listProjet(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Projet[]) list.toArray(new Projet[list.size()]);
	}
}

