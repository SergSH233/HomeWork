package Core;

import java.util.ArrayList;
import java.util.List;

public class Dropdown {
	private boolean isSelected;
	private String name;
	private List<String> options = new ArrayList<String>();

	public Dropdown() {

	}

	public Dropdown(String name, String select1, String select2, String select3, boolean isSelected) {
	this.isSelected = isSelected;
	this.options.add(select1);
	this.options.add(select2);
	this.options.add(select3);
	this.name = name;
	}

	public boolean isSelected() {
	return isSelected;
	}

	public void setSelected(boolean isSelected) {
	this.isSelected = isSelected;
	}

	public String getName() {
	return name;
	}

	public List<String> setName(String name) {
	this.name = name;
	return options;
	}

	public List<String> getList() {
	return options;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((options == null) ? 0 : options.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dropdown other = (Dropdown) obj;
		if (options == null) {
			if (other.options != null)
				return false;
		} else if (!options.equals(other.options))
			return false;
		return true;
	}

	public void setList(List<String> list) {
	this.options = options;
	}
	
		

}
