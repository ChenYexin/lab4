package book;

public class Author {
	public Author(){
		authorID=null;
		name=null;
		age=null;
		country=null;
	}
	
public String getAuthorID() {
	return authorID;
}
public void setAuthorID(String authorID) {
	this.authorID = authorID;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
private String authorID;
private String name;
private String age;
private String country;
}
