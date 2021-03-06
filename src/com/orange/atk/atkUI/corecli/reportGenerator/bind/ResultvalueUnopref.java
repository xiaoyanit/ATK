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
 * File Name   : ResultvalueUnopref.java
 *
 * Created     : 04/04/2007
 * Author(s)   : Aurore PENAULT
 */
package com.orange.atk.atkUI.corecli.reportGenerator.bind;

import java.io.Serializable;

import com.orange.atk.atkUI.corecli.reportGenerator.visit.Visitable;
import com.orange.atk.atkUI.corecli.reportGenerator.visit.Visitor;

/**
 * This class allows representing a loop in a program.
 * @author Aurore PENAULT
 * @since JDK5.0
 */
public class ResultvalueUnopref extends Resultvalue implements Serializable, Visitable {

	private static final long serialVersionUID = 1L;
	/**
	 * Identifier that referenced a loop clause.
	 */
	private String ref;

	/**
	 * Implementation of the visitor design pattern.
	 * @param v A concrete visitor.
	 */
	public void accept(Visitor v) {
		v.visit_Unopref(this);
	}

	/**
	 * Getter for property <code>ref</code>.
	 * @return Value of property <code>ref</code>.
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * Setter for property <code>ref</code>.
	 * @param idref New value of property <code>ref</code>.
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}

	public boolean equals(Object object){
		if (object==null) return false;
		if (!(object instanceof ResultvalueUnopref)) return false;
		ResultvalueUnopref other = (ResultvalueUnopref)object;
		return (ref.equals(other.getRef()));
	}

}
