package in.touriga.tourigabackend.model;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Bookingdetails")
public class Booking {
	@Id
    private String bookingid;
    private String name;
    private String emailid;
    private String tripdate;
    private LocalDate bookingdate=LocalDate.now();
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getTripdate() {
		return tripdate;
	}
	public void setTripdate(String tripdate) {
		this.tripdate = tripdate;
	}
	public LocalDate getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(LocalDate bookingdate) {
		this.bookingdate = bookingdate;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public Integer getElderscount() {
		return elderscount;
	}
	public void setElderscount(Integer elderscount) {
		this.elderscount = elderscount;
	}
	public Integer getChildrencount() {
		return childrencount;
	}
	public void setChildrencount(Integer childrencount) {
		this.childrencount = childrencount;
	}
	public String getSplreq() {
		return splreq;
	}
	public String getBookingid() {
		return bookingid;
	}
	public void setBookingid(String bookingid) {
		this.bookingid = bookingid;
	}
	public void setSplreq(String splreq) {
		this.splreq = splreq;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPackageid() {
		return packageid;
	}
	public void setPackageid(String packageid) {
		this.packageid = packageid;
	}
	private Long phoneno;
    private Integer elderscount;
    private Integer childrencount;
    private String splreq;
    private String userid;
    private String packageid;
}