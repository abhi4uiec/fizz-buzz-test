package com.test.fizzbuzz.model;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private List<Integer> fizzList;

	private List<Integer> buzzList;

	private List<Integer> fizzBuzzList;

	public FizzBuzz() 
	{
		fizzList=new ArrayList<Integer>();
		buzzList=new ArrayList<Integer>();
		fizzBuzzList=new ArrayList<Integer>();
	}

	public FizzBuzz(List<Integer> fizzList, List<Integer> buzzList, List<Integer> fizzBuzzList) {
		super();
		this.fizzList = fizzList;
		this.buzzList = buzzList;
		this.fizzBuzzList = fizzBuzzList;
	}

	public List<Integer> getFizzList() 
	{
		return fizzList;
	}

	public List<Integer> getBuzzList() {
		return buzzList;
	}

	public List<Integer> getFizzBuzzList() {
		return fizzBuzzList;
	}

	public void setFizzList(List<Integer> fizzList) {
		this.fizzList = fizzList;
	}

	public void setBuzzList(List<Integer> buzzList) {
		this.buzzList = buzzList;
	}

	public void setFizzBuzzList(List<Integer> fizzBuzzList) {
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
