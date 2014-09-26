package unity

class Accounts {

	Integer earnUserId
	Integer childEarnUserId
	Integer vistashareUserId
	String externalAccountProvider
	Integer externalAccountRoutingNumber
	Long externalAccountId
	String externalAccountType
	String accountType
	String accountBrand
	Integer accountRulesId
	Integer softwareVersion
	String accountGoal
	String vistashareChildFullName
	String vistashareAccountStatus
	Date vistashareAccountStatusDate
	String earnAccountStatus
	Boolean isAccountFrozen
	Date externalAccountEnrollmentDate
	Date earnAccountOpenedDate
	Date earnAccountDeadline
	Date earnAccountGoalReachedDate
	Date earnAccountClosedDate
	String earnAccountClosedReason
	Integer incentiveGroup
	//following changed because of formatting issues
	String incentive_funder_1
	Integer incentive_funder_1_percent
	Integer incentive_funder_1_gl_number
	String incentive_funder_2
	Integer incentive_funder_2_percent
	Integer incentive_funder_2_gl_number
	String incentive_funder_3
	Integer incentive_funder_3_percent
	Integer incentive_funder_3_gl_number
	String administrativePartner
	String administrativePartnerContactPerson
	String administrativePartnerAddress
	String administrativePartnerCity
	String administrativePartnerState
	String administrativePartnerZipCode
	String administrativePartnerPhone
	String administrativePartnerEmail

	static mapping = {
		version false
	}

	static constraints = {
		earnUserId nullable: true
		childEarnUserId nullable: true
		vistashareUserId nullable: true
		externalAccountProvider nullable: true, maxSize: 32
		externalAccountRoutingNumber nullable: true
		externalAccountId nullable: true, unique: true
		externalAccountType nullable: true, maxSize: 9
		accountType nullable: true, maxSize: 32
		accountBrand nullable: true, maxSize: 32
		accountRulesId nullable: true
		softwareVersion nullable: true
		accountGoal nullable: true, maxSize: 32
		vistashareChildFullName nullable: true, maxSize: 128
		vistashareAccountStatus nullable: true, maxSize: 32
		vistashareAccountStatusDate nullable: true
		earnAccountStatus nullable: true, maxSize: 27
		externalAccountEnrollmentDate nullable: true
		earnAccountOpenedDate nullable: true
		earnAccountDeadline nullable: true
		earnAccountGoalReachedDate nullable: true
		earnAccountClosedDate nullable: true
		earnAccountClosedReason nullable: true, maxSize: 128
		incentiveGroup nullable: true
		incentive_funder_1 nullable: true, maxSize: 64
		incentive_funder_1_percent nullable: true
		incentive_funder_1_gl_number nullable: true
		incentive_funder_2 nullable: true, maxSize: 64
		incentive_funder_2_percent nullable: true
		incentive_funder_2_gl_number nullable: true
		incentive_funder_3 nullable: true, maxSize: 64
		incentive_funder_3_percent nullable: true
		incentive_funder_3_gl_number nullable: true
		administrativePartner nullable: true, maxSize: 32
		administrativePartnerContactPerson nullable: true, maxSize: 64
		administrativePartnerAddress nullable: true, maxSize: 64
		administrativePartnerCity nullable: true, maxSize: 32
		administrativePartnerState nullable: true, maxSize: 2
		administrativePartnerZipCode nullable: true, maxSize: 5
		administrativePartnerPhone nullable: true, maxSize: 128
		administrativePartnerEmail nullable: true, maxSize: 64
//		incentiveFunder1_1 nullable: true, maxSize: 64
//		incentiveFunder1glNumber nullable: true
//		incentiveFunder1percent nullable: true
//		incentiveFunder2_1 nullable: true, maxSize: 64
//		incentiveFunder2glNumber nullable: true
//		incentiveFunder2percent nullable: true
//		incentiveFunder3_1 nullable: true, maxSize: 64
//		incentiveFunder3glNumber nullable: true
//		incentiveFunder3percent nullable: true
	}
}
