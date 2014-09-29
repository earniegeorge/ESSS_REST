package unity

class Users {

	String vistashareRole
	String typeEnum
	String typeSecondLevel
	Integer vistashareUserId
	String salutation
	String firstName
	String middleName
	String lastName
	Date dob
	byte[] ssnAes
	String ssnLastFour
	String ssnOrItin
	String preferredAddress
	String preferredCity
	String preferredState
	String preferredZipCode
	String preferredAddressType
	String county
	String country
	String homePhone
	String workPhone
	String mobilePhone
	String alternatePhone
	String fax
	String vistashareEmail
	String esssEmail
	String esssPassword
	Boolean esssAccountExpired
	Boolean esssAccountLocked
	Boolean esssEnabled
	String alternateEmail
	String alternateAddress
	String alternateCity
	String alternateState
	String alternateZipCode
	String alternateAddressType
	String alternateCountry
	Boolean doNotCall
	Boolean doNotEmail
	Integer emailPrefCode
	Boolean doNotMail
	String doNotMailReason
	Boolean banned
	String alertNotes
	String gender
	Integer householdLanguageId
	Boolean serviceableInEnglish
	Boolean serviceableInSpanish
	Boolean serviceableInCantonese
	Boolean idChecked
	Date idCheckedDate
	Integer spouseId
	Boolean isEmergencyContact
	Boolean isChild
	Integer emergencyContactId
	String emergencyContactType
	Integer childRefToPrimParent
	Boolean esssPasswordExpired
	String accountBrand
	String accountGoal
	Integer accountRulesId
	String accountType
	String administrativePartner
	String administrativePartnerAddress
	String administrativePartnerCity
	String administrativePartnerContactPerson
	String administrativePartnerEmail
	String administrativePartnerPhone
	String administrativePartnerState
	String administrativePartnerZipCode
	Integer childEarnUserId
	Date earnAccountClosedDate
	String earnAccountClosedReason
	Date earnAccountDeadline
	Date earnAccountGoalReachedDate
	Date earnAccountOpenedDate
	String earnAccountStatus
	//Integer earnUserId
	Date externalAccountEnrollmentDate
	Long externalAccountId
	String externalAccountProvider
	Integer externalAccountRoutingNumber
	String externalAccountType
	String incentiveFunder1
	Integer incentiveFunder1glNumber
	Integer incentiveFunder1percent
	String incentiveFunder2
	Integer incentiveFunder2glNumber
	Integer incentiveFunder2percent
	String incentiveFunder3
	Integer incentiveFunder3glNumber
	Integer incentiveFunder3percent
	Integer incentiveGroup
	Boolean isAccountFrozen
	Integer softwareVersion
	String vistashareAccountStatus
	Date vistashareAccountStatusDate
	String vistashareChildFullName
	Boolean esssEmailConfirmed
	String esssEmailConfirmCode
	Date esssEmailcodeDateSent
	Date esssEmailcodeDateReceived

	static mapping = {
		version false
	}

	static constraints = {
		vistashareRole nullable: true, maxSize: 512
		typeEnum maxSize: 9
		typeSecondLevel nullable: true, maxSize: 64
		vistashareUserId nullable: true, unique: true
		salutation nullable: true, maxSize: 6
		firstName maxSize: 32
		middleName nullable: true, maxSize: 32
		lastName maxSize: 64
		dob nullable: true
		ssnAes nullable: true
		ssnLastFour nullable: true, maxSize: 4
		ssnOrItin nullable: true, maxSize: 4
		preferredAddress nullable: true, maxSize: 256
		preferredCity nullable: true, maxSize: 32
		preferredState nullable: true, maxSize: 32
		preferredZipCode nullable: true, maxSize: 12
		preferredAddressType nullable: true, maxSize: 16
		county nullable: true, maxSize: 32
		country nullable: true, maxSize: 32
		homePhone nullable: true, maxSize: 32
		workPhone nullable: true, maxSize: 32
		mobilePhone nullable: true, maxSize: 32
		alternatePhone nullable: true, maxSize: 32
		fax nullable: true, maxSize: 16
		vistashareEmail nullable: true, maxSize: 64
		esssEmail nullable: true, maxSize: 64
		esssPassword nullable: true
		esssAccountExpired nullable: true
		esssAccountLocked nullable: true
		esssEnabled nullable: true
		alternateEmail nullable: true, maxSize: 64
		alternateAddress nullable: true, maxSize: 256
		alternateCity nullable: true, maxSize: 32
		alternateState nullable: true, maxSize: 2
		alternateZipCode nullable: true, maxSize: 12
		alternateAddressType nullable: true, maxSize: 16
		alternateCountry nullable: true, maxSize: 32
		doNotCall nullable: true
		doNotEmail nullable: true
		emailPrefCode nullable: true
		doNotMail nullable: true
		doNotMailReason nullable: true, maxSize: 128
		banned nullable: true
		alertNotes nullable: true, maxSize: 4096
		gender nullable: true, maxSize: 8
		householdLanguageId nullable: true
		serviceableInEnglish nullable: true
		serviceableInSpanish nullable: true
		serviceableInCantonese nullable: true
		idChecked nullable: true
		idCheckedDate nullable: true
		spouseId nullable: true
		emergencyContactId nullable: true
		emergencyContactType nullable: true, maxSize: 128
		childRefToPrimParent nullable: true
		accountBrand nullable: true, maxSize: 32
		accountGoal nullable: true, maxSize: 32
		accountRulesId nullable: true
		accountType nullable: true, maxSize: 32
		administrativePartner nullable: true, maxSize: 32
		administrativePartnerAddress nullable: true, maxSize: 64
		administrativePartnerCity nullable: true, maxSize: 32
		administrativePartnerContactPerson nullable: true, maxSize: 64
		administrativePartnerEmail nullable: true, maxSize: 64
		administrativePartnerPhone nullable: true, maxSize: 128
		administrativePartnerState nullable: true, maxSize: 2
		administrativePartnerZipCode nullable: true, maxSize: 5
		childEarnUserId nullable: true
		earnAccountClosedDate nullable: true
		earnAccountClosedReason nullable: true, maxSize: 128
		earnAccountDeadline nullable: true
		earnAccountGoalReachedDate nullable: true
		earnAccountOpenedDate nullable: true
		earnAccountStatus nullable: true, maxSize: 27
		//earnUserId nullable: true
		externalAccountEnrollmentDate nullable: true
		externalAccountId nullable: true, unique: true
		externalAccountProvider nullable: true, maxSize: 32
		externalAccountRoutingNumber nullable: true
		externalAccountType nullable: true, maxSize: 9
		incentiveFunder1 nullable: true, maxSize: 64
		incentiveFunder1glNumber nullable: true
		incentiveFunder1percent nullable: true
		incentiveFunder2 nullable: true, maxSize: 64
		incentiveFunder2glNumber nullable: true
		incentiveFunder2percent nullable: true
		incentiveFunder3 nullable: true, maxSize: 64
		incentiveFunder3glNumber nullable: true
		incentiveFunder3percent nullable: true
		incentiveGroup nullable: true
		softwareVersion nullable: true
		vistashareAccountStatus nullable: true, maxSize: 32
		vistashareAccountStatusDate nullable: true
		vistashareChildFullName nullable: true, maxSize: 128
		esssEmailConfirmed nullable: true
		esssEmailConfirmCode nullable: true, maxSize: 20
		esssEmailcodeDateSent nullable: true
		esssEmailcodeDateReceived nullable: true
	}
}
