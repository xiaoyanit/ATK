/*
 * Software Name : ATK
 *
 * Copyright (C) 2007 - 2012 France Télécom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * ------------------------------------------------------------------
 * File Name   : ResultvalueNoderef.java
 *
 * Created     : 04/04/2007
 * Author(s)   : Aurore PENAULT
 */
package com.orange.atk.atkUI.corecli.reportGenerator.bind;

import java.io.Serializable;

import com.orange.atk.atkUI.corecli.reportGenerator.visit.Visitable;
import com.orange.atk.atkUI.corecli.reportGenerator.visit.Visitor;

/**
 * In the profile, the <code>noderef</code> element references elements
 * generated by Navmid.
 * @author Aurore PENAULT
 * @since JDK5.0
 */
public class ResultvalueNoderef extends Resultvalue implements Serializable, Visitable {

	private static final long serialVersionUID = 1L;
	/**
	 * Value that references a navmid element.
	 */
	private String value;

	/**
	 * Implementation of the visitor design pattern.
	 * @param v A concrete visitor.
	 */
	public void accept(Visitor v) {
		v.visit_Noderef(this);
	}

	/**
	 * Getter for <code>value</code> property.
	 * @return Value of <code>value</code> property.
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Setter for <code>value</code> property.
	 * @param value New value of <code>value</code> property.
	 */
	public void setValue(String value) {
		this.value = value;
	}

	public boolean equals(Object object){
		if (object==null) return false;
		if (!(object instanceof ResultvalueNoderef)) return false;
		ResultvalueNoderef other = (ResultvalueNoderef)object;
		return (value.equals(other.getValue()));
	}
}
