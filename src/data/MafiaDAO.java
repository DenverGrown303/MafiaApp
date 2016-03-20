package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javaClasses.Soldier;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class MafiaDAO {
	private static final String fileFIRSTNAME = "WEB-INF/mafiaFirstName.csv";
	private static final String fileLASTNAME = "WEB-INF/mafiaLastNames.csv";
	private static final String fileSPECIALTIES = "WEB-INF/mafiaSpecialties.csv";
	private static final String filePRIORS = "WEB-INF/mafiaPriors.csv";
	private static final String fileNICKNAMES = "WEB-INF/mafiaNickNames.csv";
	private static final String fileQUOTE = "WEB-INF/mafiaQuotes.csv";
	private static final String fileEMAILSUBJECTS = "WEB-INF/mafiaEmailSubjects.csv";
	private static final String fileEMAILBODY = "WEB-INF/mafiaEmailBody.csv";
	private static final String fileEMAILCLOSER = "WEB-INF/mafiaEmailClosers.csv";
	private static final String fileFAMILYCOLOROPTIONS = "WEB-INF/mafiaFamilyColors.csv";

	private List<String> firstNameDB = new ArrayList<>();
	private List<String> lastNameDB = new ArrayList<>();
	private List<String> specialtyDB = new ArrayList<>();
	private List<String> priorsDB = new ArrayList<>();
	private List<String> nickNamesDB = new ArrayList<>();
	private List<String> imageDB = new ArrayList<>();
	private List<String> quoteDB = new ArrayList<>();
	private List<String> emailSubjectDB = new ArrayList<>();
	private List<String> emailBodyDB = new ArrayList<>();
	private List<String> emailCloserDB = new ArrayList<>();
	private List<String> colorDB = new ArrayList<>();

	@Autowired
	private ApplicationContext ac;

	@PostConstruct
	public void init() {
		loadFirstNames();
		loadLastNames();
		loadPriors();
		loadSpecialties();
		loadNickNames();
		loadQuotes();
		loadEmailSubjects();
		loadEmailBodies();
		loadEmailClosers();
		loadFamilyColorOptions();
	}

	public void loadFamilyColorOptions() {
		InputStream is;
		try {
			is = ac.getResource(fileFAMILYCOLOROPTIONS).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String color : tokens) {
					colorDB.add(color);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

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

	public void loadQuotes() {
		InputStream is;
		try {
			is = ac.getResource(fileQUOTE).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String quote : tokens) {
					quoteDB.add(quote);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadFirstNames() {
		InputStream is;
		try {
			is = ac.getResource(fileFIRSTNAME).getInputStream();
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

	public void loadLastNames() {
		InputStream is;
		try {
			is = ac.getResource(fileLASTNAME).getInputStream();
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

	public void loadPriors() {
		InputStream is;
		try {
			is = ac.getResource(filePRIORS).getInputStream();
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

	public void loadSpecialties() {
		InputStream is;
		try {
			is = ac.getResource(fileSPECIALTIES).getInputStream();
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

	public void loadNickNames() {
		InputStream is;
		try {
			is = ac.getResource(fileNICKNAMES).getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				for (String nickName : tokens) {
					nickNamesDB.add(nickName);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Soldier> roguesGalleryMe() {
		List<Soldier> Soldiers = new ArrayList<>();
		for (int i = 0; i < 10001; i++) {
			Soldier aaron = new Soldier();
			int nameX = (int) (1 + (Math.random() * firstNameDB.size()));
			int nameY = (int) (1 + Math.random() * lastNameDB.size());
			aaron.setName(firstNameDB.get(nameX) + " " + lastNameDB.get(nameY));
			aaron.setCapoName("Default");

			int specialtyX = (int) (1 + Math.random() * specialtyDB.size());
			aaron.setSpecialty(specialtyDB.get(specialtyX));

			List<String> priors = new ArrayList<>();
			int priorsNum = (int) (1 + Math.random() * 10);
			for (int j = 0; j < priorsNum; j++) {
				int priorsY = (int) (1 + Math.random() * priorsDB.size());
				priors.add(priorsDB.get(priorsY));
			}
			aaron.setPriors(priors);
			Soldiers.add(aaron);
		}
		return Soldiers;
	}
}
