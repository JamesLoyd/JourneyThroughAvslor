package org.avslor.JourneyThroughAvslor.Engine.Shared.Utility;
import org.json.JSONObject;

import java.io.IOException;

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
public class Utility
{
    public static double getAttackDamage(double attackPoints, double frequency)
    {
       return attackPoints * frequency;
    }

    /*
     * This will probably need to be refactored to read a change log or something. Or simply to drive a window of the UI
     * that we will call about.
     */
    public static void getProjectInfo()
    {
    }

    public static JSONObject getJSONOBject()
    {
        //for the time being
        return new JSONObject();
    }

    public static JSONObject readStoryAssets()
    {
        return new JSONObject();
    }

    public static String handleColonInException(String e)
    {
        int whereIsColon =0;
        char[] someText = new char[e.length()];
        someText = e.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for(int i =0; i<someText.length;i++)
        {
            if(someText[i]==':')
            {
                whereIsColon = i;
                break;
            }
        }
        for(int j=0;j<whereIsColon;j++)
        {
            buffer.append(someText[j]);
        }
        return buffer.toString();
    }

    public static String handleIT(Exception e) throws IOException
    {
        boolean isSecondTry = false;
        try
        {
            BugInfo tempBug = BugInfo.createBugReport(e.getStackTrace(),e.getMessage());
            tempBug.gatherInformation();
            tempBug.SaveBugTxtFile();
            StringBuffer buffer = new StringBuffer();
            buffer.append("There was an error. \n\t");
            buffer.append("Type: " + handleColonInException(e.toString()) + "\n");
            buffer.append("Please create an issue on Github for this.");
            return buffer.toString();
        }
        catch (IOException f)
        {
            StringBuffer buffer = new StringBuffer();
            if (isSecondTry == false)
            {
                buffer.append("Something went wrong. We will attempt one more time.");
                handleIT(f);
                isSecondTry = true;
            }
            else
            {
              buffer.append("\n During the second try, something messed up");
              buffer.append(" \n You will have to a manual bug report on github.");
            }

            return buffer.toString();
        }
    }
}
