
package model;

public class Hero {
    
    private int HeroID;
    private String HeroName;
    private String Property;
    private int HLevel;
    

    

    public Hero() {
        this.HeroID = 0;
        this.HeroName = "";
        this.Property = "";
        this.HLevel= 0;
        
    }
    
    
    public Hero(int HeroID, String HeroName, String Property, int HLevel) {
        this.HeroID = HeroID;
        this.HeroName = HeroName;
        this.Property = Property;
        this.HLevel = HLevel;
        
    }
    
    
    public int getHeroID() {
        return HeroID;
    }

    public void setHeroID(int HeroID) {
        this.HeroID = HeroID;
    }

    public String getHeroName() {
        return HeroName;
    }

    public void setHeroName(String HeroName) {
        this.HeroName = HeroName;
    }

    public String getProperty() {
        return Property;
    }

    public void setProperty(String Property) {
        this.Property = Property;
    }

    
    public void setHLevel(int HLevel) {
        this.HLevel = HLevel;
    }
    public int getHLevel() {
        return HLevel;
    }

    @Override
    public String toString() {
        return "Hero{" + " HeroID=" + HeroID + ", HeroName=" + HeroName + ", Property" + Property + ", HLevel=" + HLevel + '}';
    }
    }
    
    
