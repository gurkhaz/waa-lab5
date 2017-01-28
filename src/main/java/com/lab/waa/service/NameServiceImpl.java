package com.lab.waa.service;

import javax.inject.Inject;

import com.lab.repository.NameRepository;
import com.lab.waa.model.Name;

public class NameServiceImpl implements NameService {

	@Inject
	NameRepository nameRepository;
	
	@Override
	public boolean createName(Name name) {
		
		return nameRepository.createName(name);
	}

	@Override
	public boolean deleteName(Name nameToDelete) {
		
		return nameRepository.deleteName(nameToDelete);
	}

	@Override
	public Name[] getAllNames() {
		
		return nameRepository.getAllNames();
	}

	@Override
	public Name getName() {
		
		return null;
	}

}
