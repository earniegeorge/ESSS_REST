package unity

class Docs {

	byte[] contentAes
	Integer earnUserId
	String filename
	Integer filesize
	Integer vistashareUserId

	static mapping = {
		version false
	}

	static constraints = {
		contentAes nullable: true
		earnUserId nullable: true
		filesize nullable: true
		vistashareUserId nullable: true
	}
}
