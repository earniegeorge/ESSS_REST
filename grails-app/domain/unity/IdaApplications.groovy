package unity

class IdaApplications {

	Integer earnUserId
	Integer vistashareUserId
	String accountType
	String accountBrand
	Integer accountRulesId
	String referralSource
	String referralSourceDetail
	String applicationSignature
	Date applicationSignatureDate
	String beneficiaryAgreementSignature
	Date beneficiaryAgreementSignatureDate
	String beneficiary1Name
	String beneficiary1Relationship
	String beneficiary2Name
	String beneficiary2Relationship
	String beneficiary3Name
	String beneficiary3Relationship
	String mediaReleaseSignature
	String mediaReleaseIncludesChildren
	String saverHardshipsOrConcerns
	String maritalStatus
	String education
	String employmentStatus
	String householdSize
	String householdStatus
	String householdNumberOfAdults
	String householdNumberOfChildren
	BigDecimal monthlyIncome
	BigDecimal annualIncome
	Boolean hasChecking
	Boolean hasSavings
	Boolean isHomeowner
	String afiMaritalStatusAtEnrollment
	String afiEmploymentStatusAtEnrollment
	String afiAutomobileOwnerAtEnrollment
	String afiBusinessOwnerAtEnrollment
	String afiDirectDepositAtEnrollment
	String afiTanfStatusAtEnrollment
	String afiLocationAtEnrollment
	String afiEitcStatusAtEnrollment
	String afiAgeGroupAtEnrollment
	String afiIntendedIdaUseAtEnrollment
	String afiIncomeCategoryAtEnrollment

	static mapping = {
		version false
	}

	static constraints = {
		vistashareUserId nullable: true
		accountType nullable: true, maxSize: 64
		accountBrand nullable: true, maxSize: 64
		accountRulesId nullable: true
		referralSource nullable: true, maxSize: 256
		referralSourceDetail nullable: true, maxSize: 256
		applicationSignature nullable: true, maxSize: 128
		applicationSignatureDate nullable: true
		beneficiaryAgreementSignature nullable: true, maxSize: 128
		beneficiaryAgreementSignatureDate nullable: true
		beneficiary1Name nullable: true, maxSize: 128
		beneficiary1Relationship nullable: true, maxSize: 128
		beneficiary2Name nullable: true, maxSize: 128
		beneficiary2Relationship nullable: true, maxSize: 128
		beneficiary3Name nullable: true, maxSize: 128
		beneficiary3Relationship nullable: true, maxSize: 128
		mediaReleaseSignature nullable: true, maxSize: 128
		mediaReleaseIncludesChildren nullable: true, maxSize: 16
		saverHardshipsOrConcerns nullable: true, maxSize: 65535
		maritalStatus nullable: true, maxSize: 32
		education nullable: true, maxSize: 64
		employmentStatus nullable: true, maxSize: 64
		householdSize nullable: true, maxSize: 32
		householdStatus nullable: true, maxSize: 32
		householdNumberOfAdults nullable: true, maxSize: 32
		householdNumberOfChildren nullable: true, maxSize: 32
		monthlyIncome nullable: true
		annualIncome nullable: true
		hasChecking nullable: true
		hasSavings nullable: true
		isHomeowner nullable: true
		afiMaritalStatusAtEnrollment nullable: true, maxSize: 32
		afiEmploymentStatusAtEnrollment nullable: true, maxSize: 32
		afiAutomobileOwnerAtEnrollment nullable: true, maxSize: 32
		afiBusinessOwnerAtEnrollment nullable: true, maxSize: 32
		afiDirectDepositAtEnrollment nullable: true, maxSize: 64
		afiTanfStatusAtEnrollment nullable: true, maxSize: 32
		afiLocationAtEnrollment nullable: true, maxSize: 64
		afiEitcStatusAtEnrollment nullable: true, maxSize: 64
		afiAgeGroupAtEnrollment nullable: true, maxSize: 32
		afiIntendedIdaUseAtEnrollment nullable: true, maxSize: 32
		afiIncomeCategoryAtEnrollment nullable: true, maxSize: 64
	}
}
