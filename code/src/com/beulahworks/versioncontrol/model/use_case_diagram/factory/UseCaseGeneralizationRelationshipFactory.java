package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseGeneralizationRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;

public class UseCaseGeneralizationRelationshipFactory implements IUseCaseGeneralizationRelationshipFactory{

	@Override
	public UseCaseGeneralizationRelationshipModel createRelationship(
			UseCaseModel parentUseCase, UseCaseModel childUseCase) {
		UseCaseGeneralizationRelationshipModel relationship = new UseCaseGeneralizationRelationshipModel();
		relationship.setParentUseCase(parentUseCase);
		relationship.setChildUseCase(childUseCase);
		return relationship;
	}

}
