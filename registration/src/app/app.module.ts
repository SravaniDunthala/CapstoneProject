import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { CustomerRegComponent } from './customer-reg/customer-reg.component';
import { HelpComComponent } from './help-com/help-com.component';
import { HttpClientModule } from '@angular/common/http';
import { CustomerListComponent } from './customer-list/customer-list.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CustomerRegComponent,
    HelpComComponent,
    CustomerListComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
