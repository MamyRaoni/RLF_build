/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListTPRLFData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Utilisateur...");
		diagramme_des_classes.Utilisateur[] diagramme_des_classesUtilisateurs = diagramme_des_classes.Utilisateur.listUtilisateurByQuery(null, null);
		int length = Math.min(diagramme_des_classesUtilisateurs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagramme_des_classesUtilisateurs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Projet...");
		diagramme_des_classes.Projet[] diagramme_des_classesProjets = diagramme_des_classes.Projet.listProjetByQuery(null, null);
		length = Math.min(diagramme_des_classesProjets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagramme_des_classesProjets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Message...");
		diagramme_des_classes.Message[] diagramme_des_classesMessages = diagramme_des_classes.Message.listMessageByQuery(null, null);
		length = Math.min(diagramme_des_classesMessages.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagramme_des_classesMessages[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paiement...");
		diagramme_des_classes.Paiement[] diagramme_des_classesPaiements = diagramme_des_classes.Paiement.listPaiementByQuery(null, null);
		length = Math.min(diagramme_des_classesPaiements.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagramme_des_classesPaiements[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Verification_Identite...");
		diagramme_des_classes.Verification_Identite[] diagramme_des_classesVerification_Identites = diagramme_des_classes.Verification_Identite.listVerification_IdentiteByQuery(null, null);
		length = Math.min(diagramme_des_classesVerification_Identites.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagramme_des_classesVerification_Identites[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Don...");
		diagramme_des_classes.Don[] diagramme_des_classesDons = diagramme_des_classes.Don.listDonByQuery(null, null);
		length = Math.min(diagramme_des_classesDons.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(diagramme_des_classesDons[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Utilisateur by Criteria...");
		diagramme_des_classes.UtilisateurCriteria ldiagramme_des_classesUtilisateurCriteria = new diagramme_des_classes.UtilisateurCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldiagramme_des_classesUtilisateurCriteria.ID_user.eq();
		ldiagramme_des_classesUtilisateurCriteria.setMaxResults(ROW_COUNT);
		diagramme_des_classes.Utilisateur[] diagramme_des_classesUtilisateurs = ldiagramme_des_classesUtilisateurCriteria.listUtilisateur();
		int length =diagramme_des_classesUtilisateurs== null ? 0 : Math.min(diagramme_des_classesUtilisateurs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagramme_des_classesUtilisateurs[i]);
		}
		System.out.println(length + " Utilisateur record(s) retrieved."); 
		
		System.out.println("Listing Projet by Criteria...");
		diagramme_des_classes.ProjetCriteria ldiagramme_des_classesProjetCriteria = new diagramme_des_classes.ProjetCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldiagramme_des_classesProjetCriteria.ID_projet.eq();
		ldiagramme_des_classesProjetCriteria.setMaxResults(ROW_COUNT);
		diagramme_des_classes.Projet[] diagramme_des_classesProjets = ldiagramme_des_classesProjetCriteria.listProjet();
		length =diagramme_des_classesProjets== null ? 0 : Math.min(diagramme_des_classesProjets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagramme_des_classesProjets[i]);
		}
		System.out.println(length + " Projet record(s) retrieved."); 
		
		System.out.println("Listing Message by Criteria...");
		diagramme_des_classes.MessageCriteria ldiagramme_des_classesMessageCriteria = new diagramme_des_classes.MessageCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldiagramme_des_classesMessageCriteria.ID_message.eq();
		ldiagramme_des_classesMessageCriteria.setMaxResults(ROW_COUNT);
		diagramme_des_classes.Message[] diagramme_des_classesMessages = ldiagramme_des_classesMessageCriteria.listMessage();
		length =diagramme_des_classesMessages== null ? 0 : Math.min(diagramme_des_classesMessages.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagramme_des_classesMessages[i]);
		}
		System.out.println(length + " Message record(s) retrieved."); 
		
		System.out.println("Listing Paiement by Criteria...");
		diagramme_des_classes.PaiementCriteria ldiagramme_des_classesPaiementCriteria = new diagramme_des_classes.PaiementCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldiagramme_des_classesPaiementCriteria.ID_paiement.eq();
		ldiagramme_des_classesPaiementCriteria.setMaxResults(ROW_COUNT);
		diagramme_des_classes.Paiement[] diagramme_des_classesPaiements = ldiagramme_des_classesPaiementCriteria.listPaiement();
		length =diagramme_des_classesPaiements== null ? 0 : Math.min(diagramme_des_classesPaiements.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagramme_des_classesPaiements[i]);
		}
		System.out.println(length + " Paiement record(s) retrieved."); 
		
		System.out.println("Listing Verification_Identite by Criteria...");
		diagramme_des_classes.Verification_IdentiteCriteria ldiagramme_des_classesVerification_IdentiteCriteria = new diagramme_des_classes.Verification_IdentiteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldiagramme_des_classesVerification_IdentiteCriteria.ID_verif.eq();
		ldiagramme_des_classesVerification_IdentiteCriteria.setMaxResults(ROW_COUNT);
		diagramme_des_classes.Verification_Identite[] diagramme_des_classesVerification_Identites = ldiagramme_des_classesVerification_IdentiteCriteria.listVerification_Identite();
		length =diagramme_des_classesVerification_Identites== null ? 0 : Math.min(diagramme_des_classesVerification_Identites.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagramme_des_classesVerification_Identites[i]);
		}
		System.out.println(length + " Verification_Identite record(s) retrieved."); 
		
		System.out.println("Listing Don by Criteria...");
		diagramme_des_classes.DonCriteria ldiagramme_des_classesDonCriteria = new diagramme_des_classes.DonCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldiagramme_des_classesDonCriteria.ID_don.eq();
		ldiagramme_des_classesDonCriteria.setMaxResults(ROW_COUNT);
		diagramme_des_classes.Don[] diagramme_des_classesDons = ldiagramme_des_classesDonCriteria.listDon();
		length =diagramme_des_classesDons== null ? 0 : Math.min(diagramme_des_classesDons.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(diagramme_des_classesDons[i]);
		}
		System.out.println(length + " Don record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListTPRLFData listTPRLFData = new ListTPRLFData();
			try {
				listTPRLFData.listTestData();
				//listTPRLFData.listByCriteria();
			}
			finally {
				diagramme_des_classes.TPRLFPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
