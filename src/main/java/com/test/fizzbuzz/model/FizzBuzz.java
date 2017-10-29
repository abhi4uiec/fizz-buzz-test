package com.test.fizzbuzz.model;

import java.util.LinkedList;

public class FizzBuzz {

	private LinkedList<Integer> fizzList;

	private LinkedList<Integer> buzzList;

	private LinkedList<Integer> fizzBuzzList;

	public FizzBuzz() 
	{
		fizzList=new LinkedList<Integer>();
		buzzList=new LinkedList<Integer>();
		fizzBuzzList=new LinkedList<Integer>();
	}

	public FizzBuzz(LinkedList<Integer> fizzList, LinkedList<Integer> buzzList, LinkedList<Integer> fizzBuzzList) {
		super();
		this.fizzList = fizzList;
		this.buzzList = buzzList;
		this.fizzBuzzList = fizzBuzzList;
	}

	public LinkedList<Integer> getFizzList() 
	{
		return fizzList;
	}

	public LinkedList<Integer> getBuzzList() {
		return buzzList;
	}

	public LinkedList<Integer> getFizzBuzzList() {
		return fizzBuzzList;
	}

	public void setFizzList(LinkedList<Integer> fizzList) {
		this.fizzList = fizzList;
	}

	public void setBuzzList(LinkedList<Integer> buzzList) {
		this.buzzList = buzzList;
	}

	public void setFizzBuzzList(LinkedList<Integer> fizzBuzzList) {
		this.fizzBuzzList = fizzBuzzList;
	}

	@Override
	public String toString() {
		return "FizzBuzz [fizzList=" + fizzList + ", buzzList=" + buzzList + ", fizzBuzzList=" + fizzBuzzList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buzzList == null) ? 0 : buzzList.hashCode());
		result = prime * result + ((fizzBuzzList == null) ? 0 : fizzBuzzList.hashCode());
		result = prime * result + ((fizzList == null) ? 0 : fizzList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FizzBuzz other = (FizzBuzz) obj;
		if (buzzList == null) {
			if (other.buzzList != null)
				return false;
		} else if (!buzzList.equals(other.buzzList))
			return false;
		if (fizzBuzzList == null) {
			if (other.fizzBuzzList != null)
				return false;
		} else if (!fizzBuzzList.equals(other.fizzBuzzList))
			return false;
		if (fizzList == null) {
			if (other.fizzList != null)
				return false;
		} else if (!fizzList.equals(other.fizzList))
			return false;
		return true;
	}

}
