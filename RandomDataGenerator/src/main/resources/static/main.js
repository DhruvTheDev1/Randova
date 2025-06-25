const refreshBtn = document.getElementById("btnRefresh");

function handleClick() {
  window.location.reload();
}

refreshBtn.addEventListener("click", handleClick);

const copyAlert = document.querySelector('.copied');

document.querySelectorAll('td').forEach(td => {
  td.addEventListener('click', () => {
    navigator.clipboard.writeText(td.textContent.trim()).then(() => {
      copyAlert.classList.add('show');
      setTimeout(() => {
        copyAlert.classList.remove('show');
      }, 1200);
    });
  });
});
