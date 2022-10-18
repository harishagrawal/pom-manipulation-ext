/*
 * Copyright (C) 2012 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
def pomFile = new File( basedir, 'pom.xml' )
System.out.println( "Slurping POM: ${pomFile.getAbsolutePath()}" )

def pom = new XmlSlurper().parse( pomFile )

def dependency = pom.dependencies.dependency.find { it.artifactId.text() == "junit" }
assert dependency != null
assert dependency.version.text() == "4.1"

dependency = pom.dependencyManagement.dependencies.dependency.find { it.artifactId.text() == "commons-lang" }
assert dependency != null
assert dependency.version.text() == "2.5"
dependency = pom.dependencyManagement.dependencies.dependency.find { it.artifactId.text() == "commons-codec" }
assert dependency != null
assert dependency.version.text() == "1.10"

assert pomFile.text.contains("ignoredUnusedDeclaredDependency>commons-lang:commons-lang</ignoredUnusedDeclaredDependency")
assert pomFile.text.contains("ignoredUnusedDeclaredDependency>commons-codec:commons-codec</ignoredUnusedDeclaredDependency")
