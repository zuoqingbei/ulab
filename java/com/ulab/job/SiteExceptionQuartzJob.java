package com.ulab.job;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.ulab.model.LogModel;

/**
 * 
 * @time   2018年1月25日 下午3:15:40
 * @author zuoqb
 * @todo   站点访问异常监控：比如网站无法访问
 */
public class SiteExceptionQuartzJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		Thread th=new Thread(new Runnable() {
			@Override
			public void run() {
				LogModel.dao.siteException();
			}
		});
		th.start();
		System.out.println("---网站访问异常监控---"+new Date());
	}
}
