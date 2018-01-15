package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseGeneralizationRelationshipModel;

public interface IUseCaseGeneralizationRelationshipFactory {
	public UseCaseGeneralizationRelationshipModel createRelationship(UseCaseModel parentUseCase, 
			UseCaseModel childUseCase);
}
