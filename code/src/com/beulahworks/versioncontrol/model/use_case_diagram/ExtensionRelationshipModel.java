package com.beulahworks.versioncontrol.model.use_case_diagram;

public class ExtensionRelationshipModel {
	  private int id;
	    private UseCaseModel baseUseCase;
	    private UseCaseModel extendedUseCase;
	    
	    
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
		public UseCaseModel getExtendedUseCase() {
			return extendedUseCase;
		}
		public void setExtendedUseCase(UseCaseModel extendedUseCase) {
			this.extendedUseCase = extendedUseCase;
		}
}
