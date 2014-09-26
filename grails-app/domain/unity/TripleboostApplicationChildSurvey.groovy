package unity

class TripleboostApplicationChildSurvey {

	Integer earnApplicationId
	Integer childNumber
	String firstName
	String lastName
	Date dob
	String frequencyTalkAboutMoney
	String frequencyTalkAboutEducation
	String childEducationalExpectations
	String childGradesMath
	String childGradesReadingWriting
	String childAppliedToCollege
	String childAcceptedToCollege
	String childEnrolledInCollege
	String childEnrolledInTradeSchool
	String childGraduatedCollege
	String childGraduatedTradeSchool
	String childGraduatedHs

	static mapping = {
		version false
	}

	static constraints = {
		childNumber unique: ["earn_application_id"]
		firstName maxSize: 64
		lastName nullable: true, maxSize: 64
		dob nullable: true
		frequencyTalkAboutMoney nullable: true, maxSize: 256
		frequencyTalkAboutEducation nullable: true, maxSize: 256
		childEducationalExpectations nullable: true, maxSize: 256
		childGradesMath nullable: true, maxSize: 256
		childGradesReadingWriting nullable: true, maxSize: 256
		childAppliedToCollege nullable: true, maxSize: 16
		childAcceptedToCollege nullable: true, maxSize: 16
		childEnrolledInCollege nullable: true, maxSize: 16
		childEnrolledInTradeSchool nullable: true, maxSize: 16
		childGraduatedCollege nullable: true, maxSize: 16
		childGraduatedTradeSchool nullable: true, maxSize: 16
		childGraduatedHs nullable: true, maxSize: 32
	}
}
