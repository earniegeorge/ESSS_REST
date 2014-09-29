package earn_rest

import grails.converters.JSON
import org.codehaus.groovy.grails.web.json.*
import java.util.Map
import unity.*
import org.codehaus.groovy.grails.commons.DefaultGrailsDomainClass
//deprecated
//import org.codehaus.groovy.grails.commons.ApplicationHolder
import org.codehaus.groovy.grails.commons.DomainClassArtefactHandler
import org.codehaus.groovy.grails.commons.*

class RestController {

	def rest() {
		//gets all headernames
		//def enu = request.getHeaderNames()
		// all header names
		//while (enu.hasMoreElements()) log.info(enu.nextElement().getClass())
		
		def authString = request.getHeader('Authorization')
		if (!basicAuthenticate(authString)) {
			render(status:400, text:'Sorry, need correct credentials\n')
			return
		} 
		def cur_id = null
		def domain = null
		if (params.containsKey('id')&&params.containsKey('domain')) {
			cur_id = params.id
			domain = params.domain
		} else {
			render(status:400, text:'Sorry, need a domain and id\n')
		}
		String className = "unity." + domain
		//dynamically getting the class
		Class thisClass = grailsApplication.getClassForName(className)
		if (thisClass == null) {
			render(status:400, text:'Wrong domain name provided\n')
			return
		}
		def type = request.method
		log.info('type: ' + type + ' id: ' + cur_id)
		if (type == 'GET') {
			log.info('req type: GET')
			def obj = thisClass.findById(cur_id)
			def convert = new JSON(target:obj)
			render(text:convert.toString(),contentType:'application/json',encoding:'UTF-8')
			return
		} else if (type == 'PUT') {
		//example curl command:
		// curl -X PUT -u George:mypassword -k --verbose http://localhost:8080/EARN_REST/v1/Users/2 -d '{"hi":"bye"}' 
			// "Content-Type: application/json"
			log.info('req type: PUT')
			log.info(request.JSON.toString())
			compareDomainsAndUpdate(request.JSON.toString())
			render('nothing yet')
		}
	}
	
