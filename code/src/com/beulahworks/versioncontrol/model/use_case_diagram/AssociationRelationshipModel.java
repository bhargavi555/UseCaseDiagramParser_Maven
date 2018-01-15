package com.beulahworks.versioncontrol.model.use_case_diagram;

public class AssociationRelationshipModel {
	private int id;
    private ActorModel actor;
    private UseCaseModel useCase;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ActorModel getActor() {
		return actor;
	}
	public void setActor(ActorModel actor) {
		this.actor = actor;
	}
	public UseCaseModel getUseCase() {
		return useCase;
	}
	public void setUseCase(UseCaseModel useCase) {
		this.useCase = useCase;
	}
    
}
