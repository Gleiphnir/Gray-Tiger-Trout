/**
 * 
 */
package icons;

/**
 * @author Adrien
 *
 */
public class Flags {
	public boolean MeleeFlag;
	public boolean ManeuverFlag;
	public boolean RerollFlag;
	public boolean SaveFlag;
	public boolean MagicFlag;
	public boolean MissileFlag;
	public boolean addFaceValue;
	public boolean armyModifier;
	public int valueMultiplier;
	public int valueModifier;
	
	public Flags resetFlags(){
		this.MagicFlag = false;
		this.ManeuverFlag = false;
		this.MeleeFlag = false;
		this.MissileFlag = false;
		this.RerollFlag = false;
		this.SaveFlag = false;
		this.addFaceValue = false;
		this.armyModifier = false;
		this.valueMultiplier = 1;
		this.valueModifier = 0;
		return this;
	}
}
