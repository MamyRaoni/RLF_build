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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Verification_Identite")
public class Verification_Identite implements Serializable {
	public Verification_Identite() {
	}
	
	public static Verification_Identite loadVerification_IdentiteByORMID(int ID_verif) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadVerification_IdentiteByORMID(session, ID_verif);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite getVerification_IdentiteByORMID(int ID_verif) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getVerification_IdentiteByORMID(session, ID_verif);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite loadVerification_IdentiteByORMID(int ID_verif, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadVerification_IdentiteByORMID(session, ID_verif, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite getVerification_IdentiteByORMID(int ID_verif, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getVerification_IdentiteByORMID(session, ID_verif, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite loadVerification_IdentiteByORMID(PersistentSession session, int ID_verif) throws PersistentException {
		try {
			return (Verification_Identite) session.load(diagramme_des_classes.Verification_Identite.class, Integer.valueOf(ID_verif));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite getVerification_IdentiteByORMID(PersistentSession session, int ID_verif) throws PersistentException {
		try {
			return (Verification_Identite) session.get(diagramme_des_classes.Verification_Identite.class, Integer.valueOf(ID_verif));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite loadVerification_IdentiteByORMID(PersistentSession session, int ID_verif, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Verification_Identite) session.load(diagramme_des_classes.Verification_Identite.class, Integer.valueOf(ID_verif), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite getVerification_IdentiteByORMID(PersistentSession session, int ID_verif, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Verification_Identite) session.get(diagramme_des_classes.Verification_Identite.class, Integer.valueOf(ID_verif), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVerification_Identite(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryVerification_Identite(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVerification_Identite(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryVerification_Identite(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite[] listVerification_IdentiteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listVerification_IdentiteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite[] listVerification_IdentiteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listVerification_IdentiteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVerification_Identite(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Verification_Identite as Verification_Identite");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVerification_Identite(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Verification_Identite as Verification_Identite");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Verification_Identite", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite[] listVerification_IdentiteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVerification_Identite(session, condition, orderBy);
			return (Verification_Identite[]) list.toArray(new Verification_Identite[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite[] listVerification_IdentiteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVerification_Identite(session, condition, orderBy, lockMode);
			return (Verification_Identite[]) list.toArray(new Verification_Identite[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite loadVerification_IdentiteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadVerification_IdentiteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite loadVerification_IdentiteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadVerification_IdentiteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite loadVerification_IdentiteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Verification_Identite[] verification_Identites = listVerification_IdentiteByQuery(session, condition, orderBy);
		if (verification_Identites != null && verification_Identites.length > 0)
			return verification_Identites[0];
		else
			return null;
	}
	
	public static Verification_Identite loadVerification_IdentiteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Verification_Identite[] verification_Identites = listVerification_IdentiteByQuery(session, condition, orderBy, lockMode);
		if (verification_Identites != null && verification_Identites.length > 0)
			return verification_Identites[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVerification_IdentiteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iterateVerification_IdentiteByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVerification_IdentiteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iterateVerification_IdentiteByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVerification_IdentiteByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Verification_Identite as Verification_Identite");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVerification_IdentiteByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Verification_Identite as Verification_Identite");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Verification_Identite", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Verification_Identite loadVerification_IdentiteByCriteria(Verification_IdentiteCriteria verification_IdentiteCriteria) {
		Verification_Identite[] verification_Identites = listVerification_IdentiteByCriteria(verification_IdentiteCriteria);
		if(verification_Identites == null || verification_Identites.length == 0) {
			return null;
		}
		return verification_Identites[0];
	}
	
	public static Verification_Identite[] listVerification_IdentiteByCriteria(Verification_IdentiteCriteria verification_IdentiteCriteria) {
		return verification_IdentiteCriteria.listVerification_Identite();
	}
	
	public static Verification_Identite createVerification_Identite() {
		return new diagramme_des_classes.Verification_Identite();
	}
	
	public boolean save() throws PersistentException {
		try {
			TPRLFPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			TPRLFPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			TPRLFPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			TPRLFPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate()throws PersistentException {
		try {
			if(getUtilisateur_val() != null) {
				getUtilisateur_val().setVerification_Identite(null);
			}
			
			return delete();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(org.orm.PersistentSession session)throws PersistentException {
		try {
			if(getUtilisateur_val() != null) {
				getUtilisateur_val().setVerification_Identite(null);
			}
			
			try {
				session.delete(this);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	@Column(name="ID_verif", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMME_DES_CLASSES_VERIFICATION_IDENTITE_ID_VERIF_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMME_DES_CLASSES_VERIFICATION_IDENTITE_ID_VERIF_GENERATOR", strategy="native")	
	private int ID_verif;
	
	@OneToOne(optional=false, targetEntity=diagramme_des_classes.Utilisateur.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="UtilisateurID_user", referencedColumnName="ID_user", nullable=false) }, foreignKey=@ForeignKey(name="user-valIdent"))	
	private diagramme_des_classes.Utilisateur utilisateur_val;
	
	@Column(name="Utilisateur", nullable=true, length=10)	
	private Integer utilisateur;
	
	@Column(name="Etat", nullable=true, length=10)	
	private Integer etat;
	
	private void setID_verif(int value) {
		this.ID_verif = value;
	}
	
	public int getID_verif() {
		return ID_verif;
	}
	
	public int getORMID() {
		return getID_verif();
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
	
	public void setUtilisateur_val(diagramme_des_classes.Utilisateur value) {
		if (this.utilisateur_val != value) {
			diagramme_des_classes.Utilisateur lutilisateur_val = this.utilisateur_val;
			this.utilisateur_val = value;
			if (value != null) {
				utilisateur_val.setVerification_Identite(this);
			}
			if (lutilisateur_val != null && lutilisateur_val.getVerification_Identite() == this) {
				lutilisateur_val.setVerification_Identite(null);
			}
		}
	}
	
	public diagramme_des_classes.Utilisateur getUtilisateur_val() {
		return utilisateur_val;
	}
	
	public String toString() {
		return String.valueOf(getID_verif());
	}
	
}
