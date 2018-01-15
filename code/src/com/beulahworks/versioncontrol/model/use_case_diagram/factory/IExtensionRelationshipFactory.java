package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.ExtensionRelationshipModel;

public interface IExtensionRelationshipFactory {
	public ExtensionRelationshipModel createRelationship(UseCaseModel baseUseCase,
			UseCaseModel extendedUseCase);
}
