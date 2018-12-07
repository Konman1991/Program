/*
 * @author Konner Robbins
 */

package test;

/**
 * The setter for string name.
 */

public class Dog {

  private String name;

  /**
   * The setbreed assigned to name.
   * @param name of the breed.
   */
  
  public void setBreed(String name) {
    this.name = name;
  }
  
  /**
   * Breed name.
  * @return name of dog breed.
  */
  
  public String getBreed() {
    return name;
  }
}
