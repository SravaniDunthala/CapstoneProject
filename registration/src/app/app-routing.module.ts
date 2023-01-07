import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CustomerListComponent } from './customer-list/customer-list.component';
import { CustomerRegComponent } from './customer-reg/customer-reg.component';
import { HelpComComponent } from './help-com/help-com.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {
    path: 'customer',
    pathMatch: 'full',
    component: CustomerRegComponent,
  },
  {
    path: 'help',
    pathMatch: 'full',
    component: HelpComComponent,
  },
  {
    path:'customerlist',
    component:CustomerListComponent
  },
  {
    path: '**',
    component: HomeComponent,
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
