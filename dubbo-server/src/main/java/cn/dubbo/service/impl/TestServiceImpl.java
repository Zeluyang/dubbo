package cn.dubbo.service.impl;

import cn.dubbo.service.ITestService;

public class TestServiceImpl implements ITestService {

	@Override
	public String sayHello(String message) {
		System.out.println("service say:" + message);
		return "ok";
	}

}
