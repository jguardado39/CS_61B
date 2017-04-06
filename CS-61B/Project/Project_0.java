/* The goal of this project is to give you a crash course in Java. CS61B is not a 
course about Java, so we're going to race through the language in just 4 weeks. 
You've already taken CS61A, E7, or some equivalent course, so it's time to get used to 
learning languages quickly.

Before starting this project, we are assuming that you either have prior Java experience, 
or have watched lecture 2 and (ideally) have also completed HW0. If you have not watched 
lecture 2, do so now. The code that I built during that lecture can be found at this link. 
You do not need to fully understand the contents of lecture 2 to begin this assignment. 
Indeed, the main purpose of this project is to help you build some comfort with the material in 
that lecture.

Unlike later projects, this assignment has a great deal of scaffolding. Future assignments will 
require significantly more independence. For this project, you may work in pairs. To work in a 
pair, you must read the collaboration guide and fill out the partner request form linked in the 
partnership guide. You do not need to wait for our approval to begin as long as you meet the 
requirements for partnerships. If you work with someone who is more experienced, you are likely to 
miss lots of important subtleties, which will be painful later when you start working on your own 
(i.e. the entire second half of the course).

All that said, your goal for this project is to write a program simulating the motion of N objects 
in a plane, accounting for the gravitational forces mutually affecting each object as demonstrated
by Sir Issac Newton's Law of Universal Gravitation.

Ultimately, you will be creating a program NBody.java that draws an animation of bodies floating 
around in space tugging on each other with the power of gravity.

**/


public class Planet {

	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

	public Planet(double xP, double yP, double xV, double yV, double m, String img) {
		this.xxPos = xP;
		this.yyPos = yP;
		this.xxVel = xV;
		this.yyVel = yV;
		this.mass = m;
		this.imgFileName = img;	
	}

	public double calcDistance(Planet p) {
		return Math.sqrt(Math.pow(p.xP - this.xP, 2) + Math.pow(p.yP - this.yP, 2));
	}

	public double calcForceExertedBy(Planet p) {
		double G = 6.67 E-11;
		double rSquare = Math.pow(this.calcDistance(p), 2);
		return G * other.m * this. m / rSquare;
	}

	public double calcForceExertedByX(Planet p) {
		double F = this.calcForceExertedBy(p);
		return F * (p.xP - this.xP) / this.calcDistance(p);
	}

	public double calcForceExertedByY(Planet p) {
		double F = this.calcForceExertedBy(p);
		return F * (p.yP - this.yP) / this.calcDistance(p);
	}

	public void calcNetForceExertedByX (Planet[] planets) {
		this.xNetForce = 0;
		for (Planet curr : planets) {
			if (curr.x != this.x) {
				this.xNetForce += this.calcForceExertedByX(curr);
			}
		}
	}

	public void calcNetForceExertedByY (Planet[] planets) {
		this.yNetForce = 0;
		for (Planet curr : planets) {
			if (curr.y != this.y) {
				this.yNetForce += this.calcForceExertedByY(curr);
			}
		}
	}

	pulbic void update(double dt) {
		// acceleration => a_x or a_y =  (F_x or F_y) / m
		this.xA = xNetForce / this.mass;
		this.yA = yNetForce / this.mass;
		this.xxVel +=  dt * this.xA;
		this.yyVel += dt * this.yA;
		this.xxPos += dt * this.xxVel;
		this.yyPos += dt * this.yyVel;
	}

	public void draw() {
		StdDraw.picture(x, y, "images/" + imgFileName)
	}
}