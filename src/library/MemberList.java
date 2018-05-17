package library;


import java.util.ArrayList;


class MemberList {
	private ArrayList<Member> Members;
	private int id=0;	
	
	 MemberList()
	{
		ArrayList<Member> mList = new ArrayList<Member>();
		this.Members = mList;
	}
	
	
	
	 void addNewMember(String n,String s,String add,int contact)	//function to create new member
	{
		id++;
		Member newGuy = new Member(n,s,add,contact,id);
		Members.add(newGuy);
	}
	
	ArrayList<Member> getAL()	//returning Members arraylist
	{
		return this.Members;
	}
	
	
}
