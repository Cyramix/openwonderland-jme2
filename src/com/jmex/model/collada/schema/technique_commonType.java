/**
 * technique_commonType.java
 *
 * This file was generated by XMLSpy 2007sp2 Enterprise Edition.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the XMLSpy Documentation for further details.
 * http://www.altova.com/xmlspy
 */


package com.jmex.model.collada.schema;


public class technique_commonType extends com.jmex.xml.xml.Node {

	public technique_commonType(technique_commonType node) {
		super(node);
	}

	public technique_commonType(org.w3c.dom.Node node) {
		super(node);
	}

	public technique_commonType(org.w3c.dom.Document doc) {
		super(doc);
	}

	public technique_commonType(com.jmex.xml.xml.Document doc, String namespaceURI, String prefix, String name) {
		super(doc, namespaceURI, prefix, name);
	}
	
	public void adjustPrefix() {
		for (	org.w3c.dom.Node tmpNode = getDomFirstChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "instance_material" );
				tmpNode != null;
				tmpNode = getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "instance_material", tmpNode )
			) {
			internalAdjustPrefix(tmpNode, true);
			new instance_materialType(tmpNode).adjustPrefix();
		}
	}
	public void setXsiType() {
 		org.w3c.dom.Element el = (org.w3c.dom.Element) domNode;
		el.setAttributeNS("http://www.w3.org/2001/XMLSchema-instance", "xsi:type", "technique_common");
	}

	public static int getinstance_materialMinCount() {
		return 1;
	}

	public static int getinstance_materialMaxCount() {
		return Integer.MAX_VALUE;
	}

	public int getinstance_materialCount() {
		return getDomChildCount(Element, "http://www.collada.org/2005/11/COLLADASchema", "instance_material");
	}

	public boolean hasinstance_material() {
		return hasDomChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "instance_material");
	}

	public instance_materialType newinstance_material() {
		return new instance_materialType(domNode.getOwnerDocument().createElementNS("http://www.collada.org/2005/11/COLLADASchema", "instance_material"));
	}

	public instance_materialType getinstance_materialAt(int index) throws Exception {
		return new instance_materialType(getDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "instance_material", index));
	}

	public org.w3c.dom.Node getStartinginstance_materialCursor() throws Exception {
		return getDomFirstChild(Element, "http://www.collada.org/2005/11/COLLADASchema", "instance_material" );
	}

	public org.w3c.dom.Node getAdvancedinstance_materialCursor( org.w3c.dom.Node curNode ) throws Exception {
		return getDomNextChild( Element, "http://www.collada.org/2005/11/COLLADASchema", "instance_material", curNode );
	}

	public instance_materialType getinstance_materialValueAtCursor( org.w3c.dom.Node curNode ) throws Exception {
		if( curNode == null )
			throw new com.jmex.xml.xml.XmlException("Out of range");
		else
			return new instance_materialType(curNode);
	}

	public instance_materialType getinstance_material() throws Exception 
 {
		return getinstance_materialAt(0);
	}

	public void removeinstance_materialAt(int index) {
		removeDomChildAt(Element, "http://www.collada.org/2005/11/COLLADASchema", "instance_material", index);
	}

	public void removeinstance_material() {
		while (hasinstance_material())
			removeinstance_materialAt(0);
	}

	public org.w3c.dom.Node addinstance_material(instance_materialType value) {
		return appendDomElement("http://www.collada.org/2005/11/COLLADASchema", "instance_material", value);
	}

	public void insertinstance_materialAt(instance_materialType value, int index) {
		insertDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "instance_material", index, value);
	}

	public void replaceinstance_materialAt(instance_materialType value, int index) {
		replaceDomElementAt("http://www.collada.org/2005/11/COLLADASchema", "instance_material", index, value);
	}

}
