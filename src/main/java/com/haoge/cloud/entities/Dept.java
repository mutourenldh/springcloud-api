package com.haoge.cloud.entities;

import java.io.Serializable;

/** 
* @author 李东浩
* @Date：2018年4月29日上午11:56:58
*
*/
//@NoArgsConstructor//为当前实体添加无参构造方法
////@AllArgsConstructor//为当前实体添加全参构造方法
//@Data//为当前实体字段添加set  get方法
//@Accessors(chain=true)//允许当前实体使用链式写法
@SuppressWarnings("serial")
public class Dept implements Serializable{//必须实现序列化
	
	private Long deptno;//主键
	private String dname;//部门名称
	private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDb_source() {
		return db_source;
	}
	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", db_source=" + db_source + "]";
	}
	public Dept(String dname) {
		super();
		this.dname = dname;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
