package MailMerge;

public class Data {
    private String first_name;
    private String last_name;
    private String address;
    private String year;
   
  public Data() {
  
  }
  
    public String getFirst_name() {
      return first_name;
    }
    public void setFirst_name(String first_name) {
      this.first_name = first_name;
    }
    public String getLast_name() {
      return last_name;
    }
    public void setLast_name(String last_name) {
      this.last_name = last_name;
    }
    public String getAddress() {
      return address;
    }
    public void setAddress(String address) {
      this.address = address;
    }
    public String getYear() {
      return year;
    }
    public void setYear(String year) {
      this.year = year;
    }
    @Override
    public String toString() {
      return "First_Name: " + "<<"+first_name+">>" + " Last_Name: " + "<<"+last_name+">>" + " Address: " + "<<"+address+">>"
      + " Year: " + "<<"+year+">>";
    }

    public Object getCategory() {
      return null;
    }

    
}

