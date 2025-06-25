    const refreshBtn = document.getElementById("btnRefresh");

    function handleClick() {
      window.location.reload();
    }

    refreshBtn.addEventListener("click", handleClick);

    document.querySelectorAll('td').forEach(td => {
      td.addEventListener('click', () => {
        navigator.clipboard.writeText(td.textContent.trim())
      });
    });

   