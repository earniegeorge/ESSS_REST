package unity

class CsaApplications {

	Integer earnUserId
	Integer vistashareUserId
	String accountType
	String accountBrand
	Integer accountRulesId
	String vistashareAccountDescription
	String languageOfForm
	String vistashareApplicationIds
	Boolean hasElectronicSignature
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
	Date mediaReleaseSignedDate
	String mediaReleaseSignatureDate
	Boolean mediaReleaseIncludesChildren
	String saverHardshipsOrConcerns
	String maritalStatus
	String education
	String employmentStatus
	String spouseEmploymentStatus
	String householdSize
	String householdStatus
	String householdNumberOfAdults
	String householdNumberOfChildren
	BigDecimal annualIncome
	Boolean hasChecking
	Boolean hasSavings
	Boolean isHomeowner
	Boolean assetsBelow20k
	String filedTaxesJointlyOrSeparately
	Boolean householdHasEarnedIncome
	String expectedUsesOfFunds
	String spendingHabits
	String savingsHabits
	String savingsHabitsDetail
	String spendingPlan
	String spendingPlanKidsInvolvement
	Boolean threeMonthsExpensesSaved
	Boolean billsOnTime
	Boolean notEnoughForFoodOrShelter
	Boolean haveFriendsAndFamily
	String confidenceToFindResources
	String controlOfFinancialFuture
	String savingForEducationAlready
	String savingForEducationAlreadyDetail
	String otherCollegeNonprofits
	String savingsAccountBalance
	String checkingAccountBalance
	String retirementAccountBalance
	String cashOtherInvestmentsBalance
	String creditCardBalance
	String studentLoanDebt
	String mortgageLoans
	String otherLoansDebtBalance
	String timeToCompleteApp
	Integer howManyAccounts
	Boolean otherChildrenFor3b
	String otherChildrenFor3bNamesAges
	String applicationCompleted
	Date applicationCompletedDate
	String applicationApproved
	String applicationNotApprovedReason
	String applicationNotApprovedReasonDetail
	String w9Completed
	Date w9CompletedDate
	String incomeDocumentationRequired
	String incomeDocumentationSubmitted
	String incomeDocumentationApproved
	String readyForAccountOpening
	String rctStatus

	static mapping = {
		version false
	}

	static constraints = {
		vistashareUserId nullable: true
		accountType nullable: true, maxSize: 64
		accountBrand nullable: true, maxSize: 64
		accountRulesId nullable: true
		vistashareAccountDescription nullable: true, maxSize: 256
		languageOfForm nullable: true, maxSize: 32
		vistashareApplicationIds nullable: true, maxSize: 64
		hasElectronicSignature nullable: true
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
		mediaReleaseSignedDate nullable: true
		mediaReleaseSignatureDate nullable: true, maxSize: 64
		mediaReleaseIncludesChildren nullable: true
		saverHardshipsOrConcerns nullable: true, maxSize: 65535
		maritalStatus nullable: true, maxSize: 32
		education nullable: true, maxSize: 512
		employmentStatus nullable: true, maxSize: 64
		spouseEmploymentStatus nullable: true, maxSize: 256
		householdSize nullable: true, maxSize: 32
		householdStatus nullable: true, maxSize: 32
		householdNumberOfAdults nullable: true, maxSize: 32
		householdNumberOfChildren nullable: true, maxSize: 32
		annualIncome nullable: true
		hasChecking nullable: true
		hasSavings nullable: true
		isHomeowner nullable: true
		assetsBelow20k nullable: true
		filedTaxesJointlyOrSeparately nullable: true, maxSize: 256
		householdHasEarnedIncome nullable: true
		expectedUsesOfFunds nullable: true, maxSize: 65535
		spendingHabits nullable: true, maxSize: 65535
		savingsHabits nullable: true, maxSize: 65535
		savingsHabitsDetail nullable: true, maxSize: 65535
		spendingPlan nullable: true, maxSize: 65535
		spendingPlanKidsInvolvement nullable: true, maxSize: 65535
		threeMonthsExpensesSaved nullable: true
		billsOnTime nullable: true
		notEnoughForFoodOrShelter nullable: true
		haveFriendsAndFamily nullable: true
		confidenceToFindResources nullable: true, maxSize: 64
		controlOfFinancialFuture nullable: true, maxSize: 64
		savingForEducationAlready nullable: true, maxSize: 64
		savingForEducationAlreadyDetail nullable: true, maxSize: 64
		otherCollegeNonprofits nullable: true, maxSize: 64
		savingsAccountBalance nullable: true, maxSize: 64
		checkingAccountBalance nullable: true, maxSize: 64
		retirementAccountBalance nullable: true, maxSize: 64
		cashOtherInvestmentsBalance nullable: true, maxSize: 64
		creditCardBalance nullable: true, maxSize: 64
		studentLoanDebt nullable: true, maxSize: 64
		mortgageLoans nullable: true, maxSize: 64
		otherLoansDebtBalance nullable: true, maxSize: 64
		timeToCompleteApp nullable: true, maxSize: 64
		howManyAccounts nullable: true
		otherChildrenFor3b nullable: true
		otherChildrenFor3bNamesAges nullable: true, maxSize: 256
		applicationCompleted nullable: true, maxSize: 64
		applicationCompletedDate nullable: true
		applicationApproved nullable: true, maxSize: 16
		applicationNotApprovedReason nullable: true, maxSize: 256
		applicationNotApprovedReasonDetail nullable: true, maxSize: 65535
		w9Completed nullable: true, maxSize: 16
		w9CompletedDate nullable: true
		incomeDocumentationRequired nullable: true, maxSize: 16
		incomeDocumentationSubmitted nullable: true, maxSize: 16
		incomeDocumentationApproved nullable: true, maxSize: 16
		readyForAccountOpening nullable: true, maxSize: 64
		rctStatus nullable: true, maxSize: 16
	}
}
