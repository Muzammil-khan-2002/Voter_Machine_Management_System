import java.util.*;
class Ward
{
	int wid;
	String wname;
	
	public void setWid(int wid)
	{
		this.wid=wid;
	}
	public int getWid()
	{
		return wid;
	}
	public void setWname(String wname)
	{
		this.wname=wname;
	}
	public String getWname()
	{
		return wname;
	}
	
	Voter v[];
	
	void setVoter(Voter v[])
	{
		this.v=v;
	}
	
	Voter []getVoter()
	{
		return v;
	}
}

class Voter
{
	int vid;
	String vname;
	int vage;
	
	public void setVid(int vid)
	{
		this.vid=vid;
	}
	public int getVid()
	{
		return vid;
	}
	public void setVname(String vname)
	{
		this.vname=vname;
	}
	public String getVname()
	{
		return vname;
	}
	public void setVage(int vage)
	{
		this.vage=vage;
	}
	public int getVage()
	{
		return vage;
	}
}

class VoterMachine
{
	Ward w[];
	Voter v[];
	
	void setMachine(Ward w[],Voter v[])
	{ 
		this.w=w;
		this.v=v;
	}
	
	void showVotingCount()
{
    for (int i = 0; i < w.length; i++)
    {
        System.out.println("Ward-Id: " + w[i].getWid() + " Ward-Name: " + w[i].getWname());
        System.out.println("----------------------------------------------------------------");
        System.out.println("Voter-Id\t\tVoter-Name\t\t\tVoter-Age");
        
        // Get the voters for the specific ward
        Voter[] voters = w[i].getVoter();
        
        // Print the voters of this ward
        for (int j = 0; j < voters.length; j++)
        {
            System.out.println(voters[j].getVid() + "\t\t" + voters[j].getVname() + "\t\t\t" + voters[j].getVage());
        }
        System.out.println();  // Print a blank line between wards
    }
}

}

public class VoterMachineApp
{
	public static void main(String args[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("Enter Total Ward?\t");
		int totalW=xyz.nextInt();
		
		VoterMachine VM=new VoterMachine();
		
		 Ward w[]=new Ward[totalW];
		 
		for(int i=0;i<totalW;i++)
		{
			w[i]=new Ward();
			Scanner abc=new Scanner(System.in);
			System.out.println("Enter Ward Id:\t");
			int wid=abc.nextInt();
			abc.nextLine();
			System.out.println("Enter Ward Name:\t");
			String wname=abc.nextLine();
			
			w[i].setWid(wid);
			w[i].setWname(wname);
			
			
			System.out.println("Enter Total Voter In, "+w[i].wname);
			int totalV=abc.nextInt();
			Voter v[]=new Voter[totalV];
			for(int j=0;j<totalV;j++)
			{
				v[j]=new Voter();
				System.out.println("Enter Voter Id:\t");
				int vid=abc.nextInt();
				abc.nextLine();
				System.out.println("Enter Voter Name:\t");
				String vname=abc.nextLine();
				System.out.println("Enter Voter Age:\t");
				int vage=abc.nextInt();
				
				v[j].setVid(vid);
				v[j].setVname(vname);
				v[j].setVage(vage);
			}
			
			w[i].setVoter(v);
			VM.setMachine(w,v);

		}
					VM.showVotingCount();		
	}
}