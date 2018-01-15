package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.IncludeRelationshipModel;

public interface IIncludeRelationshipFactory {
	public IncludeRelationshipModel createRelationship(UseCaseModel baseUseCase, 
			UseCaseModel includedUseCase);
}
