package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.ActorModel;

public class ActorFactory implements IActorFactory{
	
	@Override
	public ActorModel createActor(String name){
		ActorModel actor = new ActorModel();
		actor.setActorName(name);
		return actor;
	}
}
