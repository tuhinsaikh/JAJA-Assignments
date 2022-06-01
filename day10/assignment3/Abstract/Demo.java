package com.assignment3.Abstract;

public class Demo extends Abstract{
	 @Override
	    public void funX() {
	        System.out.println("inside funX");
	    }

	    @Override
	    public void funY() {
	        System.out.println("inside funY");
	    }
	    public void fun3(){
	        System.out.println("inside fun3");
	    }
	    public static void main(String[] args) {
	        Abstract d1= new Demo();
	        d1.funX();
	        d1.funY();
	        ((Demo)d1).fun3();
	    }
}



   


   
