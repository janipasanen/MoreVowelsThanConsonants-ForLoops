/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detairmineifastringhasmorewelesthanconsonantsusingforloops;

/**
 *
 * @author jani
 */


public class DetairmineIfAStringHasMoreWelesThanConsonantsUsingForLoops {
    
    static final public String[] VOWELS = new String[] {"a","e","i","o","u","y","å","ä","ö"};
    static final public String[] CONSONANTS = new String[] {"b","c","d","f","g","h","j","k","l","m","n","q","r","s","t","v","w","x","z"};
    static String str = null; 
    static private int nrvwls = 0;
    static private int nrcnsnts = 0;
    static final String  S = "vioajdosivwjoswjvodjvoivjoiewjvoijoidsajvoijvoajovejvoiajofdivjoa"
            + "vaivjoijviorjoiaejvoirejåäaäådåsöålfaqaåpölfkjewpjäjfewölpajfasdoijfcolas"
            + "voiawejvwpvjweporjvweoivjwoeirjvwoeijvoweijwuopäöaeouiuåaediöäaioeoeijåää";
        
    static final int L = S.length();
    static private int vwlsL;
    static private int cnsntsL;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        vwlsL = VOWELS.length;
        cnsntsL = CONSONANTS.length;

        //System.out.println("consonants=" +consonants[9]);
        
            for (int i = 0; i < L; i++) {
                
                
                for (int ii = 0; ii < vwlsL; ii++) {
                    str = (S.substring(i, i+1));
                    if (str.equals(VOWELS[ii])) {
                        nrvwls++;
                        
                    // System.out.println("vowels = " + str + " " + vowels[ii]);
                        
                    }
                }
        
                for (int iii = 0; iii < cnsntsL; iii++) {
                    str = (S.substring(i, i+1));
                    if (str.equals(CONSONANTS[iii])) {
                        nrcnsnts++;
                    //    System.out.println("consonants = " + str + " " +  consonants[iii]);
                    }
                }
            }
        if (nrvwls > nrcnsnts){
            System.out.println("String S has more vowels than consonants."); 
            System.out.println("Number of vowels = " + nrvwls);
            System.out.println("Number of consonants = " + nrcnsnts); 
            
        }
        else
        {
            
            System.out.println("String S has more consonants than vowels.");
            System.out.println("Number of vowels = " + nrvwls);
            System.out.println("Number of consonants = " + nrcnsnts); 
        }
            
    }
}