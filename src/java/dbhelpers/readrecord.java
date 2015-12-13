
package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Hero;


public class readrecord {
     private Connection conn;
    private ResultSet results;
    
   private Hero hero=new Hero();
   private int HeroID;
    
    public readrecord(int HeroID){
    
      
    Properties props=new Properties();
        InputStream instr=getClass().getResourceAsStream("dbcon.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(readrecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(readrecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String driver=props.getProperty("driver.name");
        String url=props.getProperty("Server.name");
        String username=props.getProperty("user.name");
        String passwd=props.getProperty("user.password");
        
        this.HeroID=HeroID;
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(readrecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn=DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(readrecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void doRead(){
         
         try {
             String query="SELECT * FROM HERO WHERE HeroID= ?";
             PreparedStatement ps=conn.prepareStatement(query);
             ps.setInt(1, HeroID);
             this.results=ps.executeQuery();
             this.results.next();
             
             hero.setHeroID(this.results.getInt("HeroID"));
             hero.setHeroName(this.results.getString("HeroName"));
             hero.setProperty(this.results.getString("property"));
             hero.setHLevel(this.results.getInt("HLevel"));
         } catch (SQLException ex) {
             Logger.getLogger(readrecord.class.getName()).log(Level.SEVERE, null, ex);
         }
}
        
        public Hero getHero(){
            return this.hero;
        }
        
}
