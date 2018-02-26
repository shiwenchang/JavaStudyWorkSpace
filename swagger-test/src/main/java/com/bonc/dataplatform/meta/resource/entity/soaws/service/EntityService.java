package com.bonc.dataplatform.meta.resource.entity.soaws.service;




import java.util.Map;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
@RequestMapping("/entityService")

public class EntityService {

	
	@RequestMapping(value = "/deleteEntitys", method = RequestMethod.POST)
	public @ResponseBody Object deleteEntitys(@RequestBody Map parameters) {
		return "test";
	}
	
}
