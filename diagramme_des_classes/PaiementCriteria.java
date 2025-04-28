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

public class PaiementCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID_paiement;
	public final IntegerExpression don_paiementId;
	public final AssociationExpression don_paiement;
	public final IntegerExpression don;
	public final StringExpression etat;
	public final StringExpression recuEnvoyé;
	
	public PaiementCriteria(Criteria criteria) {
		super(criteria);
		ID_paiement = new IntegerExpression("ID_paiement", this);
		don_paiementId = new IntegerExpression("don_paiement.ID_don", this);
		don_paiement = new AssociationExpression("don_paiement", this);
		don = new IntegerExpression("don", this);
		etat = new StringExpression("etat", this);
		recuEnvoyé = new StringExpression("recuEnvoyé", this);
	}
	
	public PaiementCriteria(PersistentSession session) {
		this(session.createCriteria(Paiement.class));
	}
	
	public PaiementCriteria() throws PersistentException {
		this(TPRLFPersistentManager.instance().getSession());
	}
	
	public DonCriteria createDon_paiementCriteria() {
		return new DonCriteria(createCriteria("don_paiement"));
	}
	
	public Paiement uniquePaiement() {
		return (Paiement) super.uniqueResult();
	}
	
	public Paiement[] listPaiement() {
		java.util.List list = super.list();
		return (Paiement[]) list.toArray(new Paiement[list.size()]);
	}
}

