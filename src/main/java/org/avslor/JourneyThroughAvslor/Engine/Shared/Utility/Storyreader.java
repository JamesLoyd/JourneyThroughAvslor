package org.avslor.JourneyThroughAvslor.Engine.Shared.Utility;

import org.avslor.JourneyThroughAvslor.Engine.Shared.iGameState;
import org.json.JSONObject;

import java.io.IOException;
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

//This class will also rely on gamestate for saving data. Thus an interface was added.
public class Storyreader implements iGameState
{
    private boolean storyHasBeenRead = false;
    private ArrayList<String> Story;

    //make it private
    private Storyreader()
    {
       Story = new ArrayList<String>();
    }

    public static Storyreader createStoryReader() {
        return new Storyreader();
    }

    //this class will be restricted to only class methods can call
    private void readStoryFromJSONObject()
    {
        storyHasBeenRead = true;
        JSONObject test = Utility.getJSONOBject();

    }

    private String returnLineText(int i)
    {
        //some easy testing code
        switch(i)
        {
            case 0: return "some text";
            case 1: return "some more text";
            case 2: return "something even more";
            default: return "default";
        }
    }

    private ArrayList readTextIntoArrayList()
    {
        int count = 2;
        if(storyHasBeenRead == false)
        {
            //once this has been done than recursive call back.
            readStoryFromJSONObject();
            readTextIntoArrayList();
        }
        else
        {
            for(int i=0;i<3;i++)
            {
                Story.add(i,returnLineText(i));
            }
        }
        return Story;
    }

    public String ReadStory()
    {
        readStoryFromJSONObject();
        readTextIntoArrayList();
        StringBuffer buffer = new StringBuffer();
        for(int i = 0; i < Story.size();i++)
        {
            buffer.append(Story.get(i) + "\n");
        }
        return buffer.toString();
    }
    /*
     * This will be utilized later on.
     */
    public String ReadStoryAtLine(String sectionName, int lineNumber) throws Exception
    {
        try{
            String storyAtLineNumber;
            StringBuffer buffer = new StringBuffer();
            buffer.append(Story.get(lineNumber));
            storyAtLineNumber = buffer.toString();
            return storyAtLineNumber;
        }
        catch(IndexOutOfBoundsException e)
        {
            return Utility.handleIT(e);
        }
    }
}
