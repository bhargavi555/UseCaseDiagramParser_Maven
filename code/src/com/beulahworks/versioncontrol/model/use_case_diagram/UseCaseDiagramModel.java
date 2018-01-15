package com.beulahworks.versioncontrol.model.use_case_diagram;

import java.util.List;

public class UseCaseDiagramModel {
	private int id;
    private List<UseCaseModel> useCases;
    private List<ActorModel> actors;
    private List<UseCaseGeneralizationRelationshipModel> useCaseGeneralizations;
    private List<ActorGeneralizationRelationshipModel> actorGeneralizations;
    private List<AssociationRelationshipModel> associations;
    private List<IncludeRelationshipModel> includes;
    private List<ExtensionRelationshipModel> extensions;
    
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<UseCaseModel> getUseCases() {
		return useCases;
	}
	public void setUseCases(List<UseCaseModel> useCases) {
		this.useCases = useCases;
	}
	public List<ActorModel> getActors() {
		return actors;
	}
	public void setActors(List<ActorModel> actors) {
		this.actors = actors;
	}
	public List<UseCaseGeneralizationRelationshipModel> getUseCaseGeneralizations() {
		return useCaseGeneralizations;
	}
	public void setUseCaseGeneralizations(
			List<UseCaseGeneralizationRelationshipModel> useCaseGeneralizations) {
		this.useCaseGeneralizations = useCaseGeneralizations;
	}
	public List<ActorGeneralizationRelationshipModel> getActorGeneralizations() {
		return actorGeneralizations;
	}
	public void setActorGeneralizations(
			List<ActorGeneralizationRelationshipModel> actorGeneralizations) {
		this.actorGeneralizations = actorGeneralizations;
	}
	public List<AssociationRelationshipModel> getAssociations() {
		return associations;
	}
	public void setAssociations(List<AssociationRelationshipModel> associations) {
		this.associations = associations;
	}
	public List<IncludeRelationshipModel> getIncludes() {
		return includes;
	}
	public void setIncludes(List<IncludeRelationshipModel> includes) {
		this.includes = includes;
	}
	public List<ExtensionRelationshipModel> getExtensions() {
		return extensions;
	}
	public void setExtensions(List<ExtensionRelationshipModel> extensions) {
		this.extensions = extensions;
	}
    
    
}
