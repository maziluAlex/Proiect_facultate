
package echipamentbucatarie;
/**
@author Mazilu Alex
 */
public class EchipamentBucatarie {
           private String brand,culoare;
           private float pret,capacitate;
           private boolean displaytactil;
       
       //Constructor fara argumente
       EchipamentBucatarie(){
            brand="necunoscut";
            culoare="alb";
            pret=1.2f;
            capacitate=1.5f;
            displaytactil=false;
       }
       
       //Constructor cu argumente
       EchipamentBucatarie(String brand, String culoare, float pret, float capacitate, boolean displaytactil){
            this.brand=brand;
            this.culoare=culoare;
            this.pret=pret;
            this.capacitate=capacitate;
            this.displaytactil=displaytactil;
       }
       
       //Constructor de copiere
       EchipamentBucatarie(EchipamentBucatarie e){
            this.brand=e.brand;
            this.culoare=e.culoare;
            this.pret=e.pret;
            this.capacitate=e.capacitate;
            this.displaytactil=e.displaytactil;
       }
       
       public String getBrand(){
            return brand;}
       
       public String getCuloare(){
            return culoare;}
       
       public Float getPret(){
            return pret;}
       
       public Float getCapacitate(){
            return capacitate;}
       
       public Boolean getDisplaytactil(){
            return displaytactil;}
       
       public void setBrand(String brand){
            this.brand=brand;}
       
       public void setCuloare(String culoare){
            this.culoare=culoare;}
       
       public void setPret(Float pret){
            this.pret=pret;}
       
       public void setCapacitate(Float capacitate){
            this.capacitate=capacitate;}
       
       public void setDisplaytactil(Boolean displaytactil){
            this.displaytactil=displaytactil;}
       
       public String toString(){
            return brand+" || Culoare:"+culoare+" || Pret:"+pret+"lei || Capacitate:"+capacitate+"litri || Display tactil:"+ (displaytactil?" da":" nu");
       }
       
}
