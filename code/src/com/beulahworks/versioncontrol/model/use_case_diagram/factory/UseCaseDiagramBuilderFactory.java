package com.beulahworks.versioncontrol.model.use_case_diagram.factory;


public class UseCaseDiagramBuilderFactory implements IUseCaseDiagramBuilderFactory{

	@Override
	public IUseCaseDiagramBuilder createUseCaseDiagramBuilder() {
			return new UseCaseDiagramBuilder();
	}

	
}