	def basicAuthenticate(authString) {
		log.info('authenticating')
		def encodedPair = authString - 'Basic '
		def decodedPair =  new String(new sun.misc.BASE64Decoder().decodeBuffer(encodedPair));
		if (decodedPair == 'George:mypassword') {
			return true
		} else {
			log.info('not succ auth')
			return false
		}
	}
//	
//	//takes in JSON payload and parses it, throwing an error if the columns don't match up to schema
//	def processJSON (input) {
//		log.info('inside processJSON()')
//		//sample payload comin in, change a few fields
//		//def ex = '{"class":"unity.Users","id":2320,"accountBrand":"TESTFIELD_Tripleboost","accountGoal":"TESTFIELD_Ca$hMon3y","accountRulesId":null,"accountType":null,"administrativePartner":null,"administrativePartnerAddress":null,"administrativePartnerCity":null,"administrativePartnerContactPerson":null,"administrativePartnerEmail":null,"administrativePartnerPhone":null,"administrativePartnerState":null,"administrativePartnerZipCode":null,"alertNotes":null,"alternateAddress":null,"alternateAddressType":null,"alternateCity":null,"alternateCountry":null,"alternateEmail":null,"alternatePhone":"","alternateState":null,"alternateZipCode":null,"banned":null,"childEarnUserId":null,"childRefToPrimParent":null,"country":"USA","county":"Marin","doNotCall":false,"doNotEmail":false,"doNotMail":null,"doNotMailReason":null,"dob":"1969-09-01T07:00:00Z","earnAccountClosedDate":null,"earnAccountClosedReason":null,"earnAccountDeadline":null,"earnAccountGoalReachedDate":null,"earnAccountOpenedDate":null,"earnAccountStatus":null,"emailPrefCode":null,"emergencyContactId":7814,"emergencyContactType":"Friend","esssAccountExpired":false,"esssAccountLocked":false,"esssEmail":"s.saiga@aol.com","esssEmailConfirmCode":"cdvYcyZ3REKvH9r29yWn","esssEmailConfirmed":true,"esssEmailcodeDateReceived":null,"esssEmailcodeDateSent":"2014-08-07T07:00:00Z","esssEnabled":true,"esssPassword":"$2a$10$G4gQuNRvzQExA53OmmFE4eB2u3jFzU3pGHPVf2FAQgZhm0Czx5yEq","esssPasswordExpired":false,"externalAccountEnrollmentDate":null,"externalAccountId":null,"externalAccountProvider":null,"externalAccountRoutingNumber":null,"externalAccountType":null,"fax":"","firstName":"Sakiko","gender":"Female","homePhone":"4154972662","householdLanguageId":2,"idChecked":true,"idCheckedDate":null,"incentiveFunder1":null,"incentiveFunder1glNumber":null,"incentiveFunder1percent":null,"incentiveFunder2":null,"incentiveFunder2glNumber":null,"incentiveFunder2percent":null,"incentiveFunder3":null,"incentiveFunder3glNumber":null,"incentiveFunder3percent":null,"incentiveGroup":null,"isAccountFrozen":false,"isChild":false,"isEmergencyContact":false,"lastName":"Saiga","middleName":null,"mobilePhone":"4154972662","preferredAddress":"126 Ned\'s Way ","preferredAddressType":null,"preferredCity":"Tiburon","preferredState":"CA","preferredZipCode":"94920","salutation":null,"serviceableInCantonese":null,"serviceableInEnglish":true,"serviceableInSpanish":true,"softwareVersion":null,"spouseId":null,"ssnAes":[89,107,83,106,97,107,112,100,55,99,99,101,67,116,81,103,118,99,86,104,116,49,55,113,112,103,53,106,86,81,69,55,71,70,73,52,101,78,71,122,71,67,119,61],"ssnLastFour":"7443","ssnOrItin":"ssn","typeEnum":"fin_serv","typeSecondLevel":null,"vistashareAccountStatus":null,"vistashareAccountStatusDate":null,"vistashareChildFullName":null,"vistashareEmail":"s.saiga@aol.com","vistashareRole":"Client - CAM Spark Point, Client - EARN, IDA Client, Matched Savings Client, Prospective Client, Small business checking account user, TripleBoost Client","vistashareUserId":740480,"workPhone":""}'
//		
//		
//		//def ex_target = '{"target":{"class":"unity.Users","id":2320,"accountBrand":null,"accountGoal":null,"accountRulesId":null,"accountType":null,"administrativePartner":null,"administrativePartnerAddress":null,"administrativePartnerCity":null,"administrativePartnerContactPerson":null,"administrativePartnerEmail":null,"administrativePartnerPhone":null,"administrativePartnerState":null,"administrativePartnerZipCode":null,"alertNotes":null,"alternateAddress":null,"alternateAddressType":null,"alternateCity":null,"alternateCountry":null,"alternateEmail":null,"alternatePhone":"","alternateState":null,"alternateZipCode":null,"banned":null,"childEarnUserId":null,"childRefToPrimParent":null,"country":"USA","county":"Marin","doNotCall":false,"doNotEmail":false,"doNotMail":null,"doNotMailReason":null,"dob":"1969-09-01T07:00:00Z","earnAccountClosedDate":null,"earnAccountClosedReason":null,"earnAccountDeadline":null,"earnAccountGoalReachedDate":null,"earnAccountOpenedDate":null,"earnAccountStatus":null,"earnUserId":null,"emailPrefCode":null,"emergencyContactId":7814,"emergencyContactType":"Friend","esssAccountExpired":false,"esssAccountLocked":false,"esssEmail":"s.saiga@aol.com","esssEmailConfirmCode":"cdvYcyZ3REKvH9r29yWn","esssEmailConfirmed":true,"esssEmailcodeDateReceived":null,"esssEmailcodeDateSent":"2014-08-07T07:00:00Z","esssEnabled":true,"esssPassword":"$2a$10$G4gQuNRvzQExA53OmmFE4eB2u3jFzU3pGHPVf2FAQgZhm0Czx5yEq","esssPasswordExpired":false,"externalAccountEnrollmentDate":null,"externalAccountId":null,"externalAccountProvider":null,"externalAccountRoutingNumber":null,"externalAccountType":null,"fax":"","firstName":"Sakiko","gender":"Female","homePhone":"4154972662","householdLanguageId":2,"idChecked":true,"idCheckedDate":null,"incentiveFunder1":null,"incentiveFunder1glNumber":null,"incentiveFunder1percent":null,"incentiveFunder2":null,"incentiveFunder2glNumber":null,"incentiveFunder2percent":null,"incentiveFunder3":null,"incentiveFunder3glNumber":null,"incentiveFunder3percent":null,"incentiveGroup":null,"isAccountFrozen":false,"isChild":false,"isEmergencyContact":false,"lastName":"Saiga","middleName":null,"mobilePhone":"4154972662","preferredAddress":"126 Ned\'s Way ","preferredAddressType":null,"preferredCity":"Tiburon","preferredState":"CA","preferredZipCode":"94920","salutation":null,"serviceableInCantonese":null,"serviceableInEnglish":true,"serviceableInSpanish":true,"softwareVersion":null,"spouseId":null,"ssnAes":[89,107,83,106,97,107,112,100,55,99,99,101,67,116,81,103,118,99,86,104,116,49,55,113,112,103,53,106,86,81,69,55,71,70,73,52,101,78,71,122,71,67,119,61],"ssnLastFour":"7443","ssnOrItin":"ssn","typeEnum":"fin_serv","typeSecondLevel":null,"vistashareAccountStatus":null,"vistashareAccountStatusDate":null,"vistashareChildFullName":null,"vistashareEmail":"s.saiga@aol.com","vistashareRole":"Client - CAM Spark Point, Client - EARN, IDA Client, Matched Savings Client, Prospective Client, Small business checking account user, TripleBoost Client","vistashareUserId":740480,"workPhone":""}}'
//		//JSONObject JSONmap = JSON.parse(ex)
//		//JSONObject t = JSON.parse(ex_target)
////		for (Map.Entry<String, String> entry : t.entrySet()) {
////			log.info(entry.getKey() + "/" + entry.getValue());
////		}
//		//get list from "target" key, turns out to be another jsonObject
//		//def tList = t.get('target')
//		//log.info(tList.getClass())
//		//for (Map.Entry<String, String> entry: tList) {
//			//log.info(entry.getKey() + "/" + entry.getValue());
//		//}
//		compareDomainsAndUpdate(input)
//		
//		return
//		
////		log.info(JSONmap.get('class'))
////		def curClass = grailsApplication.getClassForName(JSONmap.get('class'))
////		def JSONObj = new JSONObject(ex)
////		//curClass obj = new Object(JSONObj)
////		//log.info(obj.toString())
////		
////		log.info(curClass.toString())
////		def obj1 = new Users(JSONObj)
////		def obj2 = curClass.getConstructor().newInstance()
////		//def obj = curClass.getConstructor().newInstance(JSONObj)
////		log.info(obj1.toString())
////		log.info(obj2.toString())
//	}
	
