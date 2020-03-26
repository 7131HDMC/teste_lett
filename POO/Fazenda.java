import java.util.Scanner;


class Pato extends Aves implements Voo
{
	float altitude;
        Pato(int idade,float tamanho, String  som, float altitude)
        {
                super(idade,tamanho, som);
		this.altitude = altitude;
        }
        public void Voar(){
                System.out.printf("O pato voa a %d do chão.",this.altitude);
        }
	public String toString()
        {
		                return "\nIdade: " + this.getIdade()+ "\nTamanho:" + this.getTamanho() + "\n Som:" + this.emitirSom() + "\n Altura do Voo:" + this.altitude;
	}
}


class Galinha extends Aves 
{
        Galinha(int idade, float tamanho, String som)
        {
                super(idade,tamanho, som);
        }
}

class Vaca extends Mamiferos
{
        Vaca(int idade, float tamanho, String som)
        {
                super(idade,tamanho, som);
        }
}

class Morcego extends Mamiferos implements Voo
{
	float altitude;
	Morcego(int idade, float tamanho, String som, float altitude)
        {
                super(idade,tamanho, som);
		this.altitude = altitude;
        }
 	public void Voar(){
                System.out.printf("O Morcego voa a %d do chão.", this.altitude);
        }

	public String toString()
        {
                                return "\nIdade: " + this.getIdade()+ "\nTamanho:" + this.getTamanho() + "\n Som:" + this.emitirSom() + "\n Altura do Voo:" + this.altitude;
        }


}

/**Classe Fazenda que contém os 4 animais e cuida deles
 *  @author Hari Dasa
 * */
public class Fazenda
{
	private Vaca vaca;
	private Galinha galinha;
	private Pato pato;
	private Morcego morcego;
	Scanner in;
    	
	Fazenda(){
		in = new Scanner(System.in);
		setGalinha();
		setVaca();
		setPato();
		setMorcego();
	}

	void setGalinha(){
                float tam;
                int   idade;
                String som;               
	       	System.out.println("Galinha");
                System.out.println("Tamanho");
                tam = in.nextFloat();
                System.out.println("Idade");
                idade = in.nextInt(); in.nextLine();
                System.out.println("Som");
                som = in.nextLine();
                galinha = new Galinha(idade, tam, som);

        }

	void setVaca(){
                float tam;
                int   idade;
                String som;
		System.out.println("Vaca");
                System.out.println("Tamanho");
                tam = in.nextFloat();
                System.out.println("Idade");
                idade = in.nextInt();
                System.out.println("Som");in.nextLine();
                som = in.nextLine();
                vaca = new Vaca(idade, tam, som);

        }

	void setPato(){
                float tam, alt;
                int   idade;
                String som;
		System.out.println("Pato");
                System.out.println("Tamanho");
                tam = in.nextFloat();
                System.out.println("Idade");
                idade = in.nextInt();in.nextLine();
                System.out.println("Som");
                som = in.nextLine();
		System.out.println("Altitude do voo");
                alt = in.nextFloat();
                pato = new Pato(idade, tam, som, alt);

        }


	void setMorcego(){
		float tam, alt;
		int   idade;
		String som;
		System.out.println("Morcego");
		System.out.println("Tamanho");
		tam = in.nextFloat();
		System.out.println("Idade");
		idade = in.nextInt();in.nextLine();
		System.out.println("Som");
		som = in.nextLine();
		System.out.println("Altitude do voo");
		alt = in.nextFloat();
		morcego = new Morcego(idade, tam, som, alt);

	}

	public String toString()
	{
		return "Morcego{\n" + morcego.toString() + "}\n" + "Vaca{\n"+ vaca.toString() +"}\n" +"Galinha{\n"+ galinha.toString() +"}\n" + "Pato{\n"+ pato.toString() +"}\n";	
	}
}


