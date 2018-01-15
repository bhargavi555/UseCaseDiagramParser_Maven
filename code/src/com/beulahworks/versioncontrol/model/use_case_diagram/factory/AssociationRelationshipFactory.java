package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.ActorModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.AssociationRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;

public class AssociationRelationshipFactory implements IAssociationRelationshipFactory{

	@Override
	public AssociationRelationshipModel createRelationship(ActorModel actor,
			UseCaseModel useCase) {
		AssociationRelationshipModel relationship = new AssociationRelationshipModel();
		relationship.setActor(actor);
		relationship.setUseCase(useCase);
		return relationship;
	}

}
