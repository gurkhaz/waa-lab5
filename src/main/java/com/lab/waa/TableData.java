/*package com.lab.waa;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;



@Named("tableData") // or @ManagedBean
@SessionScoped

public class TableData implements Serializable {

	private static final long serialVersionUID = 1L;

	private Name[] names = new Name[] { new Name("William", "Dupont"), new Name("Anna", "Keeney"),
			new Name("Mariko", "Randor"), new Name("John", "Wilson") };

	public Name[] getNames() {
		return names;
	}

	public String save() {
		for (Name name : names)
			name.setEditable(false);
		return null;
	}

	
	 * public String deleteRow(Name nameToDelete) { names.remove(nameToDelete);
	 * return null; }
	 

	public String deleteRow(Name nameToDelete) {
		Name[] tempArrName = null;

		
		 * before java 8 for (int i = 0; i < names.length; i++) { Name tempName
		 * = names[i]; if(nameToDelete.getFirst().equals(tempName.getFirst())) {
		 * 
		 * } else { tempArrName[i] = tempName; } }
		 

		// lambda expression
		tempArrName = Arrays.stream(names).filter(n -> !n.getFirst().equalsIgnoreCase(nameToDelete.getFirst()))
				.toArray(Name[]::new);

		names = tempArrName;

		return null;
	}

	public String createName(String first, String last) throws IOException {
		Name name = new Name(first, last);

		Name[] temp = { name };

		Stream namesStream = (Stream) Arrays.stream(names);
		Stream tempStream = (Stream) Arrays.stream(temp);

		List<Name> tmpList =  (List<Name>) Stream.concat(namesStream, tempStream).collect(Collectors.toList());

		names = tmpList.toArray(new Name[tmpList.size()]);
		
		 FacesContext.getCurrentInstance().getExternalContext().redirect("index.jsf");

		return null;

	}

}
*/