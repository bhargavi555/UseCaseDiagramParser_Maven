package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;

public interface IUseCaseFactory {
	public UseCaseModel createUseCase(String name);
}
