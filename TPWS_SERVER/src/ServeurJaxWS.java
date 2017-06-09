import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServeurJaxWS {

	public static void main(String[] args) {
		
		
		String url="http://192.168.0.104:8080/";
		Endpoint.publish(url, new BanqueService());
		System.out.println(url);
		

	}

}
