package com.entity.view;

import com.entity.FuwujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服务记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 15:09:25
 */
@TableName("fuwujilu")
public class FuwujiluView  extends FuwujiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwujiluView(){
	}
 
 	public FuwujiluView(FuwujiluEntity fuwujiluEntity){
 	try {
			BeanUtils.copyProperties(this, fuwujiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
