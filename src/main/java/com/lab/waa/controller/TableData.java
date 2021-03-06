package com.lab.waa.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.lab.waa.model.Name;
import com.lab.waa.service.NameService;

@Named("tableData")
@SessionScoped
public class TableData implements Serializable {
	
	@Inject
	NameService nameService;
	
	public Name[] getNames() {
		return nameService.getAllNames();
	}

	public String save() {
		for (Name name : nameService.getAllNames())
			name.setEditable(false);
		return null;
	}

	public String deleteRow(Name nameToDelete) {
	
		nameService.deleteName(nameToDelete);
		return null;
	}
	
	public String createName(String first, String last)
	{
		nameService.createName(new Name(first,last));
		
		return "index3?faces-redirect=true";
		
	}
	
	/* Alternative by call method internally	
	 public void createName(String first, String last)
		{
			Name name = new Name(first, last);
			
			Name[] temp ={name};
			
			Stream namesStream  = (Stream) Arrays.stream(names);
			Stream tempStream = (Stream) Arrays.stream(temp);
			
			List<Name> tmpList = (List<Name>) Stream.concat(namesStream,tempStream).collect(Collectors.toList());
			
			names = tmpList.toArray(new Name[tmpList.size()]);
			
			getNames();
			
		}
	*/

}
