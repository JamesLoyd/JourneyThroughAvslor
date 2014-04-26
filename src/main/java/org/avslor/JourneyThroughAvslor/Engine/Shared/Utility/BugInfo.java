package org.avslor.JourneyThroughAvslor.Engine.Shared.Utility;
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

import org.avslor.JourneyThroughAvslor.Engine.Shared.iGameState;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/*
 * This class will serve as a special class that can allow us to gather detailed bug information.
 * This class requires gameStateinformation.
 */
public class BugInfo implements iGameState
{
    private StackTraceElement[] stackTrace;
    private String message;
    private String version;
    private String vendor;
    private String typeOfException;
    private String localizedMessage;
    private int bugNumber;
    Random random = new Random();
    Exception e;
    private BugInfo(Exception e)
    {
        this.e = e;
        bugNumber = random.nextInt();
    }

    public static BugInfo createBugReport(Exception e)
    {
        return new BugInfo(e);
    }

    private void gatherInformation()
    {
        version = Runtime.class.getPackage().getImplementationVersion();
        vendor = Runtime.class.getPackage().getImplementationVendor();
        typeOfException = Utility.getExceptionType(e.toString());
        stackTrace = e.getStackTrace();
        message = e.getMessage();
    }

    public void SaveBugTxtFile() throws IOException
    {
        gatherInformation();
        File bugFile = new File("Bug" + bugNumber  + ".txt" );
        try
        {
            bugFile.createNewFile();
            FileWriter fileWriter = new FileWriter(bugFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.append("JAVA VERSION: \n\t");
            bufferedWriter.newLine();
            bufferedWriter.append("\t\n" + version);
            bufferedWriter.newLine();
            bufferedWriter.append("JAVA VENDOR: \n\t");
            bufferedWriter.newLine();
            bufferedWriter.append("\t\n" + vendor);
            bufferedWriter.newLine();
            bufferedWriter.append("EXCEPTION TYPE:");
            bufferedWriter.newLine();
            bufferedWriter.append("\t" + typeOfException);
            bufferedWriter.newLine();
            bufferedWriter.append("MESSAGE:");
            bufferedWriter.newLine();
            bufferedWriter.append("\t\n" + message);
            bufferedWriter.newLine();
            bufferedWriter.write("VERSION:");
            bufferedWriter.newLine();
            bufferedWriter.write("\n\t" + Utility.getVersion());
            bufferedWriter.newLine();
            bufferedWriter.append("STACK TRACE:");
            bufferedWriter.newLine();
            bufferedWriter.append("----------------------");
            bufferedWriter.newLine();
            for (int i =0;i<stackTrace.length;i++)
            {
                bufferedWriter.append("\t" + stackTrace[i].toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.write("----------------------");
            bufferedWriter.newLine();
            bufferedWriter.write("OTHER INFORMATION:");
            bufferedWriter.newLine();
            bufferedWriter.write("\t[This can optionally be filled in]");
            bufferedWriter.newLine();
            bufferedWriter.flush();
            fileWriter.flush();
            fileWriter.close();
            bufferedWriter.close();
        }
        catch(IOException e)
        {
            Utility.handleIT(e);
        }

    }

    public int getBugNumber()
    {
        return bugNumber;
    }
}