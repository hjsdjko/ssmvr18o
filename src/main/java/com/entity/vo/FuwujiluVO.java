package com.entity.vo;

import com.entity.FuwujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 服务记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-16 15:09:25
 */
public class FuwujiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 老人姓名
	 */
	
	private String laorenxingming;
		
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
	 * 服务目的
	 */
	
	private String fuwumude;
		
	/**
	 * 生活物品需求
	 */
	
	private String shenghuowupinxuqiu;
		
	/**
	 * 药品需求
	 */
	
	private String yaopinxuqiu;
		
	/**
	 * 食品需求
	 */
	
	private String shipinxuqiu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 下单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiadanshijian;
		
	/**
	 * 人员账号
	 */
	
	private String renyuanzhanghao;
		
	/**
	 * 人员姓名
	 */
	
	private String renyuanxingming;
		
	/**
	 * 人员类型
	 */
	
	private String renyuanleixing;
		
	/**
	 * 手机号
	 */
	
	private String shoujihao;
		
	/**
	 * 完成时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date wanchengshijian;
				
	
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
	 * 设置：服务目的
	 */
	 
	public void setFuwumude(String fuwumude) {
		this.fuwumude = fuwumude;
	}
	
	/**
	 * 获取：服务目的
	 */
	public String getFuwumude() {
		return fuwumude;
	}
				
	
	/**
	 * 设置：生活物品需求
	 */
	 
	public void setShenghuowupinxuqiu(String shenghuowupinxuqiu) {
		this.shenghuowupinxuqiu = shenghuowupinxuqiu;
	}
	
	/**
	 * 获取：生活物品需求
	 */
	public String getShenghuowupinxuqiu() {
		return shenghuowupinxuqiu;
	}
				
	
	/**
	 * 设置：药品需求
	 */
	 
	public void setYaopinxuqiu(String yaopinxuqiu) {
		this.yaopinxuqiu = yaopinxuqiu;
	}
	
	/**
	 * 获取：药品需求
	 */
	public String getYaopinxuqiu() {
		return yaopinxuqiu;
	}
				
	
	/**
	 * 设置：食品需求
	 */
	 
	public void setShipinxuqiu(String shipinxuqiu) {
		this.shipinxuqiu = shipinxuqiu;
	}
	
	/**
	 * 获取：食品需求
	 */
	public String getShipinxuqiu() {
		return shipinxuqiu;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：下单时间
	 */
	 
	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	
	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
	}
				
	
	/**
	 * 设置：人员账号
	 */
	 
	public void setRenyuanzhanghao(String renyuanzhanghao) {
		this.renyuanzhanghao = renyuanzhanghao;
	}
	
	/**
	 * 获取：人员账号
	 */
	public String getRenyuanzhanghao() {
		return renyuanzhanghao;
	}
				
	
	/**
	 * 设置：人员姓名
	 */
	 
	public void setRenyuanxingming(String renyuanxingming) {
		this.renyuanxingming = renyuanxingming;
	}
	
	/**
	 * 获取：人员姓名
	 */
	public String getRenyuanxingming() {
		return renyuanxingming;
	}
				
	
	/**
	 * 设置：人员类型
	 */
	 
	public void setRenyuanleixing(String renyuanleixing) {
		this.renyuanleixing = renyuanleixing;
	}
	
	/**
	 * 获取：人员类型
	 */
	public String getRenyuanleixing() {
		return renyuanleixing;
	}
				
	
	/**
	 * 设置：手机号
	 */
	 
	public void setShoujihao(String shoujihao) {
		this.shoujihao = shoujihao;
	}
	
	/**
	 * 获取：手机号
	 */
	public String getShoujihao() {
		return shoujihao;
	}
				
	
	/**
	 * 设置：完成时间
	 */
	 
	public void setWanchengshijian(Date wanchengshijian) {
		this.wanchengshijian = wanchengshijian;
	}
	
	/**
	 * 获取：完成时间
	 */
	public Date getWanchengshijian() {
		return wanchengshijian;
	}
			
}
