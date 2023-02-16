package units;

public class Sniper extends Human{
    private int id = 0;
    private String strName = "";
    private int ammo;

    public Sniper (){
        SetDefault();
        this.strName = "sniper_" + Integer.valueOf(this.id).toString();
        super.SetName(this.strName);
        
    }

    public Sniper (String inName){
        SetDefault();
        super.SetName(inName);
    }

    private void SetDefault(){
        temp++;
        this.id = temp;
        super.SetId(this.id);
        super.SetHealth(40);
        super.SetDamage(25);
        super.SetArmor(5);
        this.ammo = 10;
    }
}
