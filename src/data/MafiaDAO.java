package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import javaClasses.Family;
import javaClasses.Game;
import javaClasses.Job;
import javaClasses.Member;
import javaClasses.Prior;
import javaClasses.User;
import javaClasses.UserMessage;

@Transactional
public class MafiaDAO {

	@PersistenceContext
	private EntityManager em;
	
	private static int gameID;
	private static final String fileFIRSTNAME = "WEB-INF/mafiaFirstName.csv";
	private static final String fileLASTNAME = "WEB-INF/mafiaLastNames.csv";
	private static final String fileSPECIALTIES = "WEB-INF/mafiaSpecialties.csv";
	private static final String filePRIORS = "WEB-INF/mafiaPriors.csv";
	private static final String fileEMAILSUBJECTS = "WEB-INF/mafiaEmailSubjects.csv";
	private static final String fileEMAILBODY = "WEB-INF/mafiaEmailBody.csv";
	private static final String fileEMAILCLOSER = "WEB-INF/mafiaEmailClosers.csv";
	private static final String fileIMAGE = "WEB-INF/mafiaImages.csv";
	private static final String fileFAMILYNAME = "WEB-INF/mafiaFamilyNames.csv";
	private static final String fileJOBDESCRIPTION = "WEB-INF/mafiaJobDescriptions.csv";
	private static final String fileJOBCONSEQUENCES = "WEB-INF/mafiaJobConsequences.csv";

	private List<String> firstNameDB = new ArrayList<>();
	private List<String> lastNameDB = new ArrayList<>();
	private List<String> specialtyDB = new ArrayList<>();
	private List<String> priorsDB = new ArrayList<>();
	private List<String> imageDB = new ArrayList<>();
	private List<String> emailSubjectDB = new ArrayList<>();
	private List<String> emailBodyDB = new ArrayList<>();
	private List<String> emailCloserDB = new ArrayList<>();
	private List<String> familyNameDB = new ArrayList<>();
	private List<String> jobDescriptionsDB = new ArrayList<>();
	private List<String> jobConsequencesDB = new ArrayList<>();
	private List<String> imageLocationDB = new ArrayList<>();
	private List<String> jobsDB = new ArrayList<>();
	

	@Autowired
	private ApplicationContext ac;

	@PostConstruct
	public void init() {
		loadFirstNames();
		loadLastNames();
		loadPriors();
		loadSpecialties();
		loadEmailSubjects();
		loadEmailBodies();
		loadEmailClosers();
		// TODO:create a load images method
		// loadImages();
		loadFamilyNames();
		loadJobConsequences();
		loadJobDescriptions();
	}

