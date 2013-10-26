package com.jshop.entity;

// Generated 2013-10-26 17:12:40 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GoodsstarCommentT generated by hbm2java
 */
@Entity
@Table(name = "goodsstar_comment_t", catalog = "jshoper3")
public class GoodsstarCommentT implements java.io.Serializable {

	private String starcommentid;
	private String goodsid;
	private int starnum;
	private String userid;
	private Date createtime;

	public GoodsstarCommentT() {
	}

	public GoodsstarCommentT(String starcommentid, String goodsid, int starnum,
			String userid, Date createtime) {
		this.starcommentid = starcommentid;
		this.goodsid = goodsid;
		this.starnum = starnum;
		this.userid = userid;
		this.createtime = createtime;
	}

	@Id
	@Column(name = "STARCOMMENTID", unique = true, nullable = false, length = 20)
	public String getStarcommentid() {
		return this.starcommentid;
	}

	public void setStarcommentid(String starcommentid) {
		this.starcommentid = starcommentid;
	}

	@Column(name = "GOODSID", nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "STARNUM", nullable = false)
	public int getStarnum() {
		return this.starnum;
	}

	public void setStarnum(int starnum) {
		this.starnum = starnum;
	}

	@Column(name = "USERID", nullable = false, length = 20)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
