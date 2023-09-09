import java.util.Scanner; //Importar o pacote java.util:


public class ContaTerminal{

    public static void main( String [] args) throws Exception{

        //Todo: Conhecer e importar e classe Scanner 
        //exibir mesg para os nossos user;
        Scanner entrada= new Scanner(System.in); //Instanciar e criar um objeto Scanner usando o dispositivo padrão de entrada (System.in):

    int numero;
    int agencia;
    String NomeCliente;
    double saldo;   

    System.out.println("\n *******************************************************************************\n" );
    System.out.printf("\n Nome: ");
    NomeCliente= entrada.nextLine();
    System.out.printf("\n Nº da Agência:");
    agencia=entrada.nextInt();
    System.out.printf("\n Nº da conta:");
    numero= entrada.nextInt();
    System.out.printf("\n Saldo:");
    saldo= entrada.nextDouble();
    System.out.println("\n ***********************************************************************************************************************************************************************************\n" );

    System.out.println("\n Olá " + NomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é : " + agencia + ", o Nº da conta : " + numero + " e seu saldo R$ " + saldo + " , já está disponível para saque.");
    
    System.out.println("\n *************************************************************************************************************************************************************************************\n" );

   
}
}