import { Component, OnInit } from '@angular/core';
import { Hero } from '../models/hero';
import { HeroService } from '../hero.service';

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {

  /**
  * @description Array to hold object of type Hero
  **/
  heroes : Hero[];

  /**
  * @description The variable to hold the selected Hero on the view.
  **/
  selectedHero : Hero;


  constructor(private heroService : HeroService) { }

  ngOnInit() {
    this.getHeroes();
  }

  getHeroes() : void {
    this.heroService.getHeroes()
      .subscribe(heroes => this.heroes = heroes);
  }

  onSelect(hero : Hero) : void {
    this.selectedHero = hero
  }
}
