/**
 * Licensee: 
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateTPRLFData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = diagramme_des_classes.TPRLFPersistentManager.instance().getSession().beginTransaction();
		try {
			diagramme_des_classes.Utilisateur ldiagramme_des_classesUtilisateur = diagramme_des_classes.Utilisateur.loadUtilisateurByQuery(null, null);
			// Update the properties of the persistent object
			ldiagramme_des_classesUtilisateur.save();
			diagramme_des_classes.Projet ldiagramme_des_classesProjet = diagramme_des_classes.Projet.loadProjetByQuery(null, null);
			// Update the properties of the persistent object
			ldiagramme_des_classesProjet.save();
			diagramme_des_classes.Message ldiagramme_des_classesMessage = diagramme_des_classes.Message.loadMessageByQuery(null, null);
			// Update the properties of the persistent object
			ldiagramme_des_classesMessage.save();
			diagramme_des_classes.Paiement ldiagramme_des_classesPaiement = diagramme_des_classes.Paiement.loadPaiementByQuery(null, null);
			// Update the properties of the persistent object
			ldiagramme_des_classesPaiement.save();
			diagramme_des_classes.Verification_Identite ldiagramme_des_classesVerification_Identite = diagramme_des_classes.Verification_Identite.loadVerification_IdentiteByQuery(null, null);
			// Update the properties of the persistent object
			ldiagramme_des_classesVerification_Identite.save();
			diagramme_des_classes.Don ldiagramme_des_classesDon = diagramme_des_classes.Don.loadDonByQuery(null, null);
			// Update the properties of the persistent object
			ldiagramme_des_classesDon.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Utilisateur by UtilisateurCriteria");
		diagramme_des_classes.UtilisateurCriteria ldiagramme_des_classesUtilisateurCriteria = new diagramme_des_classes.UtilisateurCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldiagramme_des_classesUtilisateurCriteria.ID_user.eq();
		System.out.println(ldiagramme_des_classesUtilisateurCriteria.uniqueUtilisateur());
		
		System.out.println("Retrieving Projet by ProjetCriteria");
		diagramme_des_classes.ProjetCriteria ldiagramme_des_classesProjetCriteria = new diagramme_des_classes.ProjetCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldiagramme_des_classesProjetCriteria.ID_projet.eq();
		System.out.println(ldiagramme_des_classesProjetCriteria.uniqueProjet());
		
		System.out.println("Retrieving Message by MessageCriteria");
		diagramme_des_classes.MessageCriteria ldiagramme_des_classesMessageCriteria = new diagramme_des_classes.MessageCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldiagramme_des_classesMessageCriteria.ID_message.eq();
		System.out.println(ldiagramme_des_classesMessageCriteria.uniqueMessage());
		
		System.out.println("Retrieving Paiement by PaiementCriteria");
		diagramme_des_classes.PaiementCriteria ldiagramme_des_classesPaiementCriteria = new diagramme_des_classes.PaiementCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldiagramme_des_classesPaiementCriteria.ID_paiement.eq();
		System.out.println(ldiagramme_des_classesPaiementCriteria.uniquePaiement());
		
		System.out.println("Retrieving Verification_Identite by Verification_IdentiteCriteria");
		diagramme_des_classes.Verification_IdentiteCriteria ldiagramme_des_classesVerification_IdentiteCriteria = new diagramme_des_classes.Verification_IdentiteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldiagramme_des_classesVerification_IdentiteCriteria.ID_verif.eq();
		System.out.println(ldiagramme_des_classesVerification_IdentiteCriteria.uniqueVerification_Identite());
		
		System.out.println("Retrieving Don by DonCriteria");
		diagramme_des_classes.DonCriteria ldiagramme_des_classesDonCriteria = new diagramme_des_classes.DonCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldiagramme_des_classesDonCriteria.ID_don.eq();
		System.out.println(ldiagramme_des_classesDonCriteria.uniqueDon());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateTPRLFData retrieveAndUpdateTPRLFData = new RetrieveAndUpdateTPRLFData();
			try {
				retrieveAndUpdateTPRLFData.retrieveAndUpdateTestData();
				//retrieveAndUpdateTPRLFData.retrieveByCriteria();
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
