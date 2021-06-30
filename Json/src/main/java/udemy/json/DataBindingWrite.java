package udemy.json;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyStudent;

public class DataBindingWrite {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		UdemyStudent udemyStudent = new UdemyStudent();
		udemyStudent.setId(1);
		udemyStudent.setName("abhi");
		udemyStudent.setLastname("anand");
		
		UdemyStudent udemyStudent2 = new UdemyStudent();
		udemyStudent2.setId(2);
		udemyStudent2.setName("aditi");
		udemyStudent2.setLastname("ratnam");
		
		try {
			System.out.println(objectMapper.writeValueAsString(udemyStudent));
			System.out.println();
			System.out.println
			(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyStudent));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String, Object> mapJson = new LinkedHashMap<>();
		mapJson.put("key1","value1");
		mapJson.put("key2","value2");
		mapJson.put("key3","value3");
		mapJson.put("booleanTrue",true);
		mapJson.put("Array",new String[] {"1","2","3"});
		mapJson.put("ArrayOfObject",new UdemyStudent[] {udemyStudent,udemyStudent2});
		mapJson.put("nestedObject",udemyStudent);
		mapJson.put("integer",1);
		mapJson.put("valueNull",null);
		mapJson.put("list",Arrays.asList("1","2","9"));
		mapJson.put("Date",LocalDateTime.now().toString());
		
		try {
			System.out.println
			(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapJson));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue
			(new File("src/main/resources/mapJson.json"),mapJson);
		} catch (JsonGenerationException e) {
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
