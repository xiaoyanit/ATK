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
 * File Name   : ATKScriptParserConstants.java
 *
 * Created     : 21/05/2010
 * Author(s)   : HENAFF Mari-Mai
 */
package com.orange.atk.interpreter.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ATKScriptParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int LOOP = 3;
  /** RegularExpression Id. */
  int ENDL = 4;
  /** RegularExpression Id. */
  int INCLUDE = 5;
  /** RegularExpression Id. */
  int SETVAR = 6;
  /** RegularExpression Id. */
  int NUMBER = 7;
  /** RegularExpression Id. */
  int DIGIT = 8;
  /** RegularExpression Id. */
  int EOL = 9;
  /** RegularExpression Id. */
  int VARNAME = 10;
  /** RegularExpression Id. */
  int STRING = 11;
  /** RegularExpression Id. */
  int CHAR = 12;
  /** RegularExpression Id. */
  int SINGLE_LINE_COMMENT = 13;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"loop\"",
    "\"endloop\"",
    "\"Include\"",
    "\"SetVar\"",
    "<NUMBER>",
    "<DIGIT>",
    "<EOL>",
    "<VARNAME>",
    "<STRING>",
    "<CHAR>",
    "<SINGLE_LINE_COMMENT>",
    "\"(\"",
    "\")\"",
    "\",\"",
    "\"{\"",
    "\"}\"",
  };

}