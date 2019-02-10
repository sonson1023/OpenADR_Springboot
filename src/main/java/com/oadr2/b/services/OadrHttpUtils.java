package com.oadr2.b.services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.oadr2.b.OadrPayload;
import com.oadr2.b.OadrSignedObject;
import com.oadr2.b.services.OadrMessageUtils;
  
public class OadrHttpUtils {

	private final String USER_AGENT = "Mozilla/5.0";
	private final String urlStr;
	private String serviceUrl;

	private JAXBContext context;
	private Marshaller mashaller;
	private Unmarshaller unmarshaller;

	private URL url;

	private HttpURLConnection con;
	private StringWriter sw = new StringWriter();

	public OadrHttpUtils(String oadrVtnURL) throws JAXBException, IOException {
		// TODO Auto-generated constructor stub
		this.urlStr = oadrVtnURL; 
		 context = JAXBContext.newInstance("com.oadr2.b"); 
		 mashaller = context.createMarshaller();
		 unmarshaller = context.createUnmarshaller();

	}

	// HTTP Post request
	private void sendingPostRequest(OadrPayload payload) throws Exception {

		System.out.println("Send = ");
		StringWriter oadrMsg = new StringWriter();
		mashaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		mashaller.marshal(payload, oadrMsg);
		mashaller.marshal(payload, System.out);

		System.out.println();
		System.out.println();
		System.out.println();

		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(oadrMsg.toString());
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String output;
		StringBuffer response = new StringBuffer();

		System.out.println("Recevice = ");

		while ((output = in.readLine()) != null) {
			response.append(output);
			System.out.println(output);
		}
		in.close();

		StringReader reader = new StringReader(response.toString());
		OadrPayload oadrPayload = null;

		oadrPayload = (OadrPayload) unmarshaller.unmarshal(reader);
		OadrSignedObject oadrSignedObject = oadrPayload.getOadrSignedObject();

		OadrMessageUtils.OADRProcessing(oadrSignedObject);
	}

	private void configureURL(String serviceUrl) {
		try {
			url = new URL(urlStr + serviceUrl);
			con = (HttpURLConnection) url.openConnection();

			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/xml; charset=utf-8");
			con.setDoOutput(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendEiRegisterParty(OadrPayload payload) {
		try {
			configureURL("EiRegisterParty"); 
			sendingPostRequest(payload);

			System.out.println("\n");
		} catch (JAXBException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sendPoll(OadrPayload payload) {
		try {
			configureURL("OadrPoll"); 
  
			sendingPostRequest(payload);

			System.out.println("\n");
		} catch (JAXBException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

	public void sendRegisterReport(OadrPayload payload) {
		try {
			configureURL("EiReport");
			sw = new StringWriter();
			 
			sendingPostRequest(payload);

			System.out.println("\n");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public void sendCreatedReport(OadrPayload oadrPayload) {
		// TODO Auto-generated method stub
		try {
			configureURL("EiReport");
			sw = new StringWriter();
			 
			sendingPostRequest(oadrPayload);

			System.out.println("\n");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	public void sendUpdateReport(OadrPayload oadrPayload) {
		try {
			configureURL("EiReport");
			sw = new StringWriter();
			 
			sendingPostRequest(oadrPayload);

			System.out.println("\n");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	
}