	//compares existing object from database with put request payload
	//Strings?
	def compareDomainsAndUpdate(reqDom) {
		JSONObject reqJSONObj = JSON.parse(reqDom)
		def curClass = grailsApplication.getClassForName(reqJSONObj.get('class'))
		//GrailsDomainClass domArtefact = grailsApplication.getArtefact("Domain", reqJSONObj.get('class'))
		//log.info('domArtefact name: ' + domArtefact)
		//def domainClass = grailsApplication.getDomainClass(reqJSONObj.get('class'))
		log.info("curClass: " + curClass.toString())
		if (reqJSONObj.containsKey('id')) {
		//if (curClass.findById(reqJSONObj.get('id')) != null) {
			def dbObj = curClass.findById(reqJSONObj.get('id'))
			def dbJSONObjOld = new JSON(dbObj)
			log.info("class type for new JSON: " + dbJSONObjOld.getClass())
			def dbJSONObj = JSON.parse(dbJSONObjOld.toString())
			log.info("class type for JSON.parse: " + dbJSONObj)
			def curKey = ""
			def curVal = ""
			def reqVal = ""
			for (Map.Entry<String, String> entry : dbJSONObj.entrySet()) {
				//log.info(entry.getKey() + "/" + entry.getValue());
				curKey = entry.getKey()
				curVal = entry.getValue()
				reqVal = reqJSONObj.get(curKey)
				if (curVal != reqVal) {  
					log.info('diff, key: ' + curKey + ', val: ' + curVal + '/' + reqVal)
					//both lines work functionally the same
					//dbObj.(''+curKey) = reqVal
					dbObj.setProperty(curKey, reqVal)
				}
			}
			dbObj.save(flush:true, failOnError: true)
		} else {
			//if no new id, CREATE NEW OBJ :)
			def newObj = curClass.newInstance(reqJSONObj)
			log.info('new obj type: ' + newObj.getClass())
			newObj.save(flush:true, failOnError: true)
		}
	}
	
	//gets rid of "target" in the beginning
	//actually not needed lols
	def removeTargetTag(String input) {
		if (input.contains('{"target":')) {
			//log.info(input[10..-2])
			return input[10..-2]
		} else return input
	}
}
