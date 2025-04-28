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

public class DonCriteria extends AbstractORMCriteria {
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
	
	public DonCriteria(Criteria criteria) {
		super(criteria);
		ID_don = new IntegerExpression("ID_don", this);
		projet_donId = new IntegerExpression("projet_don.ID_projet", this);
		projet_don = new AssociationExpression("projet_don", this);
		utilisateurId = new IntegerExpression("utilisateur.ID_user", this);
		utilisateur = new AssociationExpression("utilisateur", this);
		montant = new IntegerExpression("montant", this);
		date = new StringExpression("date", this);
		contributeur = new IntegerExpression("contributeur", this);
		projet = new IntegerExpression("projet", this);
		paiementId = new IntegerExpression("paiement.ID_don", this);
		paiement = new AssociationExpression("paiement", this);
	}
	
	public DonCriteria(PersistentSession session) {
		this(session.createCriteria(Don.class));
	}
	
	public DonCriteria() throws PersistentException {
		this(TPRLFPersistentManager.instance().getSession());
	}
	
	public ProjetCriteria createProjet_donCriteria() {
		return new ProjetCriteria(createCriteria("projet_don"));
	}
	
	public UtilisateurCriteria createUtilisateurCriteria() {
		return new UtilisateurCriteria(createCriteria("utilisateur"));
	}
	
	public PaiementCriteria createPaiementCriteria() {
		return new PaiementCriteria(createCriteria("paiement"));
	}
	
	public Don uniqueDon() {
		return (Don) super.uniqueResult();
	}
	
	public Don[] listDon() {
		java.util.List list = super.list();
		return (Don[]) list.toArray(new Don[list.size()]);
	}
}

