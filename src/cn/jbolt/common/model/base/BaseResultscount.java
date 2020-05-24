package cn.jbolt.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseResultscount<M extends BaseResultscount<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setBadPeopleNum(java.lang.Integer badPeopleNum) {
		set("badPeopleNum", badPeopleNum);
		return (M)this;
	}
	
	public java.lang.Integer getBadPeopleNum() {
		return getInt("badPeopleNum");
	}

	public M setAllPeopleNum(java.lang.Integer allPeopleNum) {
		set("allPeopleNum", allPeopleNum);
		return (M)this;
	}
	
	public java.lang.Integer getAllPeopleNum() {
		return getInt("allPeopleNum");
	}

	public M setPercent(java.lang.Double percent) {
		set("percent", percent);
		return (M)this;
	}
	
	public java.lang.Double getPercent() {
		return getDouble("percent");
	}

}