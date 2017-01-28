package com.lab.waa.service;

import com.lab.waa.model.Name;

public interface NameService {
	public boolean createName(Name name);
	public boolean deleteName(Name nameToDelete);
	public Name[] getAllNames();
	public Name getName();
}
