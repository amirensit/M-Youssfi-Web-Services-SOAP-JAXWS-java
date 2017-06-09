package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName="BanqueWS")
public class BanqueService {
	@WebMethod(operationName="conversionEuroDh")
	public double conversion(@WebParam(name="montant")double mt)
	{
		return mt*11;
		
	}
	
	public String test()
	{
		return "test";
	}

}
