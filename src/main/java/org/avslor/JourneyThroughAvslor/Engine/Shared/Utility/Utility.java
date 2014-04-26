package org.avslor.JourneyThroughAvslor.Engine.Shared.Utility;
import org.json.JSONObject;

import java.io.File;

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

    public static String getExceptionType(String e)
    {
        int whereIsColon = 0;
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

    public static String handleIT(Exception e) throws Exception
    {
        boolean isSecondTry = false;
        try
        {
            BugInfo tempBug = BugInfo.createBugReport(e);
            tempBug.SaveBugTxtFile();
            StringBuffer buffer = new StringBuffer();
            buffer.append("There was an error. \n\t");
            buffer.append("Bug" + tempBug.getBugNumber() + " has been created in the bugs folder.");
            buffer.append("You may look at it and paste its contents as a bug on Github. \n");
            buffer.append("Sorry for the inconvenience. In most cases, you may continue to play the game.");
            return buffer.toString();
        }
        catch (Exception f)
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
              buffer.append(" \n You will have to a manually create a bug report on github.");
            }

            return buffer.toString();
        }
    }

    public static String getVersion()
    {
        return "pre-alpha";
    }

    public static boolean IsBugReportFolderThere()
    {
        File file = new File("./Bugs");
        if (file.isDirectory())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void BugReportFolder(boolean isItThere)
    {
        File file = new File("./Bugs");
        if(isItThere == false)
        {
            file.mkdir();
        }
    }
    public static String getLocalDirectory()
    {
        return  System.getProperty("user.dir");
    }

    public static int incrementBugNumber(boolean isItThere,File dir) throws Exception
    {
       int max = 0;
       int location =0;
        int number = 0;
        int extension = 0;
        boolean hasdash = false;
        try
       {
           File[] listOfFiles = dir.listFiles();
           for (File file : listOfFiles)
           {
               char[] fileCharArray = new char[file.toString().length()];
               fileCharArray = file.toString().toCharArray();
               for(int i=0;i<fileCharArray.length;i++)
               {
                   if(fileCharArray[i] == '-')
                   {
                       location = i+1;
                       hasdash = true;
                   }
                   if(fileCharArray[i] == 'g' && hasdash == false)
                   {
                       location = i+1;
                   }
                   if(fileCharArray[i]=='.')
                   {
                       extension = i;
                   }
               }
               number = Integer.parseInt(file.toString().substring(location,extension));
               if(max == number)
               {
                   max = number;
               }
               if(number > max)
               {
                   max = number;
               }
           }
           return ++max;
       }
       catch(Exception e)
       {
           handleIT(e);
           return 0;
       }
    }
}
