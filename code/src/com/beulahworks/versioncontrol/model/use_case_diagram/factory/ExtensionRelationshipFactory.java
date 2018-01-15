package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.ExtensionRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;

public class ExtensionRelationshipFactory implements IExtensionRelationshipFactory{

	@Override
	public ExtensionRelationshipModel createRelationship(
			UseCaseModel baseUseCase, UseCaseModel extendedUseCase) {
		ExtensionRelationshipModel relationship = new ExtensionRelationshipModel();
		relationship.setBaseUseCase(baseUseCase);
		relationship.setExtendedUseCase(extendedUseCase);
		return relationship;
	}

}
