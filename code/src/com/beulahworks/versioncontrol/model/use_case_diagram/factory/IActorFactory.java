package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import com.beulahworks.versioncontrol.model.use_case_diagram.ActorModel;

public interface IActorFactory {
	public ActorModel createActor(String name);
}
