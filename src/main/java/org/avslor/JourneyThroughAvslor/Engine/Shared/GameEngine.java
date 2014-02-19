package org.avslor.JourneyThroughAvslor.Engine.Shared;
import org.avslor.JourneyThroughAvslor.Engine.Shared.Events.Event;
import org.avslor.JourneyThroughAvslor.Engine.Shared.Events.EventHandler;
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


public class GameEngine implements Runnable
{
    public void run()
    {
        System.out.println("Let's Get this thread going");
        Event event = new Event("event");
        EventHandler eventHandler = EventHandler.createEventHandler(event);
        eventHandler.toString();
    }
}
