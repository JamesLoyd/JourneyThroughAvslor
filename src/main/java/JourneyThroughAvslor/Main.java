package JourneyThroughAvslor;

import JourneyThroughAvslor.Engine.Monsters.BaseHumanoid;

/*   Copyright 2013 James Loyd
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
public class Main
{
    public static void main(String args[])
    {
        System.out.println("Coming soon!");
        System.out.println("Creating a Humanoid!");
        
        BaseHumanoid test = new BaseHumanoid("tester", 100, 18, 75, false);

        System.out.println("The name of the Humanoid is: " + test.getName());
        
        System.out.print("The Humanoid says: ");
        test.interact();

        assert test.getRole() == null;
        assert test.getFaction() == null;

        System.out.println("Things seem to work, at least.");
    }
}
