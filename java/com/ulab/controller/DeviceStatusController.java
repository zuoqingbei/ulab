package com.ulab.controller;

//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
//import java.util.Random;




import com.jfinal.aop.Before;
import com.jfinal.ext.route.ControllerBind;
import com.jfinal.plugin.activerecord.Record;
import com.ulab.aop.GlobalInterceptor;
import com.ulab.core.BaseController;
import com.ulab.model.DeviceStatusModel;
import com.ulab.model.DeviceUseAnalysisModel;
import com.ulab.model.DicModel;
import com.ulab.model.LabMapModel;
//import com.ulab.model.LabModel;
import com.ulab.model.ProviderDicModel;
//import com.ulab.util.JsonUtils;
import com.ulab.util.SqlUtil;

/**
 * @author chen xin
 */
@ControllerBind(controllerKey = "/deviceStatus", viewPath = "/phm")
public class DeviceStatusController extends BaseController {
	//跟据商品实时状态表所关联的phm_device_info sn查询该商品使用信息
	public void getDeviceStatusByDeviceSncode(){
		String sncode=getPara("sncode");
		Record record=DeviceStatusModel.dao.getDeviceStatusByHttp(sncode);
		renderJson(record);
	}
	
	//转到实时状态页面
	public void status() {
		render("status.html");
		
	}

}