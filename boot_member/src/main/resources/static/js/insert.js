/**
 * form이 submit 되기 전 확인, 유효성 검증
 * 
 * 1) 내용은 비어 있지 않아야 함(단, description은 제외)
 * 2) 코드는 무조건 4자리 입력되었는지 확인
 * 3) 가격은 숫자로 입력되었는지 확인
 * 
 * 1,2,3이 만족한다면 form submit 하기 
 * 
 * js에서 에러가 난 곳을 보기 위해서는 f12번의 콘솔 -> 없으면 소스에서 확인
 */

document.querySelector(".btn-success").addEventListener("click",()=>location.href=path);

const form = document.querySelector("form");

form.addEventListener("submit", (e)=>{
	e.preventDefault();
	
	const code = document.querySelector("#code");
	const title = document.querySelector("#title");
	const writer = document.querySelector("#writer");
	const price = document.querySelector("#price");
	
	if(code.value === "" || code.value.length !== 4 || isNaN(code.value)){
		alert("코드를 확인해주세요.");
		code.select();
		return;
	}else if(title.value === ""){
		alert("도서명을 확인해주세요.");
		title.select();
		return;
	}else if(writer.value === ""){
		alert("저자명을 확인해주세요.");
		writer.select();
		return;
	}else if(price.value === "" || isNaN(price.value)){
		alert("가격을 확인해주세요.");
		price.select();
		return;
	}
	
	form.submit();
})

 