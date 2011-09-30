/*******************************************************************************
 * Copyright (c) 2009-2011 Ansgar Konermann <konermann@itikko.net>
 *
 * This file is part of the Maven 3 Drools Support Package.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package de.lightful.maven.drools.plugin.naming;

/** Various constant values used both in production and test code of the plugin. */
public interface WellKnownNames {

  /**
   * Maven packaging identifier to be used in pom.xml if drools packaging is desired. <p/> Example:<br/>
   * <pre>
   * &lt;project ...&gt;
   *   ...
   *   &lt;packaging&gt;knowledge-module&lt;/packaging&gt;
   *   ...
   * &lt;/project&gt;
   * </pre>
   */
  String DROOLS_KNOWLEDGE_MODULE_PACKAGING_IDENTIFIER = "knowledge-module";

  /** File extension used by plugin to create final target file name. */
  String FILE_EXTENSION_DROOLS_KNOWLEDGE_MODULE = "dkm";

  String ARTIFACT_TYPE_DROOLS_KNOWLEDGE_MODULE = "knowledge-module";
  String ARTIFACT_TYPE_JAR = "jar";

  String GOAL_CLEAN = "clean";
  String GOAL_COMPILE = "compile";
  String GOAL_TEST_COMPILE = "test-compile";
  String GOAL_DEPLOY = "deploy";

  String SCOPE_COMPILE = GOAL_COMPILE;
}