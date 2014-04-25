package org.avslor.JourneyThroughAvslor.Engine.Shared.Story;

import java.io.FileReader;
import java.lang.String;
import java.lang.reflect.Array;
import java.util.ArrayList;

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
public class Storyreader
{

    private Storyreader()
    {
    }

    public static Storyreader createStoryReader() {
        return new Storyreader();
    }

    public void readJSONFILE()
    {
        //For the time being we will mock this until we have settled on a suitable JSON format.
        ArrayList text = new ArrayList();
        text.add(1,"text");
        Story section = Story.getStory(text);
        section.toString();

    }


}
