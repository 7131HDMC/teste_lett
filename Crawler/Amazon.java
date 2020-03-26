import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import java.io.IOException;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Scanner;


/**Classe produto que contem as informações do produto capturado
 * @author Hari Dasa
 * */
class Product
{
	private String title;
	private String seller;
	private String price;
	private String description;

	void setDesc(String desc)
	{
		this.description = desc;
	}
	void setPrice(String price)
	{
		this.price = price;
	}
	void setSeller(String seller)
	{
		this.seller = seller;
	}
	void setTitle(String title)
	{
		this.title = title;
	}
	
	/**função que retorna as informações deste produto
	 * @author Hari Dasa
	 * */
	public String toString()
	{
		return  "Produto\n	Titulo: " +this.title + "\n	Vendedor: " + this.seller  + "\n	Preço: " + this.price + "\n	Descrição: " + this.description + "  \n}";
	}
}

/**Classe com intuito de disponibilizar as constantes necessárias para rastrear os dados na web page
 * @author Hari Dasa
 * */
final class ProdutcSelectors
{
	/**Id selector
	 * */
	public static final String TITLE = "productTitle";
	public static final String DESCRIPTION  = "productDescription" ;
	public static final String SELLER = "bylineInfo";
	
	/**Class selector
	 * */
	public static final String PRICE = "a-size-medium a-color-price offer-price a-text-normal";

}

/**Classe que captura um produto da amazon web e armazena no objeto produto da classe Amazon para então mostra-lo em formato string
 * @author Hari Dasa
 * */
public class Amazon
{
	private Document doc;
	public Product product;
	Scanner in;

	Amazon()
	{
                product = new Product();
		in = new Scanner(System.in);
		setUrl();	
	}

	/**Função que conecta com o servidor da amazon por meio de uma url que referencia um produto específico, 
	 * a página retornada será alvo para buscar as informações quanto ao produto
	 * @author Hari Dasa  
	 * */
	private void createDoc(String url)
	{
		try{
			/**Cria um requisição ao servidor e retorno do DOM
			 * */
			doc = Jsoup.connect(url).get();
			
			
		       	Element productTitle = doc.getElementById(ProdutcSelectors.TITLE);
	       		Element productSeller = doc.getElementById(ProdutcSelectors.SELLER);
	       		Elements productPrice = doc.getElementsByClass(ProdutcSelectors.PRICE);
               		Element productDesc = doc.getElementById(ProdutcSelectors.DESCRIPTION);	
		 	product.setDesc(productDesc.text());
	       		product.setPrice(productPrice.text());
	       		product.setSeller(productSeller.text());
	       		product.setTitle(productTitle.text());
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void setUrl()
	{
		System.out.println("Digite a url do produto da Amazon que deseja capturar");
		String url = in.nextLine();
		createDoc(url);
	}

	
	public static void main(String[] args)
	{
		Amazon productAmazon = new Amazon();
		System.out.println(productAmazon.product.toString());
	}


}
