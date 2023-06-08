/**
 * 기존 비밀번호, 새 비밀번호, 새 비밀번호 내용 비어있지 않도록 확인
 * 새 비밀번호와 새 비밀번호확인 동일한가?
 */

const form = document.querySelector("form");

form.addEventListener("submit", (e)=>{
	e.preventDefault();
	
	const curpwd = document.querySelector("#floatingPassword1");
	const newpwd = document.querySelector("#floatingPassword2");
	const confirmpwd = document.querySelector("#floatingPassword3");
	
		if(curpwd.value === ""){
		alert("기존 비밀번호를 확인해주세요.");
		curpwd.select();
		return;
	}else if(newpwd.value === ""){
		alert("새로운 비밀번호 확인해주세요.");
		newpwd.select();
		return;
	}else if(confirmpwd.value === ""){
		alert("새로운 비밀번호를 다시 확인해주세요.");
		confirmpwd.select();
		return;
	}
	
	if(newpwd.value !== confirmpwd.value){
		alert("새 비밀번호와 새 비밀번호 확인이 일치하지 않습니다.");
		confirmpwd.select();
		return;
	}
	
	form.submit();
})
