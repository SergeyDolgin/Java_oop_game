package units;


public class Arbalester extends Human{
    private int id = 0;
    private String strName = "";
    public int ammo;

    public Arbalester (){
        SetDefault();
        this.strName = "arbalester_" + Integer.valueOf(this.id).toString();
        super.SetName(this.strName);
        
    }

    public Arbalester (String inName){
        SetDefault();
        super.SetName(inName);
    }

    private void SetDefault(){
        temp++;
        this.id = temp;
        super.SetId(this.id);
        super.SetHealth(40);
        super.SetDamage(20);
        super.SetArmor(5);
        this.ammo = 5;
        }

    }