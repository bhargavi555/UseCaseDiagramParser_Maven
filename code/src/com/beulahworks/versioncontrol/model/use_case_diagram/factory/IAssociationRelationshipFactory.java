package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.ActorModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.AssociationRelationshipModel;

public interface IAssociationRelationshipFactory {
	public AssociationRelationshipModel createRelationship(ActorModel actor, UseCaseModel useCase);
}
