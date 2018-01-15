package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.ActorGeneralizationRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.ActorModel;

public class ActorGeneralizationRelationshipFactory implements IActorGeneralizationRelationshipFactory{

	@Override
	public ActorGeneralizationRelationshipModel createRelationship(
			ActorModel parentActor, ActorModel childActor) {
		ActorGeneralizationRelationshipModel relationship = new ActorGeneralizationRelationshipModel();
		relationship.setParentActor(parentActor);
		relationship.setChildActor(childActor);
		return relationship;
	}

}
