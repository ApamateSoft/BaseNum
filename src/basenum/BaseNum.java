package basenum;

import java.io.Serializable;

 /**
 * @author ApamateSoft
 * @version 1.0.2
 */

public class BaseNum implements Serializable {
    
    // CONSTANS ////////////////////////////////////////////////////////////////////////////////////
    private static final long serialVersionUID = 1L;

    public static final byte BIN =  2;
    public static final byte OCT =  8;
    public static final byte HEX = 16;
    
    // ATTRIBUTES //////////////////////////////////////////////////////////////////////////////////
    
    public char[] alphabet = new char[125];
    public byte base;
    
    // CONSTRUCTORS ////////////////////////////////////////////////////////////////////////////////
    
    public BaseNum() {
        this.base = BIN;
        setDefaultAlphabet();
    }
    
    public BaseNum(byte base) {
        this.base = base;
        setDefaultAlphabet();
    }
    
    public BaseNum(char[] alphabet) {
        byte base = BIN;
        setAlphabet(alphabet);
    }
    
    public BaseNum(byte base, char[] alphabet) {
        this.base = base;
        setAlphabet(alphabet);
    }

    // SETTERS /////////////////////////////////////////////////////////////////////////////////////
    
    public void setBase(byte base) {
        this.base = base;
    }
    
    public void setAlphabet(char[] alphabet) {
        for(byte i=0; i<this.alphabet.length; i++) this.alphabet[i] = '■';
        for(byte i=0; i<alphabet.length; i++) this.alphabet[i] = alphabet[i];
    }
    
    // GETTERS /////////////////////////////////////////////////////////////////////////////////////
    
    public byte getBase() {
        return base;
    }
    
    public char[] getAlphabet() {
        return alphabet;
    }
    
    // METHODOS ////////////////////////////////////////////////////////////////////////////////////
    
