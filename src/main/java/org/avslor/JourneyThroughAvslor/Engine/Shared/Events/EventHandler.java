package org.avslor.JourneyThroughAvslor.Engine.Shared.Events;
import org.avslor.JourneyThroughAvslor.Engine.Shared.Map.Map;
import org.avslor.JourneyThroughAvslor.Engine.Shared.Map.MapReader;
import java.util.concurrent.ConcurrentHashMap;
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
public class EventHandler implements iEventHandler
{
    ConcurrentHashMap eventHashMap = new ConcurrentHashMap();
    Map EventMap = null;
    public void setEventHashMap(ConcurrentHashMap eventHashMap)
    {
        this.eventHashMap = eventHashMap;
    }

    @Override
    public void callMap(MapReader mapReader)
    {
        EventMap = mapReader.returnMap();
    }

    @Override
    public boolean checkEvent()
    {
        return false;
    }
}
