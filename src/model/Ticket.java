package model;

import java.util.Date;

public class Ticket {
	private Integer tno;
	private String carno;
	private String phone;
	private String grade;
	private String tstat;
	private Date startdate;
	private Date enddate;
	private String startDateStr;
	private String endDateStr;

	public Ticket(Integer tno, String carno, String phone, String grade, String tstat, String startDateStr,
			String endDateStr) {
		super();
		this.tno = tno;
		this.carno = carno;
		this.phone = phone;
		this.grade = grade;
		this.tstat = tstat;
		this.startDateStr = startDateStr;
		this.endDateStr = endDateStr;
	}

	public Ticket(Integer tno, String carno, String phone, String grade, String tstat, Date startdate, Date enddate) {
		super();
		this.tno = tno;
		this.carno = carno;
		this.phone = phone;
		this.grade = grade;
		this.tstat = tstat;
		this.startdate = startdate;
		this.enddate = enddate;
	}

	public Integer getTno() {
		return tno;
	}

	public void setTno(Integer tno) {
		this.tno = tno;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getTstat() {
		return tstat;
	}

	public void setTstat(String tstat) {
		this.tstat = tstat;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getStartDateStr() {
		return startDateStr;
	}

	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}

	public String getEndDateStr() {
		return endDateStr;
	}

	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}

} // end of class
