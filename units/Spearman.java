package units;

public class Spearman extends Human {
    private int id = 0;
    private String strName = "";
    private int power;
    
    public Spearman (){
        SetDefault();
        this.strName = "spearman_" + Integer.valueOf(this.id).toString();
        super.SetName(this.strName);
        
    }

    public Spearman (String inName){
        SetDefault();
        super.SetName(inName);
    }

    private void SetDefault(){
        temp++;
        this.id = temp;
        super.SetId(this.id);
        super.SetHealth(20);
        super.SetDamage(10);
        super.SetArmor(1);
        this.power = 7;

    }  
}
