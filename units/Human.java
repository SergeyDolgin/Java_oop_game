package units;

public abstract class Human {
    private int id = 0, health = 0, damage = 0, armor = 0;
    protected static int temp = 0;
    protected static int r = 0;
    private String name = "";

    public Human(){
    
    }

    public int GetId(){return this.id;}
    public int GetHealth(){return health;}
    public int GetDamageMax(){return damage;}
    public String GetName(){return this.name;}
    public int GetArmor(){return this.armor;}
    
    
    public void SetId(int inId){this.id = inId;}
    public void SetName(String inName){this.name = inName;}
    public void SetHealth(int inHealth){this.health = inHealth;}
    public void SetDamage(int inDamage){this.damage = inDamage;}
    public void SetArmor(int inArm){this.armor = inArm;}
    
    public void GetInfo(){
        System.out.printf("#%d name: %s, hp=%d, damage=%d, armor=%d, type: %s \n", id, name, health, damage, armor, this.getClass().getSimpleName());
    }

    public void GetDamage(int damage){
        if ((this.health + this.armor) - damage> 0) {this.health = this.health + this.armor - damage;}
        else {
            this.health = this.health + this.armor - damage;
            System.out.printf("#%d name: %s, type: %s is DEAD \n", id, name, this.getClass().getSimpleName());}
        }

    public void Attack(Human target) {
        target.GetDamage(damage);
    }
  
    
}
