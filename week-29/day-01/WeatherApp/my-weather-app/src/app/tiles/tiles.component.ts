import { Component, OnInit } from '@angular/core';
import {Tile} from '../tile';
import {TILES} from '../tiles-mock';

@Component({
  selector: 'app-tiles',
  templateUrl: './tiles.component.html',
  styleUrls: ['./tiles.component.css']
})
export class TilesComponent implements OnInit {

tiles = TILES;
selectedTile : Tile;

constructor() { }

ngOnInit() {
}

}
