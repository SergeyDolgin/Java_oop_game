package units;

public class Raider extends Human{
    private int id = 0;
    private String strName = "";
    private int power;
    
    public Raider (){
        SetDefault();
        this.strName = "raider_" + Integer.valueOf(this.id).toString();
        super.SetName(this.strName);
        
    }

    public Raider (String inName){
        SetDefault();
        super.SetName(inName);
    }

    private void SetDefault(){
        temp++;
        this.id = temp;
        super.SetId(this.id);
        super.SetHealth(20);
        super.SetDamage(3);
        super.SetArmor(1);
        this.power = 10;

    }  
}
