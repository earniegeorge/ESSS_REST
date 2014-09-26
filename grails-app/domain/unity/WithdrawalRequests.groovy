package unity

class WithdrawalRequests {

	Integer earnUserId
	String ids
	String withdrawalType
	String status
	Date beginDate
	Date endDate
	Integer exitSurveyId
	Integer formId
	String docsIds
	String stage

	static mapping = {
		version false
	}

	static constraints = {
		ids nullable: true, maxSize: 32
		withdrawalType nullable: true, maxSize: 32
		status nullable: true, maxSize: 32
		beginDate nullable: true
		endDate nullable: true
		exitSurveyId nullable: true
		formId nullable: true
		docsIds nullable: true, maxSize: 32
		stage nullable: true, maxSize: 32
	}
}
