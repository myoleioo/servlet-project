/**
 * 
 */
	function checkForm() {  
		console.log("1")
       // let username=document.getElementById("userName").value;
       // let email=document.getElementById("email").value; 
        let pw1 = document.getElementById("pass").value;  
        let pw2 = document.getElementById("cpass").value;  
         
        if(pw1 == "") {  
          document.getElementById("message1").innerHTML = "Enter the password please!";  
          return false;  
        }  
        
        if(pw1.length < 8) {  
          document.getElementById("message1").innerHTML = "Password length must be at least 8 characters";  
          return false;  
        }  
      
        
        if(pw2 == "") {  
          document.getElementById("message2").innerHTML = "Enter the comfirmpassword please!";  
          return false;  
        }   
          
        
        if(pw1 != pw2) {  
          document.getElementById("message2").innerHTML = "Passwords are not same";  
          return false;  
        } else {  
          alert ("Your password created successfully");  
            
        } 
         
     }
//     function validateForm() {   
//	   if(document.getElementById("userName").value=="" || document.getElementById("email").value=="" || document.getElementById("pass").value=="" || document.getElementById("cpass").value==""){
//	                alert("Please Fill the RegisterForm");
//	                return false;
//	            }
//	            else{
//	                alert("Register Successful");
//	            }
//     }   
        
