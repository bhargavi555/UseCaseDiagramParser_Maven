package com.beulahworks.versioncontrol.model.use_case_diagram;

public class UseCaseGeneralizationRelationshipModel {
	private int id;
    private UseCaseModel parentUseCase;
    private UseCaseModel childUseCase;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UseCaseModel getParentUseCase() {
		return parentUseCase;
	}
	public void setParentUseCase(UseCaseModel parentUseCase) {
		this.parentUseCase = parentUseCase;
	}
	public UseCaseModel getChildUseCase() {
		return childUseCase;
	}
	public void setChildUseCase(UseCaseModel childUseCase) {
		this.childUseCase = childUseCase;
	}
}
