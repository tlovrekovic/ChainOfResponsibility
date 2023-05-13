package com.tlovrekovic.corExample.entity;

import com.tlovrekovic.corExample.entity.CodingSkills;

public class MidSkills extends CodingSkills {
    private static final double SKILL = BASE*40;

    @Override
    public void checkComplexity(com.tlovrekovic.corExample.entity.Task task){
        if (task.getComplexity() <= SKILL){
            System.out.println("The Mid will do it");
        }else if (nextInLine !=null){
            nextInLine.checkComplexity(task);
        }
    }
}
