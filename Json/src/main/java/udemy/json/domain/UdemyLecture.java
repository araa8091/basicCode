package udemy.json.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name","id","nameLine2"})
public class UdemyLecture {
	
	private long id;
	private String name;
	private String nameLine2;
	
	@JsonProperty("description")
	private String desc;
	private boolean enabled;
	private FREE_PREVIEW free_preview;
	
	public class QuizQuestion {
		private long id;
		private String question;
		private String answer;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
	}
	
	public enum FREE_PREVIEW{FREE_PREVIEW_ENABLE, FREE_PREVIEW_NOT_ENABLE}
	
	public List<QuizQuestion> listQuestion = new ArrayList<QuizQuestion>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameLine2() {
		return nameLine2;
	}

	public void setNameLine2(String nameLine2) {
		this.nameLine2 = nameLine2;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public List<QuizQuestion> getListQuestion() {
		return listQuestion;
	}

	public void setListQuestion(List<QuizQuestion> listQuestion) {
		this.listQuestion = listQuestion;
	}

	public FREE_PREVIEW getFree_preview() {
		return free_preview;
	}

	public void setFree_preview(FREE_PREVIEW free_preview) {
		this.free_preview = free_preview;
	}
	
	
}
