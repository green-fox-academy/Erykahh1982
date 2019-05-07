import { FORCASTTILES } from './../mock-detail';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-forecast5days',
  templateUrl: './forecast5days.component.html',
  styleUrls: ['./forecast5days.component.css']
})
export class Forecast5daysComponent implements OnInit {

  forecast = FORCASTTILES;
  city = FORCASTTILES[0].city;

  constructor() { }

  ngOnInit() {
  }

}
