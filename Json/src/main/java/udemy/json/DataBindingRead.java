package udemy.json;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyStudent;

public class DataBindingRead {
	
	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		String udemyStudent = "{" +
				  "\"id\" : 1," +
				  "\"name\" : \"abhi\"," +
				  "\"lastname\" : \"anand\""+
				"}";
		
		try {
			UdemyStudent udemyStudent1 = objectMapper.readValue(udemyStudent, UdemyStudent.class);
			System.out.println("id: "+ udemyStudent1.getId());
			System.out.println("name: "+ udemyStudent1.getName());
			System.out.println("lastname: "+ udemyStudent1.getLastname());
			
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ClassLoader classLoader = DataBindingRead.class.getClassLoader();
		
		try {
			Map<String,Object> mapJson = objectMapper.readValue(new File(classLoader.getResource(
					"mapJson.json").getFile()), new TypeReference<Map<String,Object>>(){
				}
			);
			System.out.println(mapJson);
			for(Map.Entry<String, Object> entry : mapJson.entrySet()) {
				System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
