package udemy.json;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import udemy.json.domain.UdemyLecture;
import udemy.json.domain.UdemyLecture.FREE_PREVIEW;
import udemy.json.domain.UdemyLecture.QuizQuestion;
public class DataBindingWriteAnnotations {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		UdemyLecture udemyLecture = new UdemyLecture();
		udemyLecture.setId(1);
		udemyLecture.setName("json udemy course");
		udemyLecture.setNameLine2("json line 2");
		udemyLecture.setDesc("json udemy course");
		udemyLecture.setEnabled(true);
		
		QuizQuestion quizQuestion = udemyLecture.new QuizQuestion();
		quizQuestion.setId(1);
		quizQuestion.setQuestion("What is json");
		quizQuestion.setAnswer("json is a data interchange formet");
		
		udemyLecture.getListQuestion().add(quizQuestion);
		udemyLecture.setFree_preview(FREE_PREVIEW.FREE_PREVIEW_NOT_ENABLE);
		
		try {
			System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(udemyLecture));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*{
  "id" : 1,
  "name" : "json udemy course",
  "nameLine2" : "json line 2",
  "desc" : "json udemy course",
  "enabled" : true,
  "free_preview" : "FREE_PREVIEW_NOT_ENABLE",
  "listQuestion" : [ {
    "id" : 1,
    "question" : "What is json",
    "answer" : "json is a data interchange formet"
  } ]
}
*/
