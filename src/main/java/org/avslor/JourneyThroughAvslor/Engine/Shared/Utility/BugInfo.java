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

/*
 * This class will serve as a special class that can allow us to gather detailed bug information.
 * This class requires gameStateinformation.
 */
public class BugInfo implements iGameState
{
    private StackTraceElement[] stackTrace;
    private String message;
    private BugInfo(StackTraceElement[] stackTrace, String message)
    {
        this.stackTrace = stackTrace;
        this.message = message;
    }

    public static BugInfo createBugReport(StackTraceElement[] stackTrace, String message)
    {
        return new BugInfo(stackTrace,message);
    }

    public void Save()
    {

    }
}
