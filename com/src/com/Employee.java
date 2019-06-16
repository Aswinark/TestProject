package com;
	public class Employee {
        private String firstName;
        private String lastName;
        private String companyName;
        private String address;
        private String city;
        private String country;
        private String state;
        private String zip;
        private String phone1;
        private String phone2;
        private String email;
        private String web;
        
        public Employee(String firstName,String lastName,String companyName,String address,String city,String country,String state,String zip,String phone1,String phone2,String email,String web)
        {
     	   this.firstName=firstName;
     	   this.lastName=lastName;
     	   this.companyName=companyName;
     	   this.address=address;
     	   this.city=city;
     	   this.country=country;
     	   this.state=state;
     	   this.zip=zip;
     	   this.phone1=phone1;
     	   this.phone2=phone2;
     	   this.email=email;
     	   this.web=web;
        }
        
        public void setfirstName(String firstName)
        {
     	   this.firstName=firstName;
        }
        public String getfirstName()
        {
     	   return firstName;
        }
        public void setlastName(String lastName)
        {
     	   this.lastName=lastName;
        }
        public String getlastName()
        {
     	   return lastName;
        }
        public void setcompanyName(String companyName)
        {
     	   this.companyName=companyName;
        }
        public String getcompanyName()
        {
     	   return companyName;
        }
        public void setaddress(String address)
        {
     	   this.address=address;
        }
        public String getaddress()
        {
     	   return address;
        }
        public void setcity(String city)
        {
     	   this.city=city;
        }
        public String getcity()
        {
     	   return city;
        }
        public void setcountry(String country)
        {
     	   this.country=country;
        }
        public String getcountry()
        {
     	   return country;
        }
        public void setstate(String state)
        {
     	   this.state=state;
        }
        public String getstate()
        {
     	   return state;
        }
        public void setzip(String zip)
        {
     	   this.zip=zip;
        }
        public String getzip()
        {
     	   return zip;
        }
        public void setphone1(String phone1)
        {
     	   this.phone1=phone1;
        }
        public String getphone1()
        {
     	   return phone1;
        }
        public void setphone2(String phone2)
        {
     	   this.phone2=phone2;
        }
        public String getphone2()
        {
     	   return phone2;
        }
        public void setemail(String email)
        {
     	   this.email=email;
        }
        public String getemail()
        {
     	   return email;
        }
        public void setweb(String web)
        {
     	   this.web=web;
        }
        public String getweb()
        {
     	   return web;
        }
        public String toString()
        {
        	return firstName+lastName+companyName+address+city+country+state+zip+phone1+phone2+email+web;
        }

}
