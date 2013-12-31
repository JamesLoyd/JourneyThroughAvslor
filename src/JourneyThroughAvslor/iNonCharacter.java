package JourneyThroughAvslor;
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

/* This interface is a contract for all classes that are monsters in the game.
* All monster classes must provide their own implementation for these methods.
*/
public interface iNonCharacter
{
    abstract double attack();
    abstract double receiveAttack();

    /* buff and debuff take in the name of the stat to debuff and the method
     * works out which stat to raise internally; seems better than having
     * individual buff/debuff methods for each stat */
    abstract void buff(String stat);
    abstract void debuff(String stat);

    abstract void displayHealthPoints();
    abstract void loot(boolean canLoot);
    abstract String getRole();
}
