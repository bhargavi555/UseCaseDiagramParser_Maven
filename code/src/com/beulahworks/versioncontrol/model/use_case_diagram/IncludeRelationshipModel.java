package com.beulahworks.versioncontrol.model.use_case_diagram;

public class IncludeRelationshipModel {
	private int id;
    private UseCaseModel baseUseCase;
    private UseCaseModel includedUseCase;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UseCaseModel getBaseUseCase() {
		return baseUseCase;
	}
	public void setBaseUseCase(UseCaseModel baseUseCase) {
		this.baseUseCase = baseUseCase;
	}
	public UseCaseModel getIncludedUseCase() {
		return includedUseCase;
	}
	public void setIncludedUseCase(UseCaseModel includedUseCase) {
		this.includedUseCase = includedUseCase;
	}
    
    
}
