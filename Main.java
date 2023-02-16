/*
 * Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. 
 * Для каждого сформировать список свойств и возможных действий. Напрнимер свойство скорость, действие нанести удар. 
 * Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. Создать этот класс. 
 * Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. В основной программе создать по одному экземпляру каждого типа персонажей.
 * 
 */

 import units.*;

 public class Main {
 
    public static void main(String[] args) {
// создание новых героев
        Sniper name1 = new Sniper("Jimmy");
        Raider name2 = new Raider("Jerry");
        Spearman name3 = new Spearman("Max");
        Villager name4 = new Villager("Kelvin");
        Arbalester name5 = new Arbalester("Adren");
        Magician name6 = new Magician("Garry");
        Monc name7 = new Monc("Kirill");
        
// вывод  на экран героев и их характеристик
        System.out.println("---------");   
        name1.GetInfo();
        name2.GetInfo();
        name3.GetInfo();       
        name4.GetInfo();
        name5.GetInfo();
        name6.GetInfo();
        name7.GetInfo();      

// пример атаки героев и получения урона
        System.out.println("name2 атакует name3");  
        name2.Attack(name3);
        name2.GetInfo();
        name3.GetInfo();
        System.out.println("name7 атакует name2");  
        name7.Attack(name2);
        name7.GetInfo();
        name2.GetInfo();

    }      
    
 }
