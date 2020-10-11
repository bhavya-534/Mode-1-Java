function checkPhone(e) 
{ 
    var phone = document.forms['vform']['phone'];
	var phone_error = document.getElementById('phone_error');
	
    if (phone.value.length != 10) 
	{
		phone.style.border = "1px solid red";
		document.getElementById('phone_id').style.color = "red";
		phone_error.innerHTML = "**Mobile number length must be 10**";
		return false;
    }
}

function checkPassword(e) 
{ 
    var password_student = document.forms['vform']['password_student'];
	var password_error = document.getElementById('password_error');
	
    if (password_student.value.length <= 5) 
	{
		password_student.style.border = "1px solid red";
		document.getElementById('password_id').style.color = "red";
		password_error.innerHTML = "**Password length must be greater thaan 5**";
		return false;
    }
	
}

function checkConfirmpassword(e) 
{ 
    var password_student = document.forms['vform']['password_student'];
	var confirmpassword = document.forms['vform']['confirmpassword'];
	var confirmpassword_error = document.getElementById('confirmpassword_error');
	
	if(password_student.value != confirmpassword.value)
	{
		confirmpassword.style.border = "1px solid red";
		document.getElementById('confirmpassword_id').style.color = "red";
		confirmpassword_error.innerHTML = "**Password and Confirm Password does not match**";
		return false;
    }
}

function checkPin(e)
{
	var pin = document.forms['vform']['pin'];
	var pin_error = document.getElementById('pin_error');
	
	if (pin.value.length != 6) 
	{
		pin.style.border = "1px solid red";
		document.getElementById('pin_id').style.color = "red";
		pin_error.innerHTML = "**PIN code length must be 6**";
		return false;
	}
}

function checkFirstname(e) 
{
	var firstname = document.forms['vform']['firstname'];
	var firstname_error = document.getElementById('firstname_error');
	var letters = /^[A-Za-z]+$/;
	
	if(firstname.value.match(letters))
	{
		return true;
	}
	else
	{
	  firstname.style.border = "1px solid red";
	  document.getElementById('firstname_id').style.color = "red";
  	  firstname_error.innerHTML = "**Letters must be an alphabets**";
  	  return false;
	}
}

function checkLastname(e) 
{
	var lastname = document.forms['vform']['lastname'];
	var lastname_error = document.getElementById('lastname_error');
	var letters = /^[A-Za-z]+$/;
	
	if(lastname.value.match(letters))
	{
		return true;
	}
	else
	{
	  lastname.style.border = "1px solid red";
	  document.getElementById('lastname_id').style.color = "red";
  	  lastname_error.innerHTML = "**Letters must be an alphabets**";
  	  return false;
	}
}

