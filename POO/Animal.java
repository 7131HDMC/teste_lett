
/** Classe para a abstração das caracteristicas e dos Animais
 * @author Hari Dasa
 */
public class  Animal
{
        private int idade;
        private float tamanho;
	private String som;
	Animal(int idade, float tam, String som)
	{
		this.idade = idade;
		this.tamanho = tam;
	}
	public String emitirSom()
        {
                return this.som;
        }

	public int  getIdade()
	{
		return this.idade;
	}
	public float getTamanho()
	{
		return this.tamanho;
	}
	/**@return Retornar as caracteristicas e ações do animal
	 * @author Hari Dasa
	 * */
	public String toString()
        {
                return "\nIdade: " + this.getIdade()+ "\nTamanho:" + this.getTamanho() + "\n Som:" + this.emitirSom();
        }

	
}

/** Interface para a caracteristica de voo presentes em  Morcego e Pato  
 * @author Hari Dasa
 * */
interface Voo
{
	public void Voar();
}

/**Classe que define as caracteristicas das Aves
 *@author Hari Dasa
 * */
class Aves extends Animal
{
	private String cor_pena;
	private int ovos;

	/**Construtor para iniciar as caracteristicas de Animal de uma dada Ave 
	 * @author Hari Dasa
	 * 
	 * */
	Aves(int idade, float tam, String som)
	{
		super(idade, tam, som);

	}
	public  void botarOvos(int quantidade)
	{
		System.out.println(quantidade);
		this.ovos = quantidade;
	}
	public int getOvos()
	{
		return this.ovos;
	}
	public void setPenaCor(String cor)
	{
		this.cor_pena = cor;
	}
	public String getPenaColor()
	{
		return this.cor_pena;
	}
}

/**Classe para a definição de caracteristicas e ações  dos animais que são mamiferos
 * @author Hari Dasa
 * */
class Mamiferos extends Animal{
	private String  pelosCor;
	private int amamentam;

	/**Construtor para iniciar as caracteristicas de Animal de uma dado Mamifero
         * @author Hari Dasa
         * */
	Mamiferos(int idade, float tam, String som)
	{
		super(idade, tam, som);
	}
	public void setPeloCor(String cor)
	{
		this.pelosCor = cor;
	}
	public String getPelosCor()
	{
		return this.pelosCor;	
	}
	
}	
