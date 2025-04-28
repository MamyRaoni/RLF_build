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
@Table(name="Utilisateur")
public class Utilisateur implements Serializable {
	public Utilisateur() {
	}
	
	public static Utilisateur loadUtilisateurByORMID(int ID_user) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadUtilisateurByORMID(session, ID_user);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(int ID_user) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getUtilisateurByORMID(session, ID_user);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByORMID(int ID_user, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadUtilisateurByORMID(session, ID_user, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(int ID_user, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return getUtilisateurByORMID(session, ID_user, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByORMID(PersistentSession session, int ID_user) throws PersistentException {
		try {
			return (Utilisateur) session.load(diagramme_des_classes.Utilisateur.class, Integer.valueOf(ID_user));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(PersistentSession session, int ID_user) throws PersistentException {
		try {
			return (Utilisateur) session.get(diagramme_des_classes.Utilisateur.class, Integer.valueOf(ID_user));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByORMID(PersistentSession session, int ID_user, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utilisateur) session.load(diagramme_des_classes.Utilisateur.class, Integer.valueOf(ID_user), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur getUtilisateurByORMID(PersistentSession session, int ID_user, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Utilisateur) session.get(diagramme_des_classes.Utilisateur.class, Integer.valueOf(ID_user), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilisateur(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryUtilisateur(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilisateur(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return queryUtilisateur(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return listUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryUtilisateur(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Utilisateur as Utilisateur");
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
	
	public static List queryUtilisateur(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Utilisateur", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryUtilisateur(session, condition, orderBy);
			return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur[] listUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryUtilisateur(session, condition, orderBy, lockMode);
			return (Utilisateur[]) list.toArray(new Utilisateur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return loadUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Utilisateur[] utilisateurs = listUtilisateurByQuery(session, condition, orderBy);
		if (utilisateurs != null && utilisateurs.length > 0)
			return utilisateurs[0];
		else
			return null;
	}
	
	public static Utilisateur loadUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Utilisateur[] utilisateurs = listUtilisateurByQuery(session, condition, orderBy, lockMode);
		if (utilisateurs != null && utilisateurs.length > 0)
			return utilisateurs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUtilisateurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iterateUtilisateurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilisateurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = TPRLFPersistentManager.instance().getSession();
			return iterateUtilisateurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUtilisateurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Utilisateur as Utilisateur");
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
	
	public static java.util.Iterator iterateUtilisateurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From diagramme_des_classes.Utilisateur as Utilisateur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Utilisateur", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Utilisateur loadUtilisateurByCriteria(UtilisateurCriteria utilisateurCriteria) {
		Utilisateur[] utilisateurs = listUtilisateurByCriteria(utilisateurCriteria);
		if(utilisateurs == null || utilisateurs.length == 0) {
			return null;
		}
		return utilisateurs[0];
	}
	
	public static Utilisateur[] listUtilisateurByCriteria(UtilisateurCriteria utilisateurCriteria) {
		return utilisateurCriteria.listUtilisateur();
	}
	
	public static Utilisateur createUtilisateur() {
		return new diagramme_des_classes.Utilisateur();
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
			diagramme_des_classes.Projet[] lProjetss = projets.toArray();
			for(int i = 0; i < lProjetss.length; i++) {
				lProjetss[i].setUtilisateur(null);
			}
			diagramme_des_classes.Don[] lDonss = dons.toArray();
			for(int i = 0; i < lDonss.length; i++) {
				lDonss[i].setUtilisateur(null);
			}
			diagramme_des_classes.Message[] lMessagess = messages.toArray();
			for(int i = 0; i < lMessagess.length; i++) {
				lMessagess[i].setUtilisateur(null);
			}
			if(getVerification_Identite() != null) {
				getVerification_Identite().setUtilisateur_val(null);
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
			diagramme_des_classes.Projet[] lProjetss = projets.toArray();
			for(int i = 0; i < lProjetss.length; i++) {
				lProjetss[i].setUtilisateur(null);
			}
			diagramme_des_classes.Don[] lDonss = dons.toArray();
			for(int i = 0; i < lDonss.length; i++) {
				lDonss[i].setUtilisateur(null);
			}
			diagramme_des_classes.Message[] lMessagess = messages.toArray();
			for(int i = 0; i < lMessagess.length; i++) {
				lMessagess[i].setUtilisateur(null);
			}
			if(getVerification_Identite() != null) {
				getVerification_Identite().setUtilisateur_val(null);
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
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_UTILISATEUR_PROJETS) {
			return ORM_projets;
		}
		else if (key == ORMConstants.KEY_UTILISATEUR_DONS) {
			return ORM_dons;
		}
		else if (key == ORMConstants.KEY_UTILISATEUR_MESSAGES) {
			return ORM_messages;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID_user", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DIAGRAMME_DES_CLASSES_UTILISATEUR_ID_USER_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DIAGRAMME_DES_CLASSES_UTILISATEUR_ID_USER_GENERATOR", strategy="native")	
	private int ID_user;
	
	@Column(name="Nom", nullable=true, length=255)	
	private String nom;
	
	@Column(name="Mdp", nullable=true, length=255)	
	private String mdp;
	
	@Column(name="Type", nullable=true, length=255)	
	private String type;
	
	@OneToMany(mappedBy="utilisateur", targetEntity=diagramme_des_classes.Projet.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_projets = new java.util.HashSet();
	
	@OneToMany(mappedBy="utilisateur", targetEntity=diagramme_des_classes.Don.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_dons = new java.util.HashSet();
	
	@OneToMany(mappedBy="utilisateur", targetEntity=diagramme_des_classes.Message.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_messages = new java.util.HashSet();
	
	@OneToOne(mappedBy="utilisateur_val", targetEntity=diagramme_des_classes.Verification_Identite.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private diagramme_des_classes.Verification_Identite verification_Identite;
	
	private void setID_user(int value) {
		this.ID_user = value;
	}
	
	public int getID_user() {
		return ID_user;
	}
	
	public int getORMID() {
		return getID_user();
	}
	
	public void setNom(String value) {
		this.nom = value;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setMdp(String value) {
		this.mdp = value;
	}
	
	public String getMdp() {
		return mdp;
	}
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type;
	}
	
	private void setORM_Projets(java.util.Set value) {
		this.ORM_projets = value;
	}
	
	private java.util.Set getORM_Projets() {
		return ORM_projets;
	}
	
	@Transient	
	public final diagramme_des_classes.ProjetSetCollection projets = new diagramme_des_classes.ProjetSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILISATEUR_PROJETS, ORMConstants.KEY_PROJET_UTILISATEUR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Dons(java.util.Set value) {
		this.ORM_dons = value;
	}
	
	private java.util.Set getORM_Dons() {
		return ORM_dons;
	}
	
	@Transient	
	public final diagramme_des_classes.DonSetCollection dons = new diagramme_des_classes.DonSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILISATEUR_DONS, ORMConstants.KEY_DON_UTILISATEUR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Messages(java.util.Set value) {
		this.ORM_messages = value;
	}
	
	private java.util.Set getORM_Messages() {
		return ORM_messages;
	}
	
	@Transient	
	public final diagramme_des_classes.MessageSetCollection messages = new diagramme_des_classes.MessageSetCollection(this, _ormAdapter, ORMConstants.KEY_UTILISATEUR_MESSAGES, ORMConstants.KEY_MESSAGE_UTILISATEUR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setVerification_Identite(diagramme_des_classes.Verification_Identite value) {
		if (this.verification_Identite != value) {
			diagramme_des_classes.Verification_Identite lverification_Identite = this.verification_Identite;
			this.verification_Identite = value;
			if (value != null) {
				verification_Identite.setUtilisateur_val(this);
			}
			if (lverification_Identite != null && lverification_Identite.getUtilisateur_val() == this) {
				lverification_Identite.setUtilisateur_val(null);
			}
		}
	}
	
	public diagramme_des_classes.Verification_Identite getVerification_Identite() {
		return verification_Identite;
	}
	
	public String toString() {
		return String.valueOf(getID_user());
	}
	
}
