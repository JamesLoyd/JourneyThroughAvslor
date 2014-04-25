package org.avslor.JourneyThroughAvslor.Engine.Shared.Story;
/*   Copyright 2013 James Loyd , Joshua Theze
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

import java.util.ArrayList;
import java.util.List;

public class Story
{
    private ArrayList text = new ArrayList();
    private ArrayList indexes = new ArrayList();
    private Story(ArrayList text, ArrayList indexes)
    {
        this.text = text;
        this.indexes = indexes;
    }

    public Story getStory(ArrayList text, ArrayList indexes)
    {
        return new Story(text, indexes)
    }

    public String toString()
    {
        System.out.println("This story section has " + indexes.size() + " lines in it.")
    }
}