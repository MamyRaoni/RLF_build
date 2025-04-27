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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ProjetCriteria extends AbstractORMCriteria {
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
	
	public ProjetCriteria(Criteria criteria) {
		super(criteria);
		ID_projet = new IntegerExpression("ID_projet", this);
		utilisateurId = new IntegerExpression("utilisateur.ID_user", this);
		utilisateur = new AssociationExpression("utilisateur", this);
		titre = new StringExpression("titre", this);
		description = new StringExpression("description", this);
		objectifMontant = new IntegerExpression("objectifMontant", this);
		montantActuel = new IntegerExpression("montantActuel", this);
		dateDebut = new StringExpression("dateDebut", this);
		dateFin = new StringExpression("dateFin", this);
		statut = new StringExpression("statut", this);
		messages = new CollectionExpression("ORM_messages", this);
		dons = new CollectionExpression("ORM_dons", this);
	}
	
	public ProjetCriteria(PersistentSession session) {
		this(session.createCriteria(Projet.class));
	}
	
	public ProjetCriteria() throws PersistentException {
		this(TPRLFPersistentManager.instance().getSession());
	}
	
	public UtilisateurCriteria createUtilisateurCriteria() {
		return new UtilisateurCriteria(createCriteria("utilisateur"));
	}
	
	public MessageCriteria createMessagesCriteria() {
		return new MessageCriteria(createCriteria("ORM_messages"));
	}
	
	public DonCriteria createDonsCriteria() {
		return new DonCriteria(createCriteria("ORM_dons"));
	}
	
	public Projet uniqueProjet() {
		return (Projet) super.uniqueResult();
	}
	
	public Projet[] listProjet() {
		java.util.List list = super.list();
		return (Projet[]) list.toArray(new Projet[list.size()]);
	}
}

