package com.lab.repository;

import com.lab.waa.model.Name;

public interface NameRepository {
	
	public boolean deleteName(Name nameToDelete);
	public Name[] getAllNames();
	public Name getName();
	boolean createName(Name name);

}
