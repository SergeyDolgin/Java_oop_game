package units;

public class Monc extends Human{
    private int id = 0;
    private String strName = "";
    private int mana;

    public Monc (){
        SetDefault();
        this.strName = "monc_" + Integer.valueOf(this.id).toString();
        super.SetName(this.strName);
        
    }

    public Monc (String inName){
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
        this.mana = 10;
    }
}
