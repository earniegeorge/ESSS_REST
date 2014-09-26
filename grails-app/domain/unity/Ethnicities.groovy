package unity

class Ethnicities {

	String name

	static mapping = {
		version false
	}

	static constraints = {
		name maxSize: 64, unique: true
	}
}
