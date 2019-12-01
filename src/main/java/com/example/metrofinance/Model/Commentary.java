package com.example.metrofinance.Model;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commentary")
public class Commentary implements Serializable {
 
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(columnDefinition = "serial")
	public long id;
 
	@Column(name = "stk_name")
	public String stkname;
	@Column(name = "b_house")
	public String bhouse;
	public String target;
	public String updated_on;
	public String content;
	public String reportid;
	public String page;
	
 
	protected Commentary() {
	}
 
	public Commentary(String stk_name, String b_house, String target, String updated_on,String content, String reportid, String page) {
		this.stkname = stk_name;
		this.bhouse = b_house;
		this.target = target;
		this.updated_on = updated_on;
		this.content = content;
		this.reportid = reportid;
		this.page = page;
		
		
	}
 
	
	public String getstkname() {
        return stkname;
    }
    public void setstkname(String stk_name) {
        this.stkname = stk_name;
    }
    public String getbhouse() {
        return bhouse;
    }
    public void setbhouse(String b_house) {
        this.bhouse = b_house;
    }
    public String gettarget() {
        return target;
    }
    public void settarget(String target) {
        this.target = target;
    }
    public String getupdated_on() {
        return updated_on;
    }
    public void setupdated_on(String updated_on) {
        this.updated_on = updated_on;
    }
    
    public String getcontent() {
        return content;
    }
    public void setcontent(String content) {
        this.content = content;
    }
    
    public String getreportid() {
        return reportid;
    }
    public void setreportid(String reportid) {
        this.reportid = reportid;
    }
    public String getpage() {
        return page;
    }
    public void setpage(String page) {
        this.page = page;
    }
    
    
}
