package inspection.model;
import java.util.Date;

public class Inspection {
    
	private String inspectionID;
    private Date inspectionDate;
    private String inspectionDescription;
    private String outcome;
	
    public Inspection() {
    	setInspectionDate(new Date());
    }
    
    //Set inspection id
	public void setInspectionID(String id) {
		this.inspectionID = id;
	}
    
	//Get inspection id
	public String getInspectionID() {
		return this.inspectionID;
	}
	
	//Set inspection date
	public void setInspectionDate(Date d) {
		this.inspectionDate = d;
	}
	
	//Get inspection date
	public Date getInspectionDate() {
		return this.inspectionDate;
	}
	
	//Set inspection description
	public void setInspectionDescription(String s) {
		this.inspectionDescription = s;
	}
	
	//Get inspection description
	public String getInspectionDescription() {
		return this.inspectionDescription;
	}
	
	//Set inspection outcome
	public void setInspectionOutcome(String s) {
		this.outcome = s;
	}
	
	//Get inspection outcome
	public String getInspectionOutcome() {
		return this.outcome;
	}
	
	/*
	public String toString() {
		String id = "ID: " + this.inspectionID;
		String date = "Date: " + this.inspectionDate.toString();
		String desc = "Description: " + this.inspectionDescription;
		String out = "Outcome: " + this.outcome;
		return id + "\n" + date + "\n" + desc + "\n" + out;
	}
	*/
    
}

