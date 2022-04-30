package emplo;

public class empset {
	 public void emp() {
		System.out.println(" employe enternd  ");
	}
	String empname;
    String empfamily ;
    int empage ;
    String empusername;
    String emppass;
    int leveldaryaft;
   void setname( String empname){
	   System.out.println(" enter name");
	   this.empname=empname;
	   System.out.println("set name done");
   }
   void setfamily( String empfamil, String empfamily) {
	   System.out.println(" enter family");
	   this.empfamily=empfamily;
	   System.out.println("set family done");
   }
   void setage( int  empage) {
	   System.out.println(" enter age");
	   this.empage=empage;
	   System.out.println("set age done");
   }
   void setusername(String empusername ) {
	   System.out.println("enter user name :");
	   this.empusername=empusername;
	   System.out.println("set username done ");
   }
    void setpassword(String emppass) {
    	System.out.println("enter password (password should be mor than 6 chars");
    	if(emppass.length()>6) {
    		this.emppass=emppass;
    	System.out.println("set  pass word done ");
    	}else {
    		System.out.println("try again");
    	}
    }
 Boolean entercheckemp(String empusername,String emopass){
	 if (empusername==this.empusername&& emppass==this.emppass) {
		return  true;
	 }else 
	 {
		 return false;
	 }
	 
 }
 void empeditname (String newname) {
	 String lastsetname=this.empname;
	 this.empusername=newname;
	 System.out.println("editing name done !");
 }
 void empeditfamily(String newfamily ) {
	 String lastsetfamily=this.empfamily;
	 this.empusername=newfamily;
	 System.out.println("editing family done !");
 }
 void empeditage(int  newage ) {
	 int  lastsetage=this.empage;
	 this.empage=newage;
	 System.out.println("editing age done !");
 }
 void empeditleveldaryaft(int newdaryaft) {
	 int lastdaryaft=this.leveldaryaft;
	 this.leveldaryaft=newdaryaft;
	 System.out.println(" editing daryaf done!");
 }
 void empeditusername(String newusername) {
	 String lastusername=this.empusername;
	 if(this.empusername==newusername) {
		 System.out.println(" that was totaly look like last one try again!");
	 }else {
		 this.empusername=newusername;
		 System.out.println("editing username done!");
	 }
 }
 void edmeditingpass(String newpas) {
	 String lastpass=this.emppass;
	 if(newpas==this.emppass) {
		 System.out.println('unable to do .plesetry new one');
	 }
	 else {
		 if (newpas.length()>6) {
			this.emppass=newpas;
			System.out.println("editing password done");
		}else
			System.out.println("try again!!");
	 }
 }
 

    
}
