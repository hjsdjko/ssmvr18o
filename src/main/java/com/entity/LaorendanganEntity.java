package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 老人档案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-16 15:09:25
 */
@TableName("laorendangan")
public class LaorendanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LaorendanganEntity() {
		
	}
	
	public LaorendanganEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 档案编号
	 */
					
	private String danganbianhao;
	
	/**
	 * 老人账号
	 */
					
	private String laorenzhanghao;
	
	/**
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
	/**
	 * 老人性别
	 */
					
	private String laorenxingbie;
	
	/**
	 * 老人年龄
	 */
					
	private String laorennianling;
	
	/**
	 * 老人照片
	 */
					
	private String laorenzhaopian;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 联系地址
	 */
					
	private String lianxidizhi;
	
	/**
	 * 身体状况
	 */
					
	private String shentizhuangkuang;
	
	/**
	 * 身高
	 */
					
	private String shengao;
	
	/**
	 * 体重
	 */
					
	private String tizhong;
	
	/**
	 * 老人当前状态
	 */
					
	private String laorendangqianzhuangtai;
	
	/**
	 * 既往病史
	 */
					
	private String jiwangbingshi;
	
	/**
	 * 紧急联系人姓名
	 */
					
	private String jinjilianxirenxingming;
	
	/**
	 * 紧急联系人号码
	 */
					
	private String jinjilianxirenhaoma;
	
	/**
	 * 紧急联系人关系
	 */
					
	private String jinjilianxirenguanxi;
	
	/**
	 * 居家养老服务范围
	 */
					
	private String jujiayanglaofuwufanwei;
	
	/**
	 * 档案更新日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dangangengxinriqi;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：档案编号
	 */
	public void setDanganbianhao(String danganbianhao) {
		this.danganbianhao = danganbianhao;
	}
	/**
	 * 获取：档案编号
	 */
	public String getDanganbianhao() {
		return danganbianhao;
	}
	/**
	 * 设置：老人账号
	 */
	public void setLaorenzhanghao(String laorenzhanghao) {
		this.laorenzhanghao = laorenzhanghao;
	}
	/**
	 * 获取：老人账号
	 */
	public String getLaorenzhanghao() {
		return laorenzhanghao;
	}
	/**
	 * 设置：老人姓名
	 */
	public void setLaorenxingming(String laorenxingming) {
		this.laorenxingming = laorenxingming;
	}
	/**
	 * 获取：老人姓名
	 */
	public String getLaorenxingming() {
		return laorenxingming;
	}
	/**
	 * 设置：老人性别
	 */
	public void setLaorenxingbie(String laorenxingbie) {
		this.laorenxingbie = laorenxingbie;
	}
	/**
	 * 获取：老人性别
	 */
	public String getLaorenxingbie() {
		return laorenxingbie;
	}
	/**
	 * 设置：老人年龄
	 */
	public void setLaorennianling(String laorennianling) {
		this.laorennianling = laorennianling;
	}
	/**
	 * 获取：老人年龄
	 */
	public String getLaorennianling() {
		return laorennianling;
	}
	/**
	 * 设置：老人照片
	 */
	public void setLaorenzhaopian(String laorenzhaopian) {
		this.laorenzhaopian = laorenzhaopian;
	}
	/**
	 * 获取：老人照片
	 */
	public String getLaorenzhaopian() {
		return laorenzhaopian;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：联系地址
	 */
	public void setLianxidizhi(String lianxidizhi) {
		this.lianxidizhi = lianxidizhi;
	}
	/**
	 * 获取：联系地址
	 */
	public String getLianxidizhi() {
		return lianxidizhi;
	}
	/**
	 * 设置：身体状况
	 */
	public void setShentizhuangkuang(String shentizhuangkuang) {
		this.shentizhuangkuang = shentizhuangkuang;
	}
	/**
	 * 获取：身体状况
	 */
	public String getShentizhuangkuang() {
		return shentizhuangkuang;
	}
	/**
	 * 设置：身高
	 */
	public void setShengao(String shengao) {
		this.shengao = shengao;
	}
	/**
	 * 获取：身高
	 */
	public String getShengao() {
		return shengao;
	}
	/**
	 * 设置：体重
	 */
	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}
	/**
	 * 获取：体重
	 */
	public String getTizhong() {
		return tizhong;
	}
	/**
	 * 设置：老人当前状态
	 */
	public void setLaorendangqianzhuangtai(String laorendangqianzhuangtai) {
		this.laorendangqianzhuangtai = laorendangqianzhuangtai;
	}
	/**
	 * 获取：老人当前状态
	 */
	public String getLaorendangqianzhuangtai() {
		return laorendangqianzhuangtai;
	}
	/**
	 * 设置：既往病史
	 */
	public void setJiwangbingshi(String jiwangbingshi) {
		this.jiwangbingshi = jiwangbingshi;
	}
	/**
	 * 获取：既往病史
	 */
	public String getJiwangbingshi() {
		return jiwangbingshi;
	}
	/**
	 * 设置：紧急联系人姓名
	 */
	public void setJinjilianxirenxingming(String jinjilianxirenxingming) {
		this.jinjilianxirenxingming = jinjilianxirenxingming;
	}
	/**
	 * 获取：紧急联系人姓名
	 */
	public String getJinjilianxirenxingming() {
		return jinjilianxirenxingming;
	}
	/**
	 * 设置：紧急联系人号码
	 */
	public void setJinjilianxirenhaoma(String jinjilianxirenhaoma) {
		this.jinjilianxirenhaoma = jinjilianxirenhaoma;
	}
	/**
	 * 获取：紧急联系人号码
	 */
	public String getJinjilianxirenhaoma() {
		return jinjilianxirenhaoma;
	}
	/**
	 * 设置：紧急联系人关系
	 */
	public void setJinjilianxirenguanxi(String jinjilianxirenguanxi) {
		this.jinjilianxirenguanxi = jinjilianxirenguanxi;
	}
	/**
	 * 获取：紧急联系人关系
	 */
	public String getJinjilianxirenguanxi() {
		return jinjilianxirenguanxi;
	}
	/**
	 * 设置：居家养老服务范围
	 */
	public void setJujiayanglaofuwufanwei(String jujiayanglaofuwufanwei) {
		this.jujiayanglaofuwufanwei = jujiayanglaofuwufanwei;
	}
	/**
	 * 获取：居家养老服务范围
	 */
	public String getJujiayanglaofuwufanwei() {
		return jujiayanglaofuwufanwei;
	}
	/**
	 * 设置：档案更新日期
	 */
	public void setDangangengxinriqi(Date dangangengxinriqi) {
		this.dangangengxinriqi = dangangengxinriqi;
	}
	/**
	 * 获取：档案更新日期
	 */
	public Date getDangangengxinriqi() {
		return dangangengxinriqi;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
