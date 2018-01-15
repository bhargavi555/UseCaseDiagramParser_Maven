package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import java.util.List;

import com.beulahworks.versioncontrol.model.use_case_diagram.ActorGeneralizationRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.ActorModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.AssociationRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.ExtensionRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.IncludeRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseDiagramModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseGeneralizationRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;



public class UseCaseDiagramBuilder implements IUseCaseDiagramBuilder{
	private UseCaseDiagramModel useCaseDiagram;
	
	public UseCaseDiagramBuilder(){
		useCaseDiagram = new UseCaseDiagramModel();
	}

	@Override
	public IUseCaseDiagramBuilder useCases(List<UseCaseModel> useCases) {
		useCaseDiagram.setUseCases(useCases);
		return this;
	}

	@Override
	public IUseCaseDiagramBuilder actors(List<ActorModel> actors) {
		useCaseDiagram.setActors(actors);
		return this;
	}

	@Override
	public IUseCaseDiagramBuilder useCaseGeneralizations(
			List<UseCaseGeneralizationRelationshipModel> useCaseGeneralizations) {
		useCaseDiagram.setUseCaseGeneralizations(useCaseGeneralizations);
		return this;
	}

	@Override
	public IUseCaseDiagramBuilder actorGeneralizations(
			List<ActorGeneralizationRelationshipModel> actorGeneralizations) {
		useCaseDiagram.setActorGeneralizations(actorGeneralizations);
		return this;
	}

	@Override
	public IUseCaseDiagramBuilder associations(
			List<AssociationRelationshipModel> associations) {
		useCaseDiagram.setAssociations(associations);
		return this;
	}

	@Override
	public IUseCaseDiagramBuilder includes(
			List<IncludeRelationshipModel> includes) {
		useCaseDiagram.setIncludes(includes);
		return this;
	}

	@Override
	public IUseCaseDiagramBuilder extensions(
			List<ExtensionRelationshipModel> extensions) {
		useCaseDiagram.setExtensions(extensions);
		return this;
	}

	@Override
	public UseCaseDiagramModel build() {
		return useCaseDiagram;
	}

}
