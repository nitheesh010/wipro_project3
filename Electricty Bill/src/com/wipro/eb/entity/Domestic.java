package com.wipro.eb.entity;

public class Domestic extends Connection 
{
 float[] slabs=new float[]{2.3f,4.2f,5.5f};
 public Domestic(int currentReading, int previousReading,float slabs[])
	{
		super(currentReading,previousReading,slabs);
	}
 public float computeBill()
 {
  int n = currentReading-previousReading;
  float billAmount=0;
  if(n<=50){
   billAmount =  (float) (n * 2.3);
  }
  else if(n<=100){
   billAmount = (float) Math.abs((50* 2.3)+((n-50)*4.2));
  }
  else{
   billAmount = (float) Math.abs((50*2.3)+(50*4.2)+((n-100)*5.5));
  }

  
  return billAmount;

}
}