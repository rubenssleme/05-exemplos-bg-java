package javaee7crud.entities;

public class DadosDTO {

	private String key;
	private String value;

	public DadosDTO() {

	}

	public DadosDTO(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "DadosDTO [key=" + key + ", value=" + value + "]";
	}
}
