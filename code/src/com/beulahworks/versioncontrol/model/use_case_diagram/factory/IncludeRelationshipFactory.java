package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.IncludeRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;

public class IncludeRelationshipFactory implements IIncludeRelationshipFactory{

	@Override
	public IncludeRelationshipModel createRelationship(
			UseCaseModel baseUseCase, UseCaseModel includedUseCase) {
		IncludeRelationshipModel relationship = new IncludeRelationshipModel();
		relationship.setBaseUseCase(baseUseCase);
		relationship.setIncludedUseCase(includedUseCase);
		return relationship;
	}

}
