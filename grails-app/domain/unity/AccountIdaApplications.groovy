package unity

class AccountIdaApplications {

	Integer earnApplicationId
	Integer earnAccountId
	Integer earnUserId

	static mapping = {
		version false
	}

	static constraints = {
		earnAccountId unique: ["earnApplicationId"]
	}
}
