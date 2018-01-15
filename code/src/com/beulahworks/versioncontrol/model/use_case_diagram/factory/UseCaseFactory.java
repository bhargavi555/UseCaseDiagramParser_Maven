package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;

public class UseCaseFactory implements IUseCaseFactory {

	@Override
	public UseCaseModel createUseCase(String name){
		UseCaseModel useCase = new UseCaseModel();
		useCase.setUseCaseName(name);
		return useCase;
	}
	
	
}
