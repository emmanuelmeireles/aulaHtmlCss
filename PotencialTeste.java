import javax.swing.JOptionPane;

public class PotencialTeste {
    public static void main( String args[] )
    {
        String PrimeiroNumero,SegundoNumero;
        float Base, Expoente,Resultado, Potencial;
        PrimeiroNumero = JOptionPane.showInputDialog( "Entra com a base:" );
        SegundoNumero = JOptionPane.showInputDialog( "Entra com o expoente:" );
        Base = Integer.parseInt( PrimeiroNumero );
        Expoente = Integer.parseInt( SegundoNumero );
        if (Expoente < 0 ){
            Potencial = 0-Expoente;
        }
        else {
            Potencial = Expoente;
        }
        Resultado=1;
        while (Potencial !=0 ){
            Resultado = Resultado * Base;
            Potencial = Potencial-1;
        }
        if (Expoente<0 && Base !=0){
            Resultado = 1/Resultado;
        }
        else{
            if(Base ==0){
                JOptionPane.showMessageDialog( null, "A potencia é um valor finito " );}
            }
        JOptionPane.showMessageDialog( null, "A potencia é " + Resultado, "Resultado", JOptionPane.PLAIN_MESSAGE );
        System.exit(0);
    }
}
