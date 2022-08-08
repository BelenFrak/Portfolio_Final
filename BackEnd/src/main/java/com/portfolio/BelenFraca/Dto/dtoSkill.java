
package com.portfolio.BelenFraca.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSkill {
    @NotBlank
    private String img;
    @NotBlank
    private int progreso;

    public dtoSkill() {
    }

    public dtoSkill(String img, int progreso) {
        this.img = img;
        this.progreso = progreso;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }
 
    
    
}