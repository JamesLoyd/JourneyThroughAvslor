package org.avslor.JourneyThroughAvslor.Engine.Shared;

import jdk.nashorn.api.scripting.JSObject;
import org.json.JSONObject;

import javax.rmi.CORBA.Util;
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
    private boolean storyHasBeenRead = false;
    private ArrayList Story = new ArrayList();
    int count3;
    private Storyreader()
    {
    }

    public static Storyreader createStoryReader() {
        return new Storyreader();
    }

    //this class will be restricted to only class methods can call
    private void readStory()
    {
        storyHasBeenRead = true;
        JSONObject test = Utility.getJSONOBject();

    }

    private String returnLineText()
    {
        return "test" + count3++ ;
    }

    public ArrayList readTextIntoArrayList()
    {
        int count = 2;
        if(storyHasBeenRead == false)
        {
            //once this has been done than recursive call back.
            readStory();
            readTextIntoArrayList();
        }
        else
        {
            for(int i=0;i<3;i++)
            {
                Story.add(i,returnLineText());
            }


        }
        return Story;
    }
}
