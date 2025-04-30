import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';              // 🔥 Add this
import { RouterModule, Routes } from '@angular/router';    // 🔥 Add this

import { AppComponent } from './app.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';

// Define Routes
const routes: Routes = [
  { path: '', redirectTo: '/admin-login', pathMatch: 'full' },
  { path: 'admin-login', component: AdminLoginComponent },
  { path: 'admin-dashboard', component: AdminDashboardComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    AdminDashboardComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,                     
    RouterModule.forRoot(routes)     
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
