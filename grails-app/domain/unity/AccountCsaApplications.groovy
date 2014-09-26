package unity

class AccountCsaApplications {

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
