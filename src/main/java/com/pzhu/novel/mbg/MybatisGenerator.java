package com.pzhu.novel.mbg;

import org.mybatis.generator.api.*;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;
import java.util.Objects;

public class MybatisGenerator extends PluginAdapter {


	public static void main(String[] args) {
		generate();
	}

	public static void generate() {
		String config = Objects.requireNonNull(MybatisGenerator.class.getClassLoader().getResource("generator/mybatis-generator.xml")).getFile();
		String[] arg = { "-configfile", config, "-overwrite" };
		ShellRunner.main(arg);
	}

	public boolean validate(List<String> list) {
		return true;
	}


	/**
	 * 实体类添加swagger注解
	 * @param field
	 * @param topLevelClass
	 * @param introspectedColumn
	 * @param introspectedTable
	 * @param modelClassType
	 * @return
	 */
	public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
									   IntrospectedTable introspectedTable, Plugin.ModelClassType modelClassType) {
		String classAnnotation = "@ApiModel(value=\"" + topLevelClass.getType().getShortName() + "\")";
		if (!topLevelClass.getAnnotations().contains(classAnnotation)) {
			topLevelClass.addAnnotation(classAnnotation);
		}
		String apiModelAnnotationPackage = this.properties.getProperty("apiModelAnnotationPackage");
		String apiModelPropertyAnnotationPackage = this.properties.getProperty("apiModelPropertyAnnotationPackage");
		if (null == apiModelAnnotationPackage) {
			apiModelAnnotationPackage = "io.swagger.annotations.ApiModel";
		}
		if (null == apiModelPropertyAnnotationPackage) {
			apiModelPropertyAnnotationPackage = "io.swagger.annotations.ApiModelProperty";
		}
		topLevelClass.addImportedType(apiModelAnnotationPackage);
		topLevelClass.addImportedType(apiModelPropertyAnnotationPackage);
		field.addAnnotation("@ApiModelProperty(value=\"" + introspectedColumn.getRemarks() +
										   "\",name=\""+introspectedColumn.getJavaProperty()+
										   "\",dataType=\""+introspectedColumn.getFullyQualifiedJavaType().getShortName()+
											"\")");
		return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
	}

	/**
	 * 生成dao
	 */
	/*@Override
	public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		FullyQualifiedJavaType fqjt = new FullyQualifiedJavaType("BaseDao<" + introspectedTable.getBaseRecordType() + ","+introspectedTable.getBaseRecordType()+"Example>");
		FullyQualifiedJavaType imp = new FullyQualifiedJavaType("com.springboot.dao.base.BaseDao");
		interfaze.addSuperInterface(fqjt);// 添加 extends BaseDao<User>
		interfaze.addImportedType(imp);// 添加import common.BaseDao;
		interfaze.getMethods().clear();
		return true;
	}*/
}