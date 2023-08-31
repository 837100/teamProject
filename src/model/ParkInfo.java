package model;

import java.util.Date;

public class ParkInfo {
	private Integer parkno;
	private String carno;
	private String grade;
	private String tstat;
	private Date indate;
	private Date outdate;

	public ParkInfo(Integer parkno, String carno, String grade, String tstat, Date indate, Date outdate) {
		super();
		this.parkno = parkno;
		this.carno = carno;
		this.grade = grade;
		this.tstat = tstat;
		this.indate = indate;
		this.outdate = outdate;
	}

	public Integer getParkno() {
		return parkno;
	}

	public void setParkno(Integer parkno) {
		this.parkno = parkno;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
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

	public Date getIndate() {
		return indate;
	}

	public void setIndate(Date indate) {
		this.indate = indate;
	}

	public Date getOutdate() {
		return outdate;
	}

	public void setOutdate(Date outdate) {
		this.outdate = outdate;
	}

}
