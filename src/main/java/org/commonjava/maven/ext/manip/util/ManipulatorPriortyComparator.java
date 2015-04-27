/**
 * Copyright (C) 2012 Red Hat, Inc. (jcasey@redhat.com)
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
package org.commonjava.maven.ext.manip.util;

import java.util.Comparator;

import org.commonjava.maven.ext.manip.impl.Manipulator;

/**
 * Sorts {@link Manipulator} implementations by their execution index, in ascending order.
 */
public class ManipulatorPriortyComparator
    implements Comparator<Manipulator>
{

    @Override
    public int compare( final Manipulator first, final Manipulator second )
    {
        return first.getExecutionIndex() - second.getExecutionIndex();
    }

}
