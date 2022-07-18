package com.alkeon.Born;

class Calculatr {
	public int add(int i,int j) {
		return i+j;
	}}
	class calcadv extends Calculatr{
		public int sub(int l,int n) {
			return l-n;
		}}
	public class Calculator{
	public static void main(String[] args) {
		calcadv obj=new calcadv();
		int result1=obj.add(5, 7);
		int result2=obj.sub(8, 4);
		System.out.println(result1);
		System.out.println(result2);


}}
