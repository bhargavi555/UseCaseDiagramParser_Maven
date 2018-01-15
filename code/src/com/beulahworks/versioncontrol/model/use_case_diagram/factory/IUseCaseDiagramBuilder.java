package com.beulahworks.versioncontrol.model.use_case_diagram.factory;

import java.util.List;

import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseDiagramModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.ActorModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.AssociationRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.ActorGeneralizationRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.ExtensionRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.IncludeRelationshipModel;
import com.beulahworks.versioncontrol.model.use_case_diagram.UseCaseGeneralizationRelationshipModel;

public interface IUseCaseDiagramBuilder {
	public IUseCaseDiagramBuilder useCases(List<UseCaseModel> useCases);
	public IUseCaseDiagramBuilder actors(List<ActorModel> actors);
	public IUseCaseDiagramBuilder useCaseGeneralizations(List<UseCaseGeneralizationRelationshipModel>
		useCaseGeneralizations);
	public IUseCaseDiagramBuilder actorGeneralizations(List<ActorGeneralizationRelationshipModel> 
			actorGeneralizations);
	public 	IUseCaseDiagramBuilder associations(List<AssociationRelationshipModel> associations);
	public IUseCaseDiagramBuilder includes(List<IncludeRelationshipModel> includes);
	public IUseCaseDiagramBuilder extensions(List<ExtensionRelationshipModel> extensions);
	public UseCaseDiagramModel build();
}
