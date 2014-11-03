package gr.uom.java.xmi.diff;

import gr.uom.java.xmi.UMLOperation;

public class InlineOperationRefactoring implements Refactoring {
	private UMLOperation inlinedOperation;
	private UMLOperation inlinedToOperation;
	private String sourceClassName;
	
	
	public InlineOperationRefactoring(UMLOperation inlinedOperation, UMLOperation inlinedToOperation, String sourceClassName) {
		this.inlinedOperation = inlinedOperation;
		this.inlinedToOperation = inlinedToOperation;
		this.sourceClassName = sourceClassName;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName()).append("\t");
		sb.append(inlinedOperation);
		sb.append(" inlined to ");
		sb.append(inlinedToOperation);
		sb.append(" in class ");
		sb.append(sourceClassName);
		return sb.toString();
	}

	@Override
	public String getName() {
		return "Inline Operation";
	}

}