	// loading the list of potential first names
	public void loadFirstNames() {
		try {
			InputStream is = ac.getResource(fileFIRSTNAME).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String firstName : tokens) {
					firstNameDB.add(firstName);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// loading the list of potential last names
	public void loadLastNames() {
		try {
			InputStream is = ac.getResource(fileLASTNAME).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String lastName : tokens) {
					lastNameDB.add(lastName);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// loading the list of potential family names
	public void loadFamilyNames() {

		try {
			InputStream is = ac.getResource(fileFAMILYNAME).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String familyName : tokens) {
					familyNameDB.add(familyName);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// loading the list of potential specializiations
	public void loadSpecialties() {
		try {
			InputStream is = ac.getResource(fileSPECIALTIES).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String specialty : tokens) {
					specialtyDB.add(specialty);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// loading the list of potential priors
	public void loadPriors() {
		try {
			InputStream is = ac.getResource(filePRIORS).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String prior : tokens) {
					priorsDB.add(prior);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// loading the various components to be blended into emails
	public void loadEmailSubjects() {
		InputStream is;
		try {
			is = ac.getResource(fileEMAILSUBJECTS).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String subject : tokens) {
					emailSubjectDB.add(subject);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// still email parts
	public void loadEmailClosers() {
		InputStream is;
		try {
			is = ac.getResource(fileEMAILCLOSER).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String closer : tokens) {
					emailCloserDB.add(closer);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// more modular email parts
	public void loadEmailBodies() {
		InputStream is;
		try {
			is = ac.getResource(fileEMAILBODY).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String body : tokens) {
					emailBodyDB.add(body);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// loading potential job descriptions
	public void loadJobDescriptions() {
		InputStream is;
		try {
			is = ac.getResource(fileJOBDESCRIPTION).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String description : tokens) {
					jobDescriptionsDB.add(description);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// loading potential job consequences
	public void loadJobConsequences() {
		InputStream is;
		try {
			is = ac.getResource(fileJOBCONSEQUENCES).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String consequence : tokens) {
					jobConsequencesDB.add(consequence);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// create 10,000 randomized potential mafia dudes from which we'll draw our
	// family
	public void fillReserves() {
		for (int i = 0; i < 10001; i++) {
			Member aaron = new Member();

			// random numbers for index positions of names in an array list
			int nameX = (int) (1 + Math.random() * firstNameDB.size());
			int nameY = (int) (1 + Math.random() * lastNameDB.size());
			aaron.setFirstName(firstNameDB.get(nameX));
			aaron.setLastName(lastNameDB.get(nameY));

			// specialty
			int specialtyX = (int) (1 + Math.random() * specialtyDB.size());
			aaron.setSpecialty(specialtyDB.get(specialtyX));

			// imageLocationForRandomizedHeadshots
			int imageLocationX = (int) (1 + Math.random() * imageLocationDB.size());
			aaron.setImageLocation(imageLocationDB.get(imageLocationX));

			// age
			int age = (int) (35 + Math.random() * 25);
			aaron.setAge(age);
			em.merge(aaron);
			em.persist(aaron);
		}
	}

	// staff a family with One Don, Three Capos with 25 soldiers each
	public void staffFamily(){
    try{
    	for(int i = 0; i < 1; i++){
    		String gameIDString = em.createNamedQuery("Game.GetGameID").toString();
    		int gameID = Integer.parseInt(gameIDString);
    		this.gameID = gameID;
    		Family familyName = (Family) em.createNamedQuery("Family.GetFamilyNameByGameID", Family.class).setParameter("x", gameID);
    		Member vito = (Member) em.createNamedQuery("Member.GetNextUnassignedMember", Member.class).setParameter("number",i + 1);
    		vito.setRank("Don");
    		vito.setFamilyName(familyName.getFamilyName());
    		vito.setCapoFirstName(null);
    		vito.setCapoLastName(null);
    		em.merge(vito);
    		em.persist(vito);
    	}
    }catch(NoResultException | NullPointerException npe){
        npe.printStackTrace();;
    }
        for(int j = 0; j < 4; j++){
          try{
            Member tessio = (Member) em.createNamedQuery("Member.GetNextUnassignedMember", Member.class).setParameter("number", j + 1);
    		Family familyName = (Family) em.createNamedQuery("Family.GetFamilyNameByGameID", Family.class).setParameter("x", this.gameID);
            
    		tessio.setFamilyName(familyName.getFamilyName());
            tessio.setRank("Caporegime");
            tessio.setCapoFirstName(null);
            tessio.setCapoLastName(null);
              em.merge(tessio);
              em.persist(tessio);
            }catch(NoResultException | NullPointerException nre){
              nre.printStackTrace();
            }
            for(int k = 0; k < 25; k++){
              try{
                Member paulie = (Member) em.createNamedQuery("Member.GetNextUnassignedMember", Member.class).setParameter("number", k * 10);
        		Family familyName = (Family) em.createNamedQuery("Family.GetFamilyNameByGameID", Family.class).setParameter("x", this.gameID);

                paulie.setFamilyName(familyName.getFamilyName());
                paulie.setRank("Soldier");
                //TODO: need a way of setting our capo's name using previous for block
                //paulie.setCapoFirstName(tessio.getFirstName());
                //paulie.setCapoLastName(tessio.getLastName());
                em.merge(paulie);
                em.persist(paulie);
              }catch(NoResultException | NullPointerException nre){
                nre.printStackTrace();
              }
          }
       }
    }

	// new Message method: unwieldy but allows for a user-to-user messaging
	// system if we want
	public void newEmail(String userName, String subject, String body, String closer, String recipientFirstName,
			String recipientLastName, int gameID, int userID) {
		UserMessage newMessage = new UserMessage();
		newMessage.setSenderFirstName("Mr/Ms");
		newMessage.setSenderLastName(userName);
		newMessage.setRecipientFirstName(recipientFirstName);
		newMessage.setRecipientLastName(recipientLastName);
		newMessage.setSubject(subject);
		newMessage.setBody(body);
		newMessage.setCloser(closer);
		newMessage.setGameID(gameID);
		newMessage.setUserID(userID);
	}

	// write a bunch of emails
	public void writeEmails(){
    try{
      for(int i = 0; i < 10000; i++){
        int subjectX = (int)(1 + Math.random() * emailSubjectDB.size());
        int bodyX = (int)(1 + Math.random() * emailBodyDB.size());
        int closerX = (int)(1 + Math.random () * emailCloserDB.size());

        UserMessage newMessage = new UserMessage();
        newMessage.setSubject(emailSubjectDB.get(subjectX));
        newMessage.setBody(emailBodyDB.get(bodyX));
        newMessage.setCloser(emailCloserDB.get(closerX));

        for(int j = 0; j < 80; j++){
          int whyNot = (int)(Math.random() * 80);
          int sureLets = (int) (Math.random() * 80);
          try{
        	  String senderFirstName = em.createNamedQuery("Member.GetFirstName", Member.class).setParameter("soldierNumber", whyNot).toString();
        	  String senderLastName = em.createNamedQuery("Member.GetLastName", Member.class).setParameter("soldierNumber", whyNot).toString();
        	  String recipientFirstName = em.createNamedQuery("Member.GetFirstName", Member.class).setParameter("soldierNumber", sureLets).toString();
        	  String recipientLastName = em.createNamedQuery("Member.getLastNane", Member.class).setParameter("soldierNumber", sureLets).toString();         
        	  
        	  newMessage.setSenderFirstName(senderFirstName);
        	  newMessage.setSenderLastName(senderLastName);
        	  newMessage.setRecipientFirstName(recipientFirstName);
        	  newMessage.setRecipientLastName(recipientLastName);
        	  
          }catch(NoResultException | NullPointerException nre){
        	  nre.printStackTrace();
          }
          em.merge(newMessage);
          em.persist(newMessage);
        }
      }
    }catch (NoResultException | NullPointerException nre){
    	nre.printStackTrace();
    }
  }

	// take potential priors from DB to distrubute
	public void fillPriors() {
		try {
			for (int i = 0; i < priorsDB.size(); i++) {
				Prior prior = new Prior();
				prior.setPrior(priorsDB.get(i));
				for (int k = 0; k < 80; k++) {
					int x = (int) (1 + Math.random() * 10);
					if (x == 3 || x == 6 || x == 9) {
						Member newGuy = (Member)em.createNamedQuery("Member.GetName", Member.class).setParameter("number", k);
						prior.setFirstName(newGuy.getFirstName());
						prior.setLastName(newGuy.getLastName());
						em.merge(prior);
						em.persist(prior);
					}
				}
			}
		} catch (NoResultException | NullPointerException nre) {
			nre.printStackTrace();
		}
	}

	// creates 150 random "pending jobs" without an assigned goon yet
	public void fillJobs() {
		for (int i = 0; i < 151; i++) {
			int descriptionX = (int) (1 + Math.random() * jobDescriptionsDB.size());
			int consequenceX = (int) (1 + Math.random() * jobConsequencesDB.size());

			Job newJob = new Job();
			newJob.setRequest(jobDescriptionsDB.get(descriptionX));
			newJob.setConsequence(jobConsequencesDB.get(consequenceX));
			newJob.setGoonFirstName(null);
			newJob.setGoonLastName(null);
			em.merge(newJob);
			em.persist(newJob);
		}
	}

	// randomly accomplish tasks
	public void doAJob(){
      try{
        int jobX = (int)(1 + Math.random() * 150);
        int memberX = (int)(Math.random() * 80);
        Job doneJob = new Job();
        Member goon = new Member();

        goon = (Member)em.createNamedQuery("Member.GetRandomMember", Member.class).setParameter("soldierNumber", memberX);
        doneJob = (Job) em.createNamedQuery("Job.GetNextJob", Job.class).setParameter("jobNumber", jobX);
        doneJob.setGoonFirstName(goon.getFirstName());
        doneJob.setGoonLastName(goon.getLastName());

        em.merge(doneJob);
        em.persist(doneJob);
      }catch (NoResultException | NullPointerException nre){
    	  nre.printStackTrace();
      }
    }

	// this'll allow me to make an entirely custom job via text inputs at the
	// front end
	public void orderCustomJob(int userID, int gameID, String request, String consequence) {
		Job newJob = new Job();
		newJob.setUserID(userID);
		newJob.setGameID(gameID);
		newJob.setRequest(request);
		newJob.setConsequence(consequence);
		em.merge(newJob);
		em.persist(newJob);
	}

	// this will generate a single random job
	public void randomJob() {
		Job newJob = new Job();
		int jobX = (int) (1 + Math.random() * jobsDB.size());
		int consequenceX = (int) (1 + Math.random() * jobConsequencesDB.size());

		try {
			
			String gameIDString = em.createNamedQuery("Game.GetGameID", Game.class).toString();
			String userIDString = em.createNamedQuery("Game.GetUserID", Game.class).toString();
			int gameID = Integer.parseInt(gameIDString);
			int userID = Integer.parseInt(userIDString);
			newJob.setUserID(userID);
			newJob.setRequest(jobsDB.get(jobX));
			newJob.setConsequence(jobConsequencesDB.get(consequenceX));
			newJob.setGameID(gameID);
		} catch (NoResultException | NullPointerException nre) {
			nre.printStackTrace();
		}
		em.merge(newJob);
		em.persist(newJob);
	}

	// This method kills the don, and promotes a chain of successors to ensure
	// every spot is filled
	public void killTheDon(){
      Member michael = new Member();
      Member sal = new Member();
      Member rocco = new Member();
      Member theNewKid = new Member();
      try{
          michael =(Member) em.createNamedQuery("Member.GetByRank", Member.class).setParameter("rank", "Don");
          sal = (Member) em.createNamedQuery("Member.GetByRank", Member.class).setParameter("rank", "Caporegime").getSingleResult();
          rocco = (Member) em.createNamedQuery("Member.GetSoldiersByCapo", Member.class).setParameter("capoFirstName", sal.getFirstName()).setParameter("capoLastName", sal.getLastName()).getSingleResult();
          theNewKid = (Member) em.createNamedQuery("Member.GetNextUnassignedMember", Member.class).getSingleResult();
      }catch (NoResultException | NullPointerException nre){
        nre.printStackTrace();
      }

      michael.setRank("Dead");
      em.merge(michael);
      em.persist(michael);

      sal.setRank("Don");
      em.merge(sal);
      em.persist(sal);

      rocco.setRank("Caporegime");
      rocco.setCapoFirstName(null);
      rocco.setCapoLastName(null);
      em.merge(rocco);
      em.persist(rocco);

      theNewKid.setRank("Soldier");
      theNewKid.setFamilyName(rocco.getFamilyName());
      theNewKid.setCapoFirstName(rocco.getFirstName());
      theNewKid.setCapoLastName(rocco.getLastName());
      em.merge(theNewKid);
      em.merge(theNewKid);
    }

	// Creates new user, starts a chain reaction that calls all the methods
	// written above
	public void createNewUser(String userName, String password){
      //All things I'm gonna create here
        User newUser = new User();
        Game newGame = new Game();
        Family newFamily = new Family();

      //Some randos I need
        int gameID = (int)(1 + Math.random() * 10000);
        int userID = (int)(1 + Math.random() * 100);
        int familyNameRandomTicket = (int)(1 + Math.random() * familyNameDB.size());

      //Step One: The user getting created first, and merged/persisted
        newUser.setUserName(userName);
        newUser.setPassword(password);
        newUser.setGameID(gameID);
        newUser.setUserID(userID);
        em.merge(newUser);
        em.persist(newUser);

      //Step Two: We have a new Game created
        newGame.setGameID(gameID);
        newGame.setUserID(userID);
        em.merge(newGame);
        em.persist(newGame);

      //Step Three: We bring all the content in from the csv files and spread it around
        writeEmails();
        fillPriors();
        fillReserves();
        fillJobs();

      //Step Four: Create a family, which really just reserves a family name
        newFamily.setGameID(gameID);
        newFamily.setFamilyName(familyNameDB.get(familyNameRandomTicket));
        em.merge(newFamily);
        em.persist(newFamily);

      //Step Five: staff user's particular mafia family
        staffFamily();
    }
}
