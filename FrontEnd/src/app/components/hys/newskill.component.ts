import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Skill } from 'src/app/model/skill';
import { SkillService } from 'src/app/service/skill.service';

@Component({
  selector: 'app-newskill',
  templateUrl: './newskill.component.html',
  styleUrls: ['./newskill.component.css']
})
export class NewskillComponent implements OnInit {
  progreso: number;
  img:string;

  constructor(private skillS:SkillService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate():void{
    const skill = new Skill(this.img, this.progreso);
    this.skillS.save(skill).subscribe(
      data=>{
        alert("Skill añadida de forma exitosa!");
        this.router.navigate(['']);
      }, err=>{
        alert("Error al añadir skill");
        this.router.navigate(['']);
      }
    )
  }
}
