package units;

public class Villager extends Human{
    private int id = 0;
    private String strName = "";
    private int seeds;

    public Villager (){
        SetDefault();
        this.strName = "villager_" + Integer.valueOf(this.id).toString();
        super.SetName(this.strName);
        
    }

    public Villager (String inName){
        SetDefault();
        super.SetName(inName);
    }

    private void SetDefault(){
        temp++;
        this.id = temp;
        super.SetId(this.id);
        super.SetHealth(20);
        super.SetDamage(1);
        super.SetArmor(1);
        this.seeds = 5;
    }
    
}
