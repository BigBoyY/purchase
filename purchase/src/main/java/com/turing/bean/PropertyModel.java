package com.turing.bean;

import java.util.Map;

public class PropertyModel {
	private String name;
	private String value;
	private String Group;
	private Map<String, Object> editor;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public PropertyModel() {
		
	}
	public PropertyModel(String name, String value, String group, Map<String, Object> editor) {
		super();
		this.name = name;
		this.value = value;
		Group = group;
		this.editor = editor;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getGroup() {
		return Group;
	}
	public void setGroup(String group) {
		Group = group;
	}
	public Map<String, Object> getEditor() {
		return editor;
	}
	public void setEditor(Map<String, Object> editor) {
		this.editor = editor;
	}
}
