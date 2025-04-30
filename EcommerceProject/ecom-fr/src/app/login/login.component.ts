// login.component.ts
import { Component } from '@angular/core';
import { Router } from '@angular/router';  // Import Router for navigation
import { AuthService } from '../auth.service';  // Import AuthService to handle login

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  user = {
    username: '',
    password: ''
  };

  constructor(private authService: AuthService, private router: Router) {}

  // This method will be called when the form is submitted
  onSubmit(): void {
    this.authService.login(this.user).subscribe(
      (response) => {
        console.log('Login successful', response);
        this.router.navigate(['/dashboard']);  // Redirect to a dashboard (example route)
      },
      (error) => {
        console.error('Login failed', error);
        alert('Invalid username or password!');
      }
    );
  }
}
