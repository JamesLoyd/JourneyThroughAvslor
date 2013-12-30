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
public class Goblin extends AbstractMonster
{

    //fields
    private String nameOfGoblin;
    private double hitPoints;
    private double attackPoints;
    private double defensePoints;

    //Constructor
    public Goblin()
    {
        nameOfGoblin = "Steve";
        hitPoints = 100;
        attackPoints = 50;
        defensePoints = 50;
    }
    public Goblin(String nameOfGoblin, double hitPoints, double attackPoints, double defensePoints)
    {
        this.nameOfGoblin = nameOfGoblin;
        this.hitPoints = hitPoints;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }

    //Methods
    @Override
    public double attack()
    {
        return Utility.getAttackDamage(attackPoints, 12);
    }

    @Override
    public void raiseDefense()
    {

    }

    @Override
    public void raiseAttack()
    {

    }

    @Override
    public void displayHealthPoints()
    {

    }

    @Override
    public String getRole()
    {
        return null;
    }

    public String getName()
    {
        return "Name";
    }
}
