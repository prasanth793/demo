package com.schindler.demo.model;


//@Entity
//@Table(name= "rna")
public class Rna {
 //   @Column
  //  @Id
    private int id;
   // @Column
    private String upi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUpi() {
        return upi;
    }

    public void setUpi(String upi) {
        this.upi = upi;
    }
}
