import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TilesComponent } from './tiles/tiles.component';
import { Forecast5daysComponent } from './forecast5days/forecast5days.component';

@NgModule({
  declarations: [
    AppComponent,
    TilesComponent,
    Forecast5daysComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
