import java.io.Serializable;
public class Person implements Serializable {
 private String name;
 private int age;
 private int height;
 private int weight;
 private String eyeColor;
 private String gender;
 public Person() {
    this.name="robert";
 }

 public Person(String name, int age, int height, int weight, String eyeColor, String gender){
   this.name = name;
   this.age = age;
   this.height = height;
   this.weight = weight;
   this.eyeColor = eyeColor;
   this.gender = gender;
  }
 
  public void setName(String name) {
	this.name = name;
  }
  public void setAge(int age) {
	this.age = age;
  }
  public void setHeight(int height) {
	this.height = height;
  }
  public void setWeight(int weight) {
	this.weight = weight;
  }
  public void setEyeColor(String eyeColor) {
	this.eyeColor = eyeColor;
  }
  public void setGender(String gender) {
	this.gender = gender;
  }
  public int getWeight() {
     return weight;
  }
  public int getAge() {
     return age;
  }
  public int getHeight() {
     return height;
  }
  public String getGender() {
     return gender;
  }
  public String getName() {
     return name;
  }
  public String getEyeColor() {
     return eyeColor;
  }
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", eyeColor="
			+ eyeColor + ", gender=" + gender + "]";
}
  
}

