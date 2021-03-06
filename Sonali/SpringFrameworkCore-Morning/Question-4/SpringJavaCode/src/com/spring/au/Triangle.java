package com.spring.au;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Triangle {
		
	  public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	private int width;
	private int height;
	private String type; 
	  
	  @Autowired
	  @Qualifier("PointA")
	  private Point pointA;
	  
	  @Autowired
	  @Qualifier("PointB")
	  private Point pointB;
	  
	  @Autowired
	  @Qualifier("PointC")
	  private Point pointC;
	  //Add Non-Primitive type member variable 
	   	  
	  public Triangle(String type) 
	  { 
		  this.type = type;
	  } 
	   
	  public String getType() { return type; }
	  
	  
	  public void setType(String type) {//setter injection 
		  this.type = type; 
	  }
	  public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}
		public Triangle(Point pointA, Point pointB, Point pointC, int width, int height, String type) {
			super();
			this.pointA = pointA;
			this.pointB = pointB;
			this.pointC = pointC;
			this.width = width;
			this.height = height;
			this.type = type;
		}

		public Triangle(String type, int width, int height) {
			super();
			this.type = type;
			this.width = width;
			this.height = height;
		}
	  
	  public void draw() {
	 // System.out.println(getType()+" Triangle Drawn of type"+getType()+"with points"+getPointA().getX()+""+getPointA().getY()+"PointB "
	//		  + getPointB().getX()+""+getPointB().getY());
	  System.out.println(getType()+" Triangle Drawn of type "+getType()+" with"
		  		+ "\n Point A : ("+ getPointA().getX()+","+getPointA().getY()+") "
		  		+ "\n Point B : ("+ getPointB().getX()+","+getPointB().getY()+") "
		  		+ "\n Point C : ("+ getPointC().getX()+","+getPointC().getY()+") "
		  		+ "\n Width : " + getWidth()
		  		+ "\n Height : " + getHeight());
	  }

	
}
