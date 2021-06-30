package com.mbb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping(value="/users")
public class UserController {
	
	@RequestMapping(value = "/user/{text}", method= RequestMethod.GET)
	public ModelAndView Index(@PathVariable("text") String text )
	{
		int len=text.length();		
		return new ModelAndView("welcomePage","welcome",
				"the length of string "+text+" is "+len);
	}

	@RequestMapping(value = { "getcoll" }, method = RequestMethod.GET) //produces = "application/json")
	@ResponseBody
	public int stringLength(@RequestBody String defnId )
	{
		String strn="amardeep";
		int length=strn.length();
		System.out.println(length);
		return length;
	}
	
	/*
	 * @RequestMapping(value = { "getcollmappingdefn" }, method =RequestMethod.POST, produces = "application/json")
	 * @ResponseBody public CollateralMappingDefinition getCollateralMappingDefn(@RequestBody Long collMapDefnId) {
	 * CollateralMappingDefinition collateralMappingDefinition = null;
	 * LOGGER.debug(String.format(BsmConstants.LOGGERKEY, "getCollateralMappingDefn", collMapDefnId)); 
	 * try {
	 * collateralMappingDefinition = collateralMappingService.getCollateralMappingDefn(collMapDefnId); 
	 * } catch(Exception exception) 
	 * { 
	 * LOGGER.error(String.format("Error During getCollateralMappingDefn CollateralMappingRestController %s"
	 * , exception)); } 
	 * return null; }
	 */	 
	
	
	
}
