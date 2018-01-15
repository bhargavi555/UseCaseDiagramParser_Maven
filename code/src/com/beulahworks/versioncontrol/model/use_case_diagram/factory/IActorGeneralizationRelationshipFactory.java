package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.ActorModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.ActorGeneralizationRelationshipModel;

public interface IActorGeneralizationRelationshipFactory {
	public ActorGeneralizationRelationshipModel createRelationship(ActorModel parentActor, 
			ActorModel childActor);
}
