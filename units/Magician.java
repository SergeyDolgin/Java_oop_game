package units;

public class Magician extends Human{
    private int id = 0;
    private String strName = "";
    private int mana;

    public Magician (){
        SetDefault();
        this.strName = "magician_" + Integer.valueOf(this.id).toString();
        super.SetName(this.strName);
        
    }

    public Magician (String inName){
        SetDefault();
        super.SetName(inName);
    }

    private void SetDefault(){
        temp++;
        this.id = temp;
        super.SetId(this.id);
        super.SetHealth(45);
        super.SetDamage(25);
        super.SetArmor(5);
        this.mana = 10;
    }

}