    public void setDefaultAlphabet() {
        
        byte i = 0;

        alphabet[i++] = '0';
        alphabet[i++] = '1';
        alphabet[i++] = '2';
        alphabet[i++] = '3';
        alphabet[i++] = '4';
        alphabet[i++] = '5';
        alphabet[i++] = '6';
        alphabet[i++] = '7';
        alphabet[i++] = '8';
        alphabet[i++] = '9';

        alphabet[i++] = 'a';
        alphabet[i++] = 'b';
        alphabet[i++] = 'c';
        alphabet[i++] = 'd';
        alphabet[i++] = 'e';
        alphabet[i++] = 'f';
        alphabet[i++] = 'g';
        alphabet[i++] = 'h';
        alphabet[i++] = 'i';
        alphabet[i++] = 'j';
        alphabet[i++] = 'k';
        alphabet[i++] = 'l';
        alphabet[i++] = 'm';
        alphabet[i++] = 'n';
        alphabet[i++] = 'o';
        alphabet[i++] = 'p';
        alphabet[i++] = 'q';
        alphabet[i++] = 'r';
        alphabet[i++] = 's';
        alphabet[i++] = 't';
        alphabet[i++] = 'u';
        alphabet[i++] = 'v';
        alphabet[i++] = 'w';
        alphabet[i++] = 'x';
        alphabet[i++] = 'y';
        alphabet[i++] = 'z';
        
        alphabet[i++] = 'A';
        alphabet[i++] = 'B';
        alphabet[i++] = 'C';
        alphabet[i++] = 'D';
        alphabet[i++] = 'E';
        alphabet[i++] = 'F';
        alphabet[i++] = 'G';
        alphabet[i++] = 'H';
        alphabet[i++] = 'I';
        alphabet[i++] = 'J';
        alphabet[i++] = 'K';
        alphabet[i++] = 'L';
        alphabet[i++] = 'M';
        alphabet[i++] = 'N';
        alphabet[i++] = 'O';
        alphabet[i++] = 'P';
        alphabet[i++] = 'Q';
        alphabet[i++] = 'R';
        alphabet[i++] = 'S';
        alphabet[i++] = 'T';
        alphabet[i++] = 'U';
        alphabet[i++] = 'V';
        alphabet[i++] = 'W';
        alphabet[i++] = 'X';
        alphabet[i++] = 'Y';
        alphabet[i++] = 'Z';
        
        alphabet[i++] = '!';
        alphabet[i++] = '"';
        alphabet[i++] = '#';
        alphabet[i++] = '$';
        alphabet[i++] = '%';
        alphabet[i++] = '&';
        alphabet[i++] = '\'';
        alphabet[i++] = '(';
        alphabet[i++] = ')';
        alphabet[i++] = '*';
        alphabet[i++] = '+';
        alphabet[i++] = ',';
        alphabet[i++] = '-';
        alphabet[i++] = '.';
        alphabet[i++] = '/';
        alphabet[i++] = ':';
        alphabet[i++] = ';';
        alphabet[i++] = '<';
        alphabet[i++] = '=';
        alphabet[i++] = '>';
        alphabet[i++] = '?';
        alphabet[i++] = '@';
        alphabet[i++] = '[';
        alphabet[i++] = (char) 92;
        alphabet[i++] = ']';
        alphabet[i++] = '^';
        alphabet[i++] = '_';
        alphabet[i++] = '`';
        alphabet[i++] = '{';
        alphabet[i++] = '~';
        
        alphabet[i++] = 'ñ';
        alphabet[i++] = 'Ñ';
        alphabet[i++] = 'á';
        alphabet[i++] = 'à';
        alphabet[i++] = 'ä';
        alphabet[i++] = 'Á';
        alphabet[i++] = 'À';
        alphabet[i++] = 'Ä';
        alphabet[i++] = 'é';
        alphabet[i++] = 'è';
        alphabet[i++] = 'ë';
        alphabet[i++] = 'É';
        alphabet[i++] = 'È';
        alphabet[i++] = 'Ë';
        alphabet[i++] = 'í';
        alphabet[i++] = 'ì';
        alphabet[i++] = 'ï';
        alphabet[i++] = 'Í';
        alphabet[i++] = 'Ì';
        alphabet[i++] = 'Ï';
        alphabet[i++] = 'ó';
        alphabet[i++] = 'ò';
        alphabet[i++] = 'ö';
        alphabet[i++] = 'Ó';
        alphabet[i++] = 'Ò';
        alphabet[i++] = 'Ö';
        alphabet[i++] = 'ú';
        alphabet[i++] = 'ù';
        alphabet[i++] = 'ü';
        alphabet[i++] = 'Ú';
        alphabet[i++] = 'Ù';
        alphabet[i++] = 'Ü';
        alphabet[i++] = 'ç';

    }
    
    public byte[] getBytes(long dec) {
        byte n = (byte) (dec==0 ?1 :Math.ceil(Math.log10(dec+1)/Math.log10(base)));
        byte[] out = new byte[n];
        for(byte i=0; i<n; i++) {
            out[i] = (byte)(dec%base);
            dec /= base; 
        }
        return out;
    }
    
    public byte[] toBytes(String in) {
        byte n = (byte) in.length();
        byte[] o = new byte[ n ];
        for(byte i=0; i<n; i++) {
            o[i] = 0;
            char c = in.charAt(i);
            for(byte j=0; j<alphabet.length; j++) if(alphabet[j]==c) { o[i] = j; break; }  
        }
        return invert(o);
    }
    
    public String converter(long dec) {
        return toString( getBytes(dec) );
    }

    public String toString(byte[] in) {
        String out = "";
        for(int i=in.length-1; i>=0; i--) out += alphabet[ in[i] ]+"";
        return out;
    }
    
    public long toLong(byte[] in) {
        long out = 0;
        for(byte i=0; i<in.length; i++)  out += in[i]*Math.pow(base, i);
        return out;
    }

    public long toLong(String in) {
        return toLong(toBytes(in));
    }
    
    public byte[] invert(byte[] in) {
        byte n = (byte) in.length;
        byte[] out = new byte[n];
        for(byte i=0; i<n; i++) out[i] = in[n-i-1];
        return out;
    }
    
    public String printAlphabet() {
        String o = "";
        o += "BaseNum v1.0.2: alphabet\n";
        o += "Code -> Character\n";
        for(byte i=0; i<alphabet.length; i++) o += i+" -> "+alphabet[i]+"\n";
        return o;
    }

}