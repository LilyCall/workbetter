package cn.itcast.bos.service.quartz.job;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.bos.service.take_delivery.PromotionService;

public class PromotionJob implements Job {
	@Autowired
	private PromotionService promotionService;

	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println("活期过程执行中~~~~");
		
		promotionService.updateStatus(new Date());
	}

}
