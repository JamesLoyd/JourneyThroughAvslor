package org.avslor.JourneyThroughAvslor.Engine;/*   Copyright 2013 James Loyd , Joshua Theze * *   Licensed under the Apache License, Version 2.0 (the "License"); *   you may not use this file except in compliance with the License. *   You may obtain a copy of the License at * *       http://www.apache.org/licenses/LICENSE-2.0 * *   Unless required by applicable law or agreed to in writing, software *   distributed under the License is distributed on an "AS IS" BASIS, *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. *   See the License for the specific language governing permissions and *   limitations under the License. */import org.avslor.JourneyThroughAvslor.Engine.Monsters.iCharacter;import org.avslor.JourneyThroughAvslor.Engine.Shared.iGameState;public class Player implements iGameState , iCharacter {	//STATS	private String name;	private String race;	private String className;	private String alignment;	private int level;	//constructor	public Player()	{	}		//other stuff     public String getName()     {         return name;     }     public String getRace()     {         return race;     }     public String getClassName()     {         return className;     }     public String getAlignment()     {         return alignment;     } }