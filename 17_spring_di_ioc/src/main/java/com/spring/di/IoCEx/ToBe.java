package com.spring.di.IoCEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component
class ToBeDao{
	
}

@Component
class ToBeService {
	
	@Autowired
	ToBeDao toBeDao;
	
}

@Component
class ToBeController{
	
	@Autowired
	ToBeService toBeService;
	
}

@Component
public class ToBe {
	// IoC컨테이너에 의해서 ToBeDao, ToBeService, ToBeController객체가 생성 및 관리되며 
	// Dao -> Service -> Controller의 순서로 객체가 조립된다.
	
	@Autowired
	ToBeController toBeController;

}
