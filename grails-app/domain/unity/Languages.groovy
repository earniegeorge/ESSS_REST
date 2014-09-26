package unity

class Languages {

	String name

	static mapping = {
		version false
	}

	static constraints = {
		name maxSize: 32, unique: true
	}
}
