/**
 *
 */

const form = document.querySelector("#openForm");

// 삭제 버튼 클릭 시 openForm 보내기
// /board/remove 전송
document.querySelector(".btn-danger").addEventListener("click", () => {
  form.action = "/board/remove";
  form.submit();
});

// 목록 버튼 클릭 시
// /board/list 전송
// bno 제거
document.querySelector(".btn-secondary").addEventListener("click", () => {
  form.firstElementChild.remove();
  form.action = "/board/list";
  form.submit();
});
