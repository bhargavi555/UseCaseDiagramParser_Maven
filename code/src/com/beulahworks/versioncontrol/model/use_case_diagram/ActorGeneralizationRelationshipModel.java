package com.beulahworks.versioncontrol.model.use_case_diagram;

public class ActorGeneralizationRelationshipModel {
	private int id;
    private ActorModel parentActor;
    private ActorModel childActor;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ActorModel getParentActor() {
		return parentActor;
	}
	public void setParentActor(ActorModel parentActor) {
		this.parentActor = parentActor;
	}
	public ActorModel getChildActor() {
		return childActor;
	}
	public void setChildActor(ActorModel childActor) {
		this.childActor = childActor;
	}
}
