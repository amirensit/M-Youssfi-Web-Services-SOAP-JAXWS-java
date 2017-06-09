import ws.BanqueService;
import ws.BanqueWS;

public class ClientWS {

	public static void main(String[] args) {
		BanqueService stub=new BanqueWS().getBanqueServicePort();
		System.out.println(stub.conversionEuroDh(10));
		System.out.println(stub.test());

	}

}
