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
public class BaseHumanoid extends AbstractMonster
{
    //fields
    private String nameOfHumanoid;
    private String role;
    private double hitPoints;
    private double attackPoints;
    private double defensePoints;
    private boolean canLoot;
    private Faction[] factionList;


    public BaseHumanoid(String nameOfHumanoid, double hitPoints, double attackPoints, double defensePoints)
    {
        this.nameOfHumanoid = nameOfHumanoid;
        this.hitPoints = hitPoints;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        canLoot = true;
        role = null;
        factionList = null;
    }

    /* not adding a constructor option for "role" or "factionList" yet 
     * because we're not sure how the variables will be *used*
     * just planting the seeds. */
    public BaseHumanoid(String nameOfHumanoid, double hitPoints, double attackPoints, double defensePoints, boolean canLoot)
    {
        this.nameOfHumanoid = nameOfHumanoid;
        this.hitPoints = hitPoints;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.canLoot = canLoot;
        role = null;
        factionList = null;
    }

    @Override
    public double attack()
    {
        return 0;
    }

    //Methods
    @Override
    public double receiveAttack()
    {
        return 0;
    }

    @Override
    public void buff(String stat, double amount)
    {

    }

    @Override
    public void displayHealthPoints()
    {

    }

    @Override
    public String getRole()
    {
        return role;
    }

    public String getName()
    {
        return nameOfHumanoid;
    }

    public void loot()
    {

    }

    public void interact()
    {
        System.out.println("Grrr.");
    }

    public String getFaction()
    {
        return null;
    }
}
