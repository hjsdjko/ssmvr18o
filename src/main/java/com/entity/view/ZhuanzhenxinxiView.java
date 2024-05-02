package com.entity.view;

import com.entity.ZhuanzhenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 转诊信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 15:09:25
 */
@TableName("zhuanzhenxinxi")
public class ZhuanzhenxinxiView  extends ZhuanzhenxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanzhenxinxiView(){
	}
 
 	public ZhuanzhenxinxiView(ZhuanzhenxinxiEntity zhuanzhenxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanzhenxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
