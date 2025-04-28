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

public class UtilisateurDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID_user;
	public final StringExpression nom;
	public final StringExpression mdp;
	public final StringExpression type;
	public final CollectionExpression projets;
	public final CollectionExpression dons;
	public final CollectionExpression messages;
	public final IntegerExpression verification_IdentiteId;
	public final AssociationExpression verification_Identite;
	
	public UtilisateurDetachedCriteria() {
		super(diagramme_des_classes.Utilisateur.class, diagramme_des_classes.UtilisateurCriteria.class);
		ID_user = new IntegerExpression("ID_user", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		mdp = new StringExpression("mdp", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		projets = new CollectionExpression("ORM_projets", this.getDetachedCriteria());
		dons = new CollectionExpression("ORM_dons", this.getDetachedCriteria());
		messages = new CollectionExpression("ORM_messages", this.getDetachedCriteria());
		verification_IdentiteId = new IntegerExpression("verification_Identite.ID_user", this.getDetachedCriteria());
		verification_Identite = new AssociationExpression("verification_Identite", this.getDetachedCriteria());
	}
	
	public UtilisateurDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagramme_des_classes.UtilisateurCriteria.class);
		ID_user = new IntegerExpression("ID_user", this.getDetachedCriteria());
		nom = new StringExpression("nom", this.getDetachedCriteria());
		mdp = new StringExpression("mdp", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
		projets = new CollectionExpression("ORM_projets", this.getDetachedCriteria());
		dons = new CollectionExpression("ORM_dons", this.getDetachedCriteria());
		messages = new CollectionExpression("ORM_messages", this.getDetachedCriteria());
		verification_IdentiteId = new IntegerExpression("verification_Identite.ID_user", this.getDetachedCriteria());
		verification_Identite = new AssociationExpression("verification_Identite", this.getDetachedCriteria());
	}
	
	public ProjetDetachedCriteria createProjetsCriteria() {
		return new ProjetDetachedCriteria(createCriteria("ORM_projets"));
	}
	
	public DonDetachedCriteria createDonsCriteria() {
		return new DonDetachedCriteria(createCriteria("ORM_dons"));
	}
	
	public MessageDetachedCriteria createMessagesCriteria() {
		return new MessageDetachedCriteria(createCriteria("ORM_messages"));
	}
	
	public Verification_IdentiteDetachedCriteria createVerification_IdentiteCriteria() {
		return new Verification_IdentiteDetachedCriteria(createCriteria("verification_Identite"));
	}
	
	public Utilisateur uniqueUtilisateur(PersistentSession session) {
		return (Utilisateur) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Utilisateur[] listUtilisateur(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
	}
}

