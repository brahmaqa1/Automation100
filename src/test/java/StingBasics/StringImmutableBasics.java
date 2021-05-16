package StingBasics;

public class StringImmutableBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Ramu";
		String s2 =  new String ("Ramu") ;
		String s3 = "Ramu";
		String s4= new String ("Ramu");
		System.out.println("same objects. s1="+ s1.hashCode() + ", s2="+s2.hashCode() + ",s3"+s3.hashCode()+",s4="+s4.hashCode());
		s1=s1.concat("raju");
		System.out.println("same objects. s1="+ s1.hashCode() + ", s2="+s2.hashCode() + ",s3"+s3.hashCode()+",s4="+s4.hashCode());
		
		if(s1==s2)
		{
			System.out.println("same objects. s1="+ s1.hashCode() + ", s2="+s2.hashCode() + ",s3"+s3.hashCode()+",s4="+s4.hashCode());
			
		}
		else
		{
			System.out.println("same objects. s1="+ s1.hashCode() + ", s2="+s2.hashCode() + ",s3"+s3.hashCode()+",s4="+s4.hashCode());
		}
		

	}

}
