package com.oadr2.b.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.channels.ReadPendingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.apache.http.HttpStatus;

import com.oadr2.b.OadrSignedObject;
import com.oadr2.b.OadrTransports.OadrTransport;
import com.oadr2.b.ObjectFactory;
import com.oadr2.b.xcal.Dtstart;
import com.oadr2.b.xcal.DurationPropType;
import com.oadr2.b.*;
import com.oadr2.b.OadrProfiles.OadrProfile;
public class OadrMessageUtils {

	public static final String version = "2.0b";
	final static ObjectFactory factory = new ObjectFactory();
	private static String requestID;

	private static void Out(String message) {
		try {
			// System.out.println(message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void OADRProcessing(OadrSignedObject oadrSignedObject) {

		try {
			if (oadrSignedObject.getOadrPoll() != null) {
				//
			} else if (oadrSignedObject.getOadrQueryRegistration() != null) {
				//
				// } else if (oadrSignedObject.getOadrRequestReregistration() !=
				// null) {
				//
				// } else if (oadrSignedObject.getOadrRequestReregistration() !=
				// null) {
				//
			} else if (oadrSignedObject.getOadrCreatedPartyRegistration() != null) {

				Iterator<OadrProfile> itProfile;
				Iterator<OadrTransport> itTransport;
				OadrTransports transports;
				OadrTransport transport;
				OadrCreatedPartyRegistration oadr = oadrSignedObject.getOadrCreatedPartyRegistration();

				EiResponse response = oadr.getEiResponse();
				if (checkRespCode(response) == true) {
					Out("VtnID = " + oadr.getVtnID());
					itProfile = oadr.getOadrProfiles().getOadrProfiles().iterator();

					while (itProfile.hasNext()) {
						OadrProfile profile = itProfile.next();
						Out(profile.getOadrProfileName());

						transports = profile.getOadrTransports();
						itTransport = transports.getOadrTransports().iterator();
						while (itTransport.hasNext()) {
							transport = itTransport.next();
							Out("oadTransportName = " + transport.getOadrTransportName().value());
						}
					}

					if (oadr.getOadrRequestedOadrPollFreq() != null) {
						DurationPropType duration = oadr.getOadrRequestedOadrPollFreq();
						String val = duration.getDuration();
						Out("duration = " + val);
					}

				}
			}
			// else if (oadrSignedObject.getOadrCreatePartyRegistration() !=
			// null) {
			//
			// } else if (oadrSignedObject.getOadrCanceledPartyRegistration() !=
			// null) {
			//
			// } else if (oadrSignedObject.getOadrCancelPartyRegistration() !=
			// null) {
			//
			// } else if (oadrSignedObject.getOadrUpdatedReport() != null) {
			//
			// } else if (oadrSignedObject.getOadrUpdateReport() != null) {
			//
			// }
			else if (oadrSignedObject.getOadrRegisteredReport() != null) {
				OadrRegisteredReport registeredReport = oadrSignedObject.getOadrRegisteredReport();
				EiResponse response = registeredReport.getEiResponse();
				if (checkRespCode(response)) {
					System.out.println("a");
				}

			}
			// else if (oadrSignedObject.getOadrRegisterReport() != null) {
			//
			// }
			// else if (oadrSignedObject.getOadrCreatedReport() != null) {
			//
			// }
			// else if (oadrSignedObject.getOadrCreateReport() != null) {
			//
			// } else if (oadrSignedObject.getOadrCanceledReport() != null) {
			//
			// } else if (oadrSignedObject.getOadrCancelReport() != null) {
			//
			// } else if (oadrSignedObject.getOadrCreatedOpt() != null) {
			//
			// } else if (oadrSignedObject.getOadrCreateOpt() != null) {
			//
			// } else if (oadrSignedObject.getOadrCanceledOpt() != null) {
			//
			// } else if (oadrSignedObject.getOadrCancelOpt() != null) {
			//
			// }
			else if (oadrSignedObject.getOadrResponse() != null) {

			}
			// else if (oadrSignedObject.getOadrRequestEvent() != null) {
			//
			// } else if (oadrSignedObject.getOadrCreatedEvent() != null) {
			//
			// } else if (oadrSignedObject.getOadrDistributeEvent() != null) {
			//
			// }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean checkRespCode(EiResponse response) {
		boolean rt = false;
		int respCode;
		try {
			respCode = Integer.parseInt(response.getResponseCode());
			if (respCode == HttpStatus.SC_OK) {
				rt = true;
				Out("requestID = " + response.getRequestID());
				requestID = response.getRequestID();
			} else {
				throw new Exception("[Response Code] = " + respCode + ", error");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rt;
	}

	public static OadrPayload createPartyRegistration(String oadrProfileName, OadrTransportType oadrTransportType,
			boolean isOnlyReposrt, boolean isXmlSignature, String venName, boolean isHttpPullModel) {

		OadrPayload oadrPayload = factory.createOadrPayload();
		OadrSignedObject oadrSignedObject = factory.createOadrSignedObject();
		OadrCreatePartyRegistration createPartyRegistration = null;

		try {
			createPartyRegistration = factory.createOadrCreatePartyRegistration();
			
			createPartyRegistration.setRequestID(requestID);
			createPartyRegistration.setOadrTransportName(oadrTransportType);
			createPartyRegistration.setOadrProfileName(oadrProfileName);
			createPartyRegistration.setOadrVenName(venName);
			createPartyRegistration.setOadrXmlSignature(isXmlSignature);
			createPartyRegistration.setOadrHttpPullModel(isHttpPullModel);

			oadrSignedObject.setOadrCreatePartyRegistration(createPartyRegistration);
			oadrPayload.setOadrSignedObject(oadrSignedObject);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return oadrPayload;
	}

	//
	public static OadrPayload createOadrQueryRegistration() {
		String uuid = UUID.randomUUID().toString();
		OadrPoll oadrPoll = null;
		OadrPayload oadrPayload = null;
		OadrQueryRegistration oadrQueryRegistration = null;
		OadrSignedObject oadrSignedObject = null;
		try {

			oadrPoll = factory.createOadrPoll();
			oadrPayload = factory.createOadrPayload();

			oadrQueryRegistration = factory.createOadrQueryRegistration();
			oadrSignedObject = factory.createOadrSignedObject();
			oadrQueryRegistration.setRequestID(uuid);
			oadrQueryRegistration.setSchemaVersion(version);

			oadrSignedObject.setOadrQueryRegistration(oadrQueryRegistration);
			oadrPayload.setOadrSignedObject(oadrSignedObject);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return oadrPayload;
	}

	/*
	public static OadrPayload createOadrRegisterReport(String venID, String durValue,
			ReportNameEnumeratedType reportNameType, String reportSpecifierID, String resourceID,
			ReportEnumeratedType reportType, ReadingTypeEnumeratedType readingtype, String maxPeriod, String minPeriod,
			boolean isChaged, String itemDesc, String itemUnits, String siScaleCode) {

		String uuid = UUID.randomUUID().toString();

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		Dtstart dtStart = null;
		GregorianCalendar c = new GregorianCalendar();
		XMLGregorianCalendar xmlDate = null;
		try {
			xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		} catch (DatatypeConfigurationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		DateTime dt = new DateTime(xmlDate);

		OadrPayload oadrPayload = factory.createOadrPayload();
		OadrSignedObject oadrSignedObject = factory.createOadrSignedObject();
		OadrRegisterReport rigisterReport = factory.createOadrRegisterReport();
		OadrReport report = factory.createOadrReport();

		DurationPropType durationType = new DurationPropType();
		DurationValue durationVal = new DurationValue(durValue);
		OadrReportDescription reportDesc = new OadrReportDescription();
		OadrSamplingRate samplingRate = new OadrSamplingRate();

		try {
			rigisterReport.withRequestID(uuid);

			// Set duration
			durationType.withDuration(durationVal);
			report.withDuration(durationType);

			// Set Report Descrtion
			reportDesc.withRID(resourceID);
			reportDesc.withReportDataSource(new EiTarget().withResourceIDs("KpxResource"));
			reportDesc.setReportType(reportType.toString());
			reportDesc.setReadingType(readingtype.toString());
			reportDesc.setMarketContext(new MarketContext("http://dras.kmos.kr"));

			samplingRate.setOadrMaxPeriod(new DurationValue(maxPeriod));
			samplingRate.setOadrMinPeriod(new DurationValue(minPeriod));
			samplingRate.setOadrOnChange(isChaged);
			reportDesc.setOadrSamplingRate(samplingRate);

			EnergyRealType energyReal = new EnergyRealType("RealEnergy", "Wh", "k");
			com.power21.openadr2.model.v20b.power.ObjectFactory obj = new com.power21.openadr2.model.v20b.power.ObjectFactory();
			// JAXBElement<EnergyRealType> ele
			// =obj.createEnergyReal(energyReal);
			// reportDesc.withItemBase(ele);
			reportDesc.withEnergyRealType(energyReal);

			// //Set EnergyReal
			report.withReportSpecifierID(reportSpecifierID);
			report.withOadrReportDescriptions(reportDesc);
			report.withReportName(reportNameType.toString());
			report.withReportRequestID(uuid);
			report.withCreatedDateTime(dt);

			rigisterReport.withOadrReports(report);
			rigisterReport.withSchemaVersion(version);

			// ArrayList<OadrReport> reportList = new ArrayList<>();
			// reportList.add(report);
			// rigisterReport.withOadrReports(reportList);
			rigisterReport.withVenID(venID);
			oadrSignedObject.withOadrRegisterReport(rigisterReport);
			oadrPayload.withOadrSignedObject(oadrSignedObject);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return oadrPayload;
	}*/

	

	public static OadrPayload createOadrPoll(String venID, String version) {
		String uuid = UUID.randomUUID().toString();
		OadrPoll oadrPoll = null;
		OadrPayload oadrPayload = null;
		OadrSignedObject oadrSignedObject = null;
		try {
			oadrSignedObject = factory.createOadrSignedObject();
			oadrPoll = factory.createOadrPoll();
			oadrPayload = factory.createOadrPayload();

			oadrPoll.setVenID(venID);//			
			oadrPoll.setSchemaVersion(version);

			oadrSignedObject.setOadrPoll(oadrPoll);
			oadrPayload.setOadrSignedObject(oadrSignedObject);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return oadrPayload;
	}

	public static OadrPayload createOadrCreatedReport(String venID, String respDesc, String respCode) {
		String uuid = UUID.randomUUID().toString();

		OadrPayload payload = null;
		OadrCreatedReport createdReport = null;
		OadrSignedObject oadrSignedObject = null;
		OadrPendingReports pendingReports = null;
		EiResponse resp;
		try {

			payload = factory.createOadrPayload();
			oadrSignedObject = factory.createOadrSignedObject();
			createdReport = factory.createOadrCreatedReport();
			pendingReports = factory.createOadrPendingReports();

			resp = new EiResponse();
			resp.setRequestID(uuid);
			resp.setResponseDescription(respDesc);
			resp.setResponseCode(respCode);

//			pendingReports.withReportRequestIDs("req111", "req222");
			pendingReports.setReportRequestIDs("req111","req222");

			createdReport.setVenID(venID);
			createdReport.setEiResponse(resp);
			createdReport.setOadrPendingReports(pendingReports);

			oadrSignedObject.setOadrCreatedReport(createdReport);//			
			payload.setOadrSignedObject(oadrSignedObject);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return payload;
	}

	public static OadrPayload createdUpdateReport(String duration, String rID,String reportName,String specifierID, 
			float fValue, float fAccuracy, long lconfig, String dataQuality) {
		
		String uuid = UUID.randomUUID().toString();

		OadrPayload payload = null;
		OadrUpdateReport updateReport = null;
		OadrSignedObject oadrSignedObject = null;
		OadrPendingReports pendingReports = null;
		EiResponse resp;
		OadrReport report = null;
		DurationPropType durationType = new DurationPropType();
		durationType.setDuration(duration);;
		Dtstart dtStart ;
		
		try {
			 
			payload = factory.createOadrPayload();
			oadrSignedObject = factory.createOadrSignedObject();
			updateReport = factory.createOadrUpdateReport();
			pendingReports = factory.createOadrPendingReports();

			updateReport.setSchemaVersion(version);
			updateReport.setRequestID(uuid);
			
			dtStart = getDtstart();
			
			 
			report = createOadrReport(duration, rID, reportName, specifierID, fValue, fAccuracy, lconfig, dataQuality); 
			report.setDuration(durationType);
			report.setDtstart(dtStart);
			updateReport.setOadrReports(report);

			oadrSignedObject.setOadrUpdateReport(updateReport);
			payload.setOadrSignedObject(oadrSignedObject);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return payload;
	}
	private static Dtstart getDtstart() throws DatatypeConfigurationException{
		Dtstart dtStart = new Dtstart();  
		GregorianCalendar c = new GregorianCalendar(); 			
		c.setTime(new Date());
		XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c); 
		dtStart.setDateTime(xmlDate); 
		return dtStart;
	}
	@SuppressWarnings("unchecked")
	private static OadrReport createOadrReport(String duration, String rID, String reportName, String specifierID, 
			float fValue, float fAccuracy, long lconfig, String dataQuality) {
		
		OadrReport report = factory.createOadrReport();
		 
		try {
			Dtstart dtStart = getDtstart();
			 
			report.setDtstart(dtStart);
			report.setReportName(reportName);
			report.setReportSpecifierID(specifierID); 
 
			Interval interval = getInterval(fValue, rID, fAccuracy, lconfig, dataQuality); 
			
			Intervals intervals = new Intervals();
			intervals.setIntervals(interval, interval); 
			
			report.setIntervals(intervals);
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return report;
	}
	
	@SuppressWarnings("unchecked")
	public static Interval getInterval(float fValue, String rID, float fAccuracy, long lconfi, String dataQuality){
		 Interval interval = new Interval();
		  
		PayloadFloatType fValueType = new PayloadFloatType();
		fValueType.setValue(fValue);
		
		OadrReportPayloadType payload = new OadrReportPayloadType();
		 
		payload.setRID(rID);
		payload.setAccuracy(fAccuracy);
		payload.setConfidence(lconfi);
		payload.setOadrDataQuality(dataQuality);
		
		JAXBElement<PayloadFloatType> ele = factory.createPayloadFloat(fValueType);
		payload.setPayloadBase(ele); 
		JAXBElement<OadrReportPayloadType> oadrReportPayloadType = factory.createOadrReportPayload(payload); 
		interval.setStreamPayloadBases(oadrReportPayloadType);
		
		 return  interval;
	}
	
	public static EnergyRealType getEnergyRealType(String desc, String itemUnits, String scaleCode){
		EnergyRealType value = new EnergyRealType();
		
		value.setItemDescription(desc);
		value.setItemUnits(itemUnits);
		value.setSiScaleCode(scaleCode);
		
		return value;
	} 

}
