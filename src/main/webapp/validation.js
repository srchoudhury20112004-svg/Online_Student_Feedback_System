// Simple form validation
document.getElementById('loginForm').addEventListener('submit', function(e) {
    const username = document.getElementById('username').value.trim();
    const password = document.getElementById('password').value.trim();

    if (username === '' || password === '') {
        alert('Please fill in all fields');
        e.preventDefault();
    }
});

document.getElementById('feedbackForm').addEventListener('submit', function(e) {
    const subject = document.getElementById('subject').value.trim();
    const message = document.getElementById('message').value.trim();

    if (subject === '' || message === '') {
        alert('Please fill in all fields');
        e.preventDefault();
    }
});