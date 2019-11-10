  package Repositorys;
  
  
  import javax.persistence.CascadeType; import javax.persistence.Column; import
  javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
  import javax.persistence.Id; import javax.persistence.OneToMany;
  
  public class Category {
  
  @Id
  
  private int id;
  @Column (name = "Name")
  private String name;
  
  
  public Category(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}
 
  
  }
 