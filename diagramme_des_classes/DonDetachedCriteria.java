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

public class DonDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID_don;
	public final IntegerExpression projet_donId;
	public final AssociationExpression projet_don;
	public final IntegerExpression utilisateurId;
	public final AssociationExpression utilisateur;
	public final IntegerExpression montant;
	public final StringExpression date;
	public final IntegerExpression contributeur;
	public final IntegerExpression projet;
	public final IntegerExpression paiementId;
	public final AssociationExpression paiement;
	
	public DonDetachedCriteria() {
		super(diagramme_des_classes.Don.class, diagramme_des_classes.DonCriteria.class);
		ID_don = new IntegerExpression("ID_don", this.getDetachedCriteria());
		projet_donId = new IntegerExpression("projet_don.ID_projet", this.getDetachedCriteria());
		projet_don = new AssociationExpression("projet_don", this.getDetachedCriteria());
		utilisateurId = new IntegerExpression("utilisateur.ID_user", this.getDetachedCriteria());
		utilisateur = new AssociationExpression("utilisateur", this.getDetachedCriteria());
		montant = new IntegerExpression("montant", this.getDetachedCriteria());
		date = new StringExpression("date", this.getDetachedCriteria());
		contributeur = new IntegerExpression("contributeur", this.getDetachedCriteria());
		projet = new IntegerExpression("projet", this.getDetachedCriteria());
		paiementId = new IntegerExpression("paiement.ID_don", this.getDetachedCriteria());
		paiement = new AssociationExpression("paiement", this.getDetachedCriteria());
	}
	
	public DonDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, diagramme_des_classes.DonCriteria.class);
		ID_don = new IntegerExpression("ID_don", this.getDetachedCriteria());
		projet_donId = new IntegerExpression("projet_don.ID_projet", this.getDetachedCriteria());
		projet_don = new AssociationExpression("projet_don", this.getDetachedCriteria());
		utilisateurId = new IntegerExpression("utilisateur.ID_user", this.getDetachedCriteria());
		utilisateur = new AssociationExpression("utilisateur", this.getDetachedCriteria());
		montant = new IntegerExpression("montant", this.getDetachedCriteria());
		date = new StringExpression("date", this.getDetachedCriteria());
		contributeur = new IntegerExpression("contributeur", this.getDetachedCriteria());
		projet = new IntegerExpression("projet", this.getDetachedCriteria());
		paiementId = new IntegerExpression("paiement.ID_don", this.getDetachedCriteria());
		paiement = new AssociationExpression("paiement", this.getDetachedCriteria());
	}
	
	public ProjetDetachedCriteria createProjet_donCriteria() {
		return new ProjetDetachedCriteria(createCriteria("projet_don"));
	}
	
	public UtilisateurDetachedCriteria createUtilisateurCriteria() {
		return new UtilisateurDetachedCriteria(createCriteria("utilisateur"));
	}
	
	public PaiementDetachedCriteria createPaiementCriteria() {
		return new PaiementDetachedCriteria(createCriteria("paiement"));
	}
	
	public Don uniqueDon(PersistentSession session) {
		return (Don) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Don[] listDon(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Don[]) list.toArray(new Don[list.size()]);
	}
}